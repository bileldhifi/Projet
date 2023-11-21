const express = require("express");
const app = express();
<<<<<<< Updated upstream
require("./DB/connect"); // link to Mongo db
app.use(express.json()); // json declaration
const morgan = require("morgan"); // link morgan midleware
require("dotenv").config(); // import dotENV
const port = process.env.PORT; // import port from .env
const User = require("./models/Location"); // link model

const userRoute = require('./routes/userRoute');
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});

// middelware
app.use(morgan("dev")); // provie information GET /getall/ 200 161.447 ms - 934 (method,status,response-time,...)
//
app.use(express.static("public")); // folder public to the front-end (browser)

=======
const morgan = require("morgan");
require("dotenv").config();
app.use(express.json()); // For parsing application/json
app.use(morgan("dev")); // Logging middleware
app.use(express.static("public")); // Static files in the public folder
const mongoose = require("mongoose");
mongoose
  .connect(
    "mongodb+srv://bilel:bilel@cluster0.xspsj0f.mongodb.net/?retryWrites=true&w=majority"
  )
  .then(() => console.log("connected to DB"))
  .catch((error) => console.log(error));

const locationRoute = require("./routes/locationRoute"); // Import routes

// Root endpoint
>>>>>>> Stashed changes
app.get("/", (req, res) => {
  res.sendFile("./data/user.html", { root: __dirname });
});

<<<<<<< Updated upstream
app.use('/',userRoute); // run userRoute file under the path '/'
=======
// Use the routes defined in locationRoute
app.use("/", locationRoute);

const port = process.env.PORT; // Default to 3000 if PORT is not in .env file
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
>>>>>>> Stashed changes
