const express = require("express");
const app = express();



app.get("/", (req, res) => {
  res.send("Home Page");
});

// app.get("/users", auth, (req, res,next) => {
//   res.send("Users Page");
//   next()
// });



// function auth(req, res, next) {
//   if (req.query.admin === "true") {
//     next();
//   } else {
//     res.send("ERROR: You must be an admin");
//   }
// }

app.listen(3000, () => console.log("Server Started"));

//

app.get('/user',auth,(req,res,)=>{


})
function auth(req,res,next){
    console.log('before')
    next();
    console.log('after');
    return
}