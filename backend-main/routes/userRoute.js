const express = require("express");
const router = express.Router();
const User = require("../models/User"); // link model
const multer = require("multer");

const storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, "./uploads/");
  },
  filename: function (req, file, cb) {
    cb(null, file.originalname);
  },
});
const upload = multer({ storage: storage });

// Create a user with file upload
router.post("/create", upload.single("photo"), async (req, res) => {
  try {
    const { firstName, lastname, age, phone, email, password, aboutme, adress } = req.body;
    const photo = req.file ? req.file.originalname : null; // Get the uploaded file name

    const data = {
      firstName,
      lastname,
      age,
      phone,
      email,
      password,
      aboutme,
      photo, // Assign the uploaded photo's filename to the 'photo' field
      adress,
    };

    const usr = new User(data);
    const created = await usr.save();
    res.status(200).json({ message: "User successfully created", user: created });
  } catch (err) {
    res.status(404).json({ error: err });
  }
});

// Get all users
router.get("/getall", async (req, res) => {
  try {
    const users = await User.find();
    res.status(200).json({ message: "Users successfully fetched", users });
  } catch (err) {
    res.status(404).json({ error: err });
  }
});

// Get user by ID
router.get("/getbyname/:id", async (req, res) => {
  try {
    const id = req.params.id;
    const user = await User.findById(id);
    res.status(200).json({ message: "User successfully fetched", user });
  } catch (err) {
    res.status(404).json({ error: err });
  }
});


// Delete all users
router.delete("/delall", async (req, res) => {
  try {
    const users = await User.deleteMany();
    res.status(200).json({ message: "Users successfully deleted", users });
  } catch (err) {
    res.status(404).json({ error: err });
  }
});

// Delete user by ID
router.delete("/del/:id", async (req, res) => {
  try {
    const id = req.params.id;
    const user = await User.findOneAndDelete({ _id: id });
    res.status(200).json({ message: "User successfully deleted", user });
  } catch (err) {
    res.status(404).json({ error: err });
  }
});


// Update user by ID
router.put("/update/:id", async (req, res) => {
  try {
    const id = req.params.id;
    const { firstName, lastname, age, phone, email, password, aboutme, adress } = req.body;
    const data = {
      firstName,
      lastname,
      age,
      phone,
      email,
      password,
      aboutme,
      adress,
    };
    const user = await User.findOneAndUpdate({ _id: id }, data, { new: true });
    res.status(200).json({ message: "User successfully updated", user });
  } catch (err) {
    res.status(404).json({ error: err });
  }
});

module.exports = router;
