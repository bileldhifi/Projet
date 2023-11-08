const mongoose = require('mongoose');


const Response = mongoose.model('Response',{
    content: {
        type:String,
        require : true
    },
    id_admin: {
        type:integer,
        require : true
    },
    id_rec: {
        type: integer,
        // require : true
    }
    
})

module.exports = Reclamation;