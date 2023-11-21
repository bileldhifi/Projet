const User = require("../models/Location"); // Adjust the path as per your directory structure
const client = require("twilio")(process.env.TWILIO_ACCOUNT_SID, process.env.TWILIO_AUTH_TOKEN);

// Create a new user
async function createUser(req, res) {
    try {
        let data = req.body;
        let usr = new User(data);
        let created = await usr.save();
        res.send(created);
    } catch (err) {
        res.send(err);
    }
}

// Make a phone call using Twilio
async function makeCall(req, res) {
    try {
        await client.calls.create({
            url: "http://demo.twilio.com/docs/voice.xml",
            to: "+21653962224",
            from: "+15169622311",
        });
        res.send({ message: "call done" });
    } catch (err) {
        res.send({ message: err });
    }
}

// Get all users
async function getAllUsers(req, res) {
    try {
        let users = await User.find();
        res.send(users);
    } catch (err) {
        res.send(err);
    }
}

// Get a user by name
async function getUserByName(req, res) {
    try {
        let name = req.params.name;
        let user = await User.findOne({ name: name });
        res.send(user);
    } catch (error) {
        res.send(error);
    }
}

// Delete a user by name
async function deleteUserByName(req, res) {
    try {
        let name = req.params.name;
        let user = await User.findOneAndDelete({ name: name });
        res.send(user);
    } catch (error) {
        res.send(error);
    }
}

// Delete a user by ID
async function deleteUserById(req, res) {
    try {
        let id = req.params.id;
        let user = await User.findOneAndDelete({ _id: id });
        res.send(user);
    } catch (error) {
        res.send(error);
    }
}

// Update a user
async function updateUser(req, res) {
    try {
        let id = req.params.id;
        let newData = req.body;
        let updatedUser = await User.findOneAndUpdate({ _id: id }, newData, { new: true });
        res.send(updatedUser);
    } catch (error) {
        res.send(error);
    }
}

module.exports = {
    createUser,
    makeCall,
    getAllUsers,
    getUserByName,
    deleteUserByName,
    deleteUserById,
    updateUser,
};
