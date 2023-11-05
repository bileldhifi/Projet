import Participation from '../models/participation.js';

// Add a new participation
export async function addParticipation(req, res, next) {
  try {
    const newParticipation = new Participation({
      ...req.body,
    });

    const savedParticipation = await newParticipation.save();
    res.status(200).json({ participation: savedParticipation });
  } catch (error) {
    res.status(400).json({ error: error.message });
  }
}

// Get a list of all participations
export async function getAllParticipations(req, res, next) {
  try {
    const participations = await Participation.find();
    res.status(200).json({ participation: participations });
  } catch (error) {
    res.status(400).json({ error: error.message });
  }
}

// Get a participation by its ID
export async function getParticipationById(req, res, next) {
  try {
    const participation = await Participation.findById(req.params.id);
    res.status(200).json({ participation });
  } catch (error) {
    res.status(400).json({ error: error.message });
  }
}

// Update a participation
export async function updateParticipation(req, res, next) {
  try {
    const existingParticipation = await Participation.findById(req.params.id);

    if (!existingParticipation) {
      return res.status(404).json({ message: 'Participation not found' });
    }

    // Update the fields as needed
    if (req.body.event_id) {
      existingParticipation.event_id = req.body.event_id;
    }
    if (req.body.volunteer_id) {
      existingParticipation.volunteer_id = req.body.volunteer_id;
    }
    if (req.body.participation_date) {
      existingParticipation.participation_date = req.body.participation_date;
    }
    if (req.body.participation_hours) {
      existingParticipation.participation_hours = req.body.participation_hours;
    }

    const updatedParticipation = await existingParticipation.save();
    res.status(200).json({ updatedParticipation });
  } catch (error) {
    res.status(400).json({ error: error.message });
  }
}
