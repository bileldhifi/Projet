const User = require("../models/User"); // Import the User model

// Create a new user with file upload
exports.createUser = async (req, res) => {
  try {
    const { firstName, lastName, age, phone, email, password, aboutme, address } = req.body;
    const photo = req.file ? req.file.originalname : null; // Get the uploaded file name
    const data = { firstName, lastName, age, phone, email, password, aboutme, photo, address };
    const user = new User(data);
    const createdUser = await user.save();
    res.status(201).json({ message: "User successfully created", user: createdUser });
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
};

// Retrieve all users from the database
exports.getAllUsers = async (req, res) => {
  try {
    const users = await User.find();
    res.status(200).json({ message: "Users successfully fetched", users });
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
};

// Retrieve a single user by ID
exports.getUserById = async (req, res) => {
  try {
    const id = req.params.id;
    const user = await User.findById(id);
    if (!user) {
      return res.status(404).json({ error: "User not found" });
    }
    res.status(200).json({ message: "User successfully fetched", user });
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
};

// Delete all users from the database
exports.deleteAllUsers = async (req, res) => {
  try {
    const users = await User.deleteMany();
    res.status(200).json({ message: "Users successfully deleted", users });
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
};

// Delete a single user by ID
exports.deleteUserById = async (req, res) => {
  try {
    const id = req.params.id;
    const user = await User.findOneAndDelete({ _id: id });
    if (!user) {
      return res.status(404).json({ error: "User not found" });
    }
    res.status(200).json({ message: "User successfully deleted", user });
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
};

// Update a user's details by ID
exports.updateUserById = async (req, res) => {
  try {
    const id = req.params.id;
    const { firstName, lastName, age, phone, email, password, aboutme, address } = req.body;
    const data = { firstName, lastName, age, phone, email, password, aboutme, address };
    const user = await User.findOneAndUpdate({ _id: id }, data, { new: true });
    if (!user) {
      return res.status(404).json({ error: "User not found" });
    }
    res.status(200).json({ message: "User successfully updated", user });
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
};
