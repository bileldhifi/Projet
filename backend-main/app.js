const userRoute = require("./routes/userRoute"); // Importing the user route
const express = require("express");
require("dotenv").config(); // Import and configure dotenv as soon as possible
const app = express();
require("./DB/connect"); // Link to MongoDB

app.use(express.json()); // Middleware for parsing JSON bodies
const morgan = require("morgan"); // Morgan for logging HTTP requests

const port = process.env.PORT || 3000; // Use environment variable for port or default to 3000

app.use(morgan("dev")); // Morgan middleware for logging

// Serve static files from the 'public' directory
app.use(express.static(__dirname + "/public")); // Adjusted the path for serving static files

// Root route serving 'user.html'
app.get("/", (req, res) => {
  res.sendFile("user.html", { root: __dirname + "/public" }); // Adjusted the path for serving the HTML file
});

app.use('/userRoute', userRoute); // Using the user route

// Basic Error Handling Middleware - Should be placed after all routes and middleware
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).json({ error: "Something broke!" }); // Sending an informative error response
});

// Starting the server
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
