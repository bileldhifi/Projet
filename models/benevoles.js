import mongoose from "mongoose";
const benevoles = new mongoose.Schema({

    volunteer_name: { type: String, required: true },
    volunteer_email: String,
    volunteer_phone: String,
    volunteer_address: String,
});

export default mongoose.model('Benevoles', benevoles);

