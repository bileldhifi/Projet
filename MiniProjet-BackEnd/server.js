const express = require('express');
const mongoose = require('mongoose');
const morgan = require('morgan');
const path = require('path');
const swaggerDocument = require('./swagger.json');
const swaggerUi = require('swagger-ui-express');

const eventsRoute = require('./routes/events');
const organizationRouter = require('./routes/organization');
const cors = require('cors');
const bodyParser = require('body-parser');

const app = express();
const port = 3000;

// Body parsers
app.use(express.urlencoded({ extended: true, limit: '400mb' }));
app.use(express.json({
  verify: (req, res, buf) => {
    req.rawBody = buf.toString();
  },
  limit: '400mb'
}));

// Static files
app.use('/uploads', express.static(path.join(__dirname, 'uploads')));

// Swagger UI
app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(swaggerDocument));

// MongoDB connection
mongoose.set('debug', true);
mongoose.Promise = global.Promise;
mongoose.connect('mongodb://127.0.0.1:27017/Eco')
  .then(() => console.log('Connected to MongoDB'))
  .catch(err => console.log(err));

// Middleware (morgan and cors)
app.use(morgan('dev'));
app.use(cors());

// Routes
app.use('/events', eventsRoute);
app.use('/organizations', organizationRouter);
app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
