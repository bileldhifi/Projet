const express = require("express");
const router = express.Router();
const User = require("../models/User"); // link model


router.post("/create", async (req, res) => {
  try {
    // data = req.body;
    const data = {firstName,lastname,age,phone,email,password,aboutme,photo,adress} = req.body;
    usr = new User(data);
    created = await usr.save();
    res.status(200).json({message:"user successfully created",user:created});
  } catch (err) {
    res.status(404).json({error:err});
  }
});

// async
router.get("/getall", async (req, res) => {
  try {
    usr = await User.find();
    // res.send(usr);
    res.status(200).json({message:"users successfully fetched",users:usr});
  } catch (err) {
    res.status(404).json({error:err});
  }
});
/// END async


///async
router.get("/getbyname/:id", async (req, res) => {
  try {
    id = req.params.name;
    usr = await User.findOne({ _id: id });
    res.status(200).json({message:"user successfully fetched",user:usr});
  } catch (erro) {
    res.status(404).json({error:err});
  }
});
/// end async

// sync
router.delete("/delall", async (req, res) => {
  try {
    usr = await User.deleteMany();
    res.status(200).json({message:"users successfully deleted",users:usr});
  } catch (err) {
    res.status(404).json({error:err});
  }
}),
router.delete("/del/:id", async (req, res) => {
  try {
    id = req.params.id;
    usr = await User.findOneAndDelete({ _id: id });
    res.status(200).json({message:"user successfully deleted",user:usr});
  } catch (err) {
    res.status(404).json({error:err});
  }
});
// end sync

router.put("/updates/:id", async (req, res) => {
  try {
    id = req.params.id;
    const newData ={firstName,lastname,age,phone,email,password,aboutme,photo,adress}=req.body;

    updated = await User.findOneAndUpdate({ _id: id }, newData);
    res.status(200).json({message:"user successfully updated",user:updated});
  } catch (err) {
    res.status(404).json({error:err});
  }
});



module.exports = router;
