import express from 'express';
import * as evenement   from '../controllers/event.js';

const router = express.Router();

router.route('')
  .post(evenement.addevent)
  .get(evenement.getAllEvents);

router.route('/:id')
  .get(evenement.getEventById)
  .patch(evenement.updateEvent)
  .delete(evenement.deleteEvent); // Adding the delete route

export default router;