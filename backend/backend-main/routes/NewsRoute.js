const express = require("express");
const router = express.Router();

const News = require("../models/News");


router.post("/create", async (req, res) => {
  try {
    data = req.body;
    rec = new News(data);
    created = await rec.save();
    res.send(created);
  } catch (err) {
    res.send(err);  
  }
});

// async
router.get("/getall", async (req, res) => {
  try {
    rec = await News.find();
    res.send(rec);
  } catch (err) {
    res.send(err);
  }
});
/// END async


///async
router.get("/getbyid/:id", async (req, res) => {
  try {
    id = req.params.name;
    rec = await News.findOne({ _id: id });
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
    rec = await News.findOneAndDelete({ _id: id });
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

    updated = await News.findOneAndUpdate({ _id: id }, newData);
    res.send(updated);
  } catch (err) {
    res.send(err);
  }
});



module.exports = router;
