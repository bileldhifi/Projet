//
import express from 'express';

//import express, { urlencoded } from 'express';

import mongoose from 'mongoose';
import morgan from 'morgan';
import eventRouter from './router/event.js'; // Corrected import
//import participationRouter from './router/participation.js'; // Corrected import
import benevolesRouter from './router/benevoles.js'; // Corrected import



const app = express();
const hostname = "127.0.0.1";
const port = 3000;

app.use(express.json());
app.use(morgan('dev'));

app.use(express.urlencoded({ extended: true }));

// DB connection
mongoose.set('debug', true);
mongoose.Promise = global.Promise;
mongoose.connect('mongodb://127.0.0.1:27017/MiniProjet', { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log("Connected to MongoDB"))
    .catch(err => {
        console.log(err);
    });

// Use your routers for specific resources
app.use('/event', eventRouter);
//app.use('/participation', participationRouter);
app.use('/benevoles', benevolesRouter);

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}/`);
}









);
