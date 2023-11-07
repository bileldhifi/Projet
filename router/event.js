import express from 'express';
import * as evenement from '../controllers/event.js';

const router = express.Router();

router.route('/')
  .post(evenement.addEvent) // POST request to add an event
  .get(evenement.getAllEvents); // GET request to retrieve all events

router.route('/:id')
  .get(evenement.getEventById) // GET request to retrieve a specific event by ID
  .patch(evenement.updateEvent) // PATCH request to update an event
  .delete(evenement.deleteEvent); // DELETE request to delete an event

export default router;
