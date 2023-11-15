const express = require('express');
const mongoose = require('mongoose');
const morgan = require('morgan');
const bodyParser = require('body-parser');

const RecRoute = require('./Routes/reclamation');
const RepRoute = require('./Routes/response');
const NewsRoute = require('./Routes/news');

mongoose.connect('mongodb://localhost:27017/Omar');
const db = mongoose.connection;

db.on('error', (err) => {
   console.log(err);
});

db.once('open', () => {
   console.log('Database Connection Established!');
});

const app = express();
app.use(morgan('dev'));
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use('/uploads', express.static('uploads'))

const PORT = process.env.PORT || 3000;

app.listen(PORT, () => {
   console.log(`Server is running on port ${PORT}`);
});

app.use('/api/reclamations', RecRoute);
app.use('/api/responses', RepRoute);
app.use('/api/news', NewsRoute);
