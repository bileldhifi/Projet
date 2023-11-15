const mongoose = require('mongoose');

const Schema   = mongoose.Schema 

const recSchema  = new  Schema({
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
        type: String,
        // require : true
    },
    id_user: {
        type:Number,
    }
})
const Reclamation = mongoose.model('Reclamation',recSchema)
module.exports = Reclamation;