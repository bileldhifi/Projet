const Reclamation = require('../Models/Reclamation');

const handleSuccess = (res, message, status = 200) => {
    res.status(status).json({ message });
};

const handleNotFound = (res) => {
    res.status(404).json({ message: 'Reclamation not found' });
};

const handleServerError = (res) => {
    res.status(500).json({ message: 'An error occurred!' });
};

const index = async (req, res) => {
    try {
        const recs = await Reclamation.find();
        handleSuccess(res, recs);
    } catch (error) {
        handleServerError(res);
    }
}

const show = async (req, res) => {
    try {
        const rec = await Reclamation.findById(req.params.Id_rec);
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

        const rec = await Reclamation.create(recData);
        handleSuccess(res, 'Reclamation Added Successfully', 201);
    } catch (error) {
        handleServerError(res);
    }
}

const update = async (req, res) => {
    try {
        const recID = req.params.Id_rec;
        const updateData = req.body;
        await Reclamation.findByIdAndUpdate(recID, updateData);
        handleSuccess(res, 'Reclamation updated successfully');
    } catch (error) {
        handleServerError(res);
    }
}
const destroy = async (req, res) => {
    try {
        const recID = req.params.rec_id;
        const deleteRec = await Reclamation.findOneAndDelete({ _id: recID });
        if (deleteRec) {
            handleSuccess(res, 'Reclamation Deleted successfully');
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
