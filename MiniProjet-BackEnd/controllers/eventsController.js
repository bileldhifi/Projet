const events = require("../models/events");
require("dotenv").config();
const path = require("path");
const qr = require("qrcode");
//c bon
const index = (req, res, next) => {
  events
    .find()
    .then((events) => {
      res.json({
        events,
      });
    })
    .catch((error) => {
      res.json({
        error,
      });
    });
};
//cbon
const store = async(req, res, next) => {
  let Events = new events({
    eventName: req.body.eventName,
    eventDate: req.body.eventDate,
    eventLocation: req.body.eventLocation,
    eventDescription: req.body.eventDescription,
    organization: req.body.organization,
    image: req.file.path,
  });
   data = "";
  try {
  Events.save()
    .then(  async (response) => {
      data = response._id.toString();
     // console.log(data);
     
        //console.log("yes");
        qr.toDataURL(data, (err, url) => {
          if (err) throw err;

          
          //console.log(url);

         
          qr.toFile("./uploads/" + data + ".png", data, (err) => {
            if (err) throw err;
           // console.log("QR code saved as qrcode.png");
          });
        });
        let existingEvents = {
          qrcode: "uploads/" + data + ".png",
        };
        const update = await events.findByIdAndUpdate(
          data,
          { $set: existingEvents },
          { new: true }
        );
        res.json(update);
     
    })
    
} catch (e) {
    return res.status(422).send({
      error: { message: "e", resend: true },
    });
  }
};

module.exports = {
  index,
  store,
};
