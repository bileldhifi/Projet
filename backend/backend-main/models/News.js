const mongoose = require('mongoose');


const Reclamation = mongoose.model('News',{
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
        type: DateTime,
        // require : true
    },
    id_user: {
        type:integer,
    },
    id_admin : {
        type:integer,
    }
})

module.exports = News;