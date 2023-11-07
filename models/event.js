import mongoose from "mongoose";

const eventSchema = new mongoose.Schema({
  event_name: { type: String, required: true },
  event_date: { type: Date },
  event_location: String,
  event_description: String,
  participantsCount: { type: Number, default: 0 }, // Counter for participants
});

export default mongoose.model('Evenement', eventSchema);
