import express from 'express';
import mongoose from 'mongoose';
import morgan from 'morgan';
import eventRouter from './router/event.js';
import benevolesRouter from './router/benevole.js';


const app = express();
const hostname = "127.0.0.1";
const port = 3000;

app.use(express.json());
app.use(morgan('dev'));

app.use(express.urlencoded({ extended: true }));

// DB
mongoose.set('debug', true);
mongoose.Promise = global.Promise;
mongoose
  .connect('mongodb://127.0.0.1:27017/MiniProjet')
  .then(() => console.log("Connected to MongoDB"))
  .catch(err => {
    console.log(err);
  });

// Use your routers for specific resources
app.use('/event', eventRouter);
app.use('/benevoles', benevolesRouter);

app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}/`);
});
