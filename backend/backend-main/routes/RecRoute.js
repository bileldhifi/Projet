const express = require("express");
const router = express.Router();

const Reclamation = require("../models/Reclamation");


router.post("/create", async (req, res) => {
  try {
    data = req.body;
    rec = new Reclamation(data);
    created = await rec.save();
    res.send(created);
  } catch (err) {
    res.send(err);  
  }
});

// async
router.get("/getall", async (req, res) => {
  try {
    rec = await Reclamation.find();
    res.send(rec);
  } catch (err) {
    res.send(err);
  }
});
/// END async


///async
router.get("/getbyname/:id", async (req, res) => {
  try {
    id = req.params.name;
    rec = await Reclamation.findOne({ _id: id });
    res.send(rec);
  } catch (erro) {
    res.send(erro);
  }
});
/// end async

// sync
router.delete("/del/:id", async (req, res) => {
  try {
    id = req.params.id;
    rec = await Reclamation.findOneAndDelete({ _id: id });
    res.send(rec);
  } catch (err) {
    res.send(err);
  }
});
// end sync

router.put("/updates/:id", async (req, res) => {
  try {
    id = req.params.id;
    newData = req.body;

    updated = await Reclamation.findOneAndUpdate({ _id: id }, newData);
    res.send(updated);
  } catch (err) {
    res.send(err);
  }
});



module.exports = router;
