const mongoose = require('mongoose');


const User = mongoose.model('Users',{
    name: {
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
    }
})

module.exports = User;