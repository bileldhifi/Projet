const News = require('../Models/News');

const handleSuccess = (res, message, status = 200) => {
    res.status(status).json({ message });
};

const handleNotFound = (res) => {
    res.status(404).json({ message: 'News not found' });
};

const handleServerError = (res) => {
    res.status(500).json({ message: 'An error occurred!' });
};

const index = async (req, res) => {
    try {
        const recs = await News.find();
        handleSuccess(res, recs);
    } catch (error) {
        handleServerError(res);
    }
}

const show = async (req, res) => {
    try {
        const rec = await News.findById(req.params.news_id);
        if (rec) {
            handleSuccess(res, rec);
        } else {
            handleNotFound(res);
        }
    } catch (error) {
        handleServerError(res);
    }
}
const store = async (req, res) => {
    try {
        const recData = req.body;
        console.log('Received data:', recData);

        const rec = await News.create(recData);
        handleSuccess(res, 'News Added Successfully', 201);
    } catch (error) {
        handleServerError(res);
    }
}

const update = async (req, res) => {
    try {
        const recID = req.params.news_id;
        const updateData = req.body;
        await News.findByIdAndUpdate(recID, updateData);
        handleSuccess(res, 'News updated successfully');
    } catch (error) {
        handleServerError(res);
    }
}
const destroy = async (req, res) => {
    try {
        const recID = req.params.news_id;
        const deleteRec = await News.findOneAndDelete({ _id: recID });
        if (deleteRec) {
            handleSuccess(res, 'News Deleted successfully');
        } else {
            handleNotFound(res);
        }
    } catch (error) {
        handleServerError(res);
    }
}

module.exports = {
    index,
    show,
    store,
    update,
    destroy
};
