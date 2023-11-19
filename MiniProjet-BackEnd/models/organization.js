const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const organizationSchema = Schema({
    name: { type: String, required: true },
    date : { type: String , required: true    },
  address: { type: String },
    email: { type: String },
    lien : { type: String }
    // Ajoutez d'autres champs d'organisation au besoin
  });
  
  const Organization = mongoose.model("organizations", organizationSchema);
  
  module.exports = Organization;
  
