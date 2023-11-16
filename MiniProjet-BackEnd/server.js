const express = require('express');
const mongoose = require('mongoose');
const morgan = require("morgan")
const path = require('path');
const swaggerDocument = require("./swagger.json")
const swaggerUi = require("swagger-ui-express");



const eventsRoute = require('./routes/events')



var cors = require('cors');
const bodyParser = require('body-parser');

const app = express()
const hostname = "127.0.0.1"
const port = 3000

// app.use(cors())
//app.use(express.json())
app.use(morgan('dev'))

app.use(express.urlencoded({ extended: true }))
//DB
mongoose.set('debug', true)
mongoose.Promise = global.Promise;
mongoose
    .connect('mongodb://127.0.0.1:27017/Eco')
    .then(() => console.log("Connected to MongoDB"))
    .catch(err => {
        console.log(err);
    })





app.use(express.urlencoded({ extended: true, limit: '400mb' }));

app.use(express.json({
  verify: (req, res, buf) => {
    req.rawBody = buf.toString()
  },
  limit: '400mb'
}));
app.use(morgan('dev'))
app.use(cors())
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use(bodyParser.json())
app.use('/uploads', express.static(path.join(__dirname, 'uploads')));////////

app.use("/api-docs", swaggerUi.serve, swaggerUi.setup(swaggerDocument));

app.listen(port, () => {
  console.log(`Server is running on port`, port);
});

app.use('/events', eventsRoute)//swagger done