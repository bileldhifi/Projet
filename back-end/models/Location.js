const mongoose = require('mongoose');


const Location = mongoose.model("Location", {
  name: {
    type: String,
    require: true,
  },
  lat: {
    type: Number,
    require: true,
  },
  long: {
    type: Number,
    require: true,
  },
  adresse: {
    type: String,
    require: true,
  },
  categorie: {
    type: String,
    require: true,
  },
  instruction: {
    type: String,
    require: true,
  },
  description:{
    type:String,
    require:true,
  }
});

module.exports = Location;