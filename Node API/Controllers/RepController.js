const Response = require('../Models/Response');

const handleSuccess = (res, message, status = 200) => {
    res.status(status).json({ message });
};

const handleNotFound = (res) => {
    res.status(404).json({ message: 'Response not found' });
};

const handleServerError = (res) => {
    res.status(500).json({ message: 'An error occurred!' });
};

const index = async (req, res) => {
    try {
        const reps = await Response.find();
        handleSuccess(res, reps);
    } catch (error) {
        handleServerError(res);
    }
}

const show = async (req, res) => {
    try {
        const rep = await Response.findById(req.params.Id_rec);
        if (rep) {
            handleSuccess(res, rep);
        } else {
            handleNotFound(res);
        }
    } catch (error) {
        handleServerError(res);
    }
}
const store = async (req, res) => {
    try {
        const repData = req.body;
        console.log('Received data:', repData);

        const rep = await Response.create(repData);
        handleSuccess(res, 'Response Added Successfully', 201);
    } catch (error) {
        handleServerError(res);
    }
}

const update = async (req, res) => {
    try {
        const repID = req.params.rep_id;
        const updateData = req.body;
        await Response.findByIdAndUpdate(repID, updateData);
        handleSuccess(res, 'Response updated successfully');
    } catch (error) {
        handleServerError(res);
    }
}
const destroy = async (req, res) => {
    try {
        const repID = req.params.rep_id;
        const deleteRec = await Response.findOneAndDelete({ _id: repID });
        if (deleteRec) {
            handleSuccess(res, 'Response Deleted successfully');
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
