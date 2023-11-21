require("dotenv").config();
const fs = require("fs");
const http = require("http");
const express = require('express');

const port = process.env.PORT;

const server = http.createServer((req, res) => {
  console.log(req.url, req.method);
  res.statusCode = 200; // 200 is the HTTP status code for OK
  res.setHeader("Content-Type", "text/html");
  res.write("Hello World"); // 'write' means that we are sending the response to the requester

  let path = "./data/";
  switch (req.url) {
    case "/store":
      path += "store.html";
      break;
    case "/user":
      path += "user.html";
      break;
    default:
      path += "404.html";
  }
  fs.readFile(path, (error, data) => {
    error ? res.end(error.toString()) : res.end(data);
  });
});

server.listen(port, "127.0.0.1", () => {
  console.log(`Server running at http://127.0.0.1:${port}/`);
});
