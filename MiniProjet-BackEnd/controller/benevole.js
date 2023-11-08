import Benevoles from "../models/benevole.js";

// Add a new benevole
export async function addBenevole(req, res, next) {
    try {
        const newBenevole = new Benevoles({
            ...req.body,
        });

        const savedBenevole = await newBenevole.save();
        res.status(201).json({ benevole: savedBenevole });
    } catch (error) {
        res.status(400).json({ error: error.message });
    }
}

// Get a list of all benevoles
export async function getAllBenevoles(req, res, next) {
    try {
        const benevoles = await Benevoles.find();
        res.status(200).json({ benevoles });
    } catch (error) {
        res.status(500).json({ error: error.message });
    }
}
// Get a specific benevole by ID
export async function getBenevoleById(req, res, next) {
    try {
        const benevole = await Benevoles.findById(req.params.id);
        if (!benevole) {
            return res.status(404).json({ message: 'Benevole not found' });
        }
        res.status(200).json({ benevole });
    } catch (error) {
        res.status(500).json({ error: error.message });
    }
}


// Update benevole information
export async function updateBenevole(req, res, next) {
    try {
        const existingBenevole = await Benevoles.findById(req.params.id);

        if (!existingBenevole) {
            return res.status(404).json({ message: 'Benevole not found' });
        }

        if (req.body.volunteer_name) {
            existingBenevole.volunteer_name = req.body.volunteer_name;
        }
        if (req.body.volunteer_email) {
            existingBenevole.volunteer_email = req.body.volunteer_email;
        }
        if (req.body.volunteer_phone) {
            existingBenevole.volunteer_phone = req.body.volunteer_phone;
        }
        if (req.body.volunteer_address) {
            existingBenevole.volunteer_address = req.body.volunteer_address;
        }

        const updatedBenevole = await existingBenevole.save();
        res.status(200).json({ benevole: updatedBenevole });
    } catch (error) {
        res.status(500).json({ error: error.message });
    }
}
