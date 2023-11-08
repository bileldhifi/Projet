const mongoose = require('mongoose')
mongoose.connect('mongodb+srv://bileldhifi:bileldhifi@nodejs-cluster.lonsfhy.mongodb.net/')
        .then(()=>console.log('connected to DB'))
        .catch((error)=>console.log(error))

module.exports = mongoose;