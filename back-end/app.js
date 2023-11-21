const express = require("express");
const app = express();
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

app.get("/", (req, res) => {
  res.sendFile("./data/user.html", { root: __dirname });
});

app.use('/',userRoute); // run userRoute file under the path '/'