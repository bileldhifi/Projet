const express = require("express");
const router = express.Router();
const multer = require("multer");
const userController = require("../controller/userController"); // Import the user controller

// Configure multer for file uploading
const storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, "./uploads/");
  },
  filename: function (req, file, cb) {
    cb(null, file.originalname);
  },
});
const upload = multer({ storage: storage });

// User routes with error handling
router.post("/users", upload.single("photo"), async (req, res) => {
  try {
    await userController.createUser(req, res);
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
});

router.get("/users", async (req, res) => {
  try {
    await userController.getAllUsers(req, res);
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
});

router.get("/users/:id", async (req, res) => {
  try {
    await userController.getUserById(req, res);
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
});

router.delete("/users", async (req, res) => {
  try {
    await userController.deleteAllUsers(req, res);
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
});

router.delete("/users/:id", async (req, res) => {
  try {
    await userController.deleteUserById(req, res);
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
});

router.put("/users/:id", async (req, res) => {
  try {
    await userController.updateUserById(req, res);
  } catch (err) {
    console.error(err); // Log the error for debugging
    res.status(500).json({ error: "Internal server error" });
  }
});

module.exports = router; // Export the router for use in the main application file
