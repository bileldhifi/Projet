import Evenement from "../models/event.js";

// TODO 4: Permet d'ajouter un nouveau benevoles
export async function addEvent(req, res, next) {
    try {
      const newEvent = new Evenement({
        ...req.body, 
      });
  
      const savedEvent = await newEvent.save();
      res.status(200).json({ event : savedEvent});
    } catch (error) {
      res.status(400).json({ error: error.message });
    }
  }
  
  // TODO 5: Permet de récupérer la liste des benevoles 
  export async function  getAllEvents (req, res, next) {
    try {
      const events = await Evenement.find();
      res.status(200).json({ event : events });
    } catch (error) {
      res.status(400).json({ error: error.message });
    }
  }
  
  // TODO 6: Permet de récupérer un benevole à l'aide de son id 
  export async function getEventById(req, res, next) {
    try {
      const event = await Evenement.findById(req.params.id);
      res.status(200).json({ event : event });
    } catch (error) {
      res.status(400).json({ error: error.message });
    }
  }
  
  
  
  // Update Restaurent

export async function updateEvent(req, res, next) {
  try {
    const existingEvenement = await Evenement.findById(req.params.id);

    if (!existingEvenement) {
      return res.status(404).json({ message: 'Evenement not found' });
    }

    if (req.body.event_name) {
      existingEvenement.event_name = req.body.event_name;
    }
    if (req.body.event_date) {
      existingEvenement.event_date = req.body.event_date;
    }
    if (req.body.event_location) {
      existingEvenement.event_location = req.body.event_location;
    }
    if (req.body.event_description) {
      existingEvenement.event_description = req.body.event_description;
    }

    const updatedEvenement = await existingEvenement.save();
    res.status(200).json({ updatedEvenement: updatedEvenement });
  } catch (error) {
    res.status(400).json({ error: error.message });
  }
}

// Delete an event by its ID
export async function deleteEvent(req, res, next) {
  try {
    const deletedEvent = await Evenement.findByIdAndRemove(req.params.id);
    
    if (!deletedEvent) {
      return res.status(404).json({ message: 'Event not found' });
    }

    res.status(204).send(); // No content, indicating successful deletion
  } catch (error) {
    res.status(400).json({ error: error.message });
  }
}
