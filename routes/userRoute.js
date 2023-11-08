const express = require("express");
const router = express.Router();
const User = require("../models/User"); // link model


router.post("/create", async (req, res) => {
  try {
    data = req.body;
    usr = new User(data);
    created = await usr.save();
    res.send(created);
  } catch (err) {
    res.send(err);  
  }
});

// async
router.get("/getall", async (req, res) => {
  try {
    usr = await User.find();
    res.send(usr);
  } catch (err) {
    res.send(err);
  }
});
/// END async


///async
router.get("/getbyname/:id", async (req, res) => {
  try {
    id = req.params.name;
    usr = await User.findOne({ _id: id });
    res.send(usr);
  } catch (erro) {
    res.send(erro);
  }
});
/// end async

// sync
router.delete("/del/:id", async (req, res) => {
  try {
    id = req.params.id;
    usr = await User.findOneAndDelete({ _id: id });
    res.send(usr);
  } catch (err) {
    res.send(err);
  }
});
// end sync

router.put("/updates/:id", async (req, res) => {
  try {
    id = req.params.id;
    newData = req.body;

    updated = await User.findOneAndUpdate({ _id: id }, newData);
    res.send(updated);
  } catch (err) {
    res.send(err);
  }
});



module.exports = router;
