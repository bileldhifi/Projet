const mongoose = require('mongoose');


const User = mongoose.model('Users',{
    firstName: {
        type:String,
        require : true
    },
    lastName: {
        type: String,
        // require : true
    },
    age: {
        type: Number,
        // require : true
    },
    phone:{
        type: Number,
        //require : true
    },
    email: {
        type: String,
        // require : true
    },
    password: {
        type: String,
        // require : true
    },
    aboutme: {
        type: String,
        // require : true
    },
    photo: {    
        type: String,
        // require : true
    },
    adress: {
        type: String,
        // require : true
    },
    
})

module.exports = User;