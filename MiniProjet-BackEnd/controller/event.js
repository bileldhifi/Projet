import Event from "../models/event.js";

// TODO 4: Permet d'ajouter un nouvel événement
export async function addEvent(req, res, next) {
    try {
        const newEvent = new Event({
            ...req.body,
        });

        const savedEvent = await newEvent.save();
        res.status(200).json({ event: savedEvent });
    } catch (error) {
        res.status(400).json({ error: error.message });
    }
}

// TODO 5: Permet de récupérer la liste des événements
export async function getAllEvents(req, res, next) {
    try {
        const events = await Event.find();
        res.status(200).json({ event: events });
    } catch (error) {
        res.status(400).json({ error: error.message });
    }
}

// TODO 6: Permet de récupérer un événement à l'aide de son id
export async function getEventById(req, res, next) {
    try {
        const event = await Event.findById(req.params.id);
        res.status(200).json({ event });
    } catch (error) {
        res.status(400).json({ error: error.message });
    }
}

// Update Event
export async function updateEvent(req, res, next) {
    try {
        const existingEvent = await Event.findById(req.params.id);

        if (!existingEvent) {
            return res.status(404).json({ message: 'Event not found' });
        }

        if (req.body.event_name) {
            existingEvent.event_name = req.body.event_name;
        }
        if (req.body.event_date) {
            existingEvent.event_date = req.body.event_date;
        }
        if (req.body.event_location) {
            existingEvent.event_location = req.body.event_location;
        }
        if (req.body.event_description) {
            existingEvent.event_description = req.body.event_description;
        }

        const updatedEvent = await existingEvent.save();
        res.status(200).json({ updatedEvent });
    } catch (error) {
        res.status(400).json({ error: error.message });
    }
}
