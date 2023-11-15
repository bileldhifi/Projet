const multer = require('multer');
const path = require("path");
const storage = multer.diskStorage({
    destination: (req, files, cb) => {
        cb(null, path.join(`./uploads`));
    },
    filename: (req, file, cb) => {
        cb(null, new Date().toISOString().replace(/:/g, '-') + '-' + file.originalname);
    }
});
exports.uploadMultiple = (req, res) => {
    if (req.files.length) {
        console.log(req.files)

        req.flash('success', 'Files Uploaded.');
    }
    return res.redirect('/');
}

const filefilter = (req, files, cb) => {
    if (files.mimetype === 'image/png' || files.mimetype === 'image/jpg' 
        || files.mimetype === 'image/jpeg'){
            cb(null, true);
        }else {
            cb(null, false);
        }
}

const upload = multer({storage: storage, fileFilter: filefilter});

module.exports = {upload}