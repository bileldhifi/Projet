import mongoose from "mongoose";
const evenement = new mongoose.Schema({

    event_name: { type: String, required: true },
    event_date: { type: Date },
    event_location: String,
    event_description: String,
});

export default mongoose.model('Evenement', evenement);

