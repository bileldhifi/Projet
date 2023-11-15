const mongoose = require('mongoose');

const Schema   = mongoose.Schema

const RepSchema  = new  Schema({
    contenu: {
        type:String,
        require : true
    },
    id_rec: {
        type:Number,
    },
    id_admin: {
        type:Number,
    }

})
const Response = mongoose.model('Response',RepSchema)
module.exports = Response;