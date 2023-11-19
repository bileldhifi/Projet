const mongoose = require('mongoose');
const Schema = mongoose.Schema;


    const eventsSchema = Schema({
        eventName: { type: String, required: true },
        eventDate: { type: String },
        eventLocation: {type:String},
        eventDescription: {type:String},
        image: { type: String }, 
        organization: { type: Schema.Types.ObjectId, ref: 'Organization' }, // Utilisez une référence à l'objet Organization
 
        //organization: { type: String }, 
        qrcode:{type:String}
      });


const Events = mongoose.model("events", eventsSchema);

module.exports = Events