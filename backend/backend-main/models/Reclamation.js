const mongoose = require('mongoose');


const Reclamation = mongoose.model('Reclamation',{
    title: {
        type:String,
        require : true
    },
    type: {
        type:String,
        require : true
    },
    description: {
        type: String,
        // require : true
    },
    img: {
        type: string,
        // require : true
    },
    id_user: {
        type:integer,
    }
})

module.exports = Reclamation;