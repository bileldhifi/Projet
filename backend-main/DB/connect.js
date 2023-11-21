const mongoose = require('mongoose');

// Replace 'your-database-name' with your actual database name
const DB_NAME = 'your-database-name';

mongoose.connect(`mongodb+srv://bilel:bilel@cluster0.xspsj0f.mongodb.net/${DB_NAME}`, {
  useNewUrlParser: true,
  useUnifiedTopology: true
})
  .then(() => console.log('Connected to MongoDB'))
  .catch((error) => {
    console.error('Error connecting to MongoDB:', error);
    process.exit(1); // Exit the application on connection error
  });

module.exports = mongoose;
