const express = require("express");
const router = express.Router();
const User = require("../models/Location"); // link model
const accountSid = process.env.TWILIO_ACCOUNT_SID;
const authToken = process.env.TWILIO_AUTH_TOKEN;
const client = require("twilio")(accountSid, authToken);
// router.post("/add", (req, res) => {
//   const data = req.body;
//   usr = new User(data);
//   usr
//     .save()
//     .then((savedUser) => res.send(savedUser))
//     .catch((err) => res.send(err));  
// });
// sync
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
router.post("/call", async (req, res) => {
  try {
  client.calls
    .create({
      url: "http://demo.twilio.com/docs/voice.xml",
      to: "+21653962224",
      from: "+15169622311",
    })
    .then((call) => console.log(call.sid));
    res.send({message:"call done"})
  } catch (err) {
    res.send({ message: err});
  }
});
// END sync

// router.get("/getall", (req, res) => {
//   User.find().then((users) => res.send(users));
// });

// app.get("/get/:id", (req, res) => {
//   id = req.params.id;
//   User.findById(id).then((user) => res.send(user));
// });

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

// app.get("/getbyname/:name", (req, res) => {
//   name1 = req.params.name;
//   User.findOne({ name: name1 })
//     .then((user) => {
//       if (user) {
//         res.send(user);
//         console.log("User found");
//       } else console.log("user not found");
//     })
//     .catch((error) => {
//       console.log(error);
//     });
// });

///async
router.get("/getbyname/:name", async (req, res) => {
  try {
    name1 = req.params.name;
    usr = await User.findOne({ name: name1 });
    res.send(usr);
  } catch (erro) {
    res.send(erro);
  }
});
/// end async

// router.delete("/delete/:name", (req, res) => {
//   namee = req.params.name;
//   User.findOneAndDelete({ name: namee })
//     .then((userdeleted) => {
//       res.send(userdeleted);
//     })
//     .catch((error) => {
//       console.log(error);
//     });
// });
//async
router.delete("/delete/:name", async(req, res) => {
  try{
  namee = req.params.name;
  const usr = await User.findOneAndDelete({ name: namee })
  res.send(usr);
}
  catch(error) {
    res.send(error);
  }
})

//end sync
// sync
router.delete("/delete/:id", async (req, res) => {
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

// router.put("/update/:id", (req, res) => {
//   id = req.params.id;
//   newData = req.body;
//   User.findOneAndUpdate({ _id: id }, newData)
//     .then((updatedUser) => {
//       res.send(updatedUser);
//     })
//     .catch((error) => console.log(error));
// });

module.exports = router;
