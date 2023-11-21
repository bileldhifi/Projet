const mongoose = require('mongoose')
mongoose
  .connect(
    "mongodb+srv://bilel:bilel@cluster0.xspsj0f.mongodb.net/?retryWrites=true&w=majority"
  )
  .then(() => console.log("connected to DB"))
  .catch((error) => console.log(error));

module.exports = mongoose;