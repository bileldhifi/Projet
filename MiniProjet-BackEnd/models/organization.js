const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const organizationSchema = Schema({
    organizationName: { type: String, required: true },
    organizationDescription: { type: String },
    organizationAddress: { type: String },
    organizationEmail: { type: String },
    organizationPhone: { type: String },
    organizationDate : { type: String },
});

const Organization  = mongoose.model('Organization', organizationSchema);

module.exports = Organization