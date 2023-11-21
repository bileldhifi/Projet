const express = require("express");
const router = express.Router();
const userController = require("../controller/location"); // Adjust the path as per your directory structure

router.post("/create", userController.createUser);
router.post("/call", userController.makeCall);
router.get("/getall", userController.getAllUsers);
router.get("/getbyname/:name", userController.getUserByName);
router.delete("/delete/:name", userController.deleteUserByName);
router.delete("/delete/:id", userController.deleteUserById);
router.put("/updates/:id", userController.updateUser);

module.exports = router;
