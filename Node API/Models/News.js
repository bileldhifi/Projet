const mongoose = require('mongoose');
const date = require('date-and-time') 
const Schema   = mongoose.Schema 

const NewsSchema  = new  Schema({
    title: {
        type:String,
        require : true
    },
    description: {
        type:String,
        require : true
    },
    img: {
        type: String,
        // require : true
    },
    date: {
        type: String,
        // require : true
    },
   
    id_admin : {
        type:Number,
    }
})
const News = mongoose.model('News',NewsSchema)
module.exports = News;


