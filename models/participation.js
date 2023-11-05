import mongoose from "mongoose";
const participation = new mongoose.Schema({

 event_id: { type: mongoose.Schema.Types.ObjectId, ref: 'Evenement' },
  volunteer_id: { type: mongoose.Schema.Types.ObjectId, ref: 'Benevoles' },
  participation_date: { type: Date },
  participation_hours: Number,
});

export default mongoose.model('Participation', participation);

