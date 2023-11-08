import mongoose from "mongoose";

const benevoleSchema = new mongoose.Schema({
  volunteer_name: { type: String, required: true },
  volunteer_email: String,
  volunteer_phone: String,
  volunteer_address: String,
});

export default mongoose.model('Benevoles', benevoleSchema);
