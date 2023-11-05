import express from 'express';
import * as Participation from '../controllers/participation.js';

const router = express.Router();

router.route('')
  .post(participationController.addParticipation)
  .get(participationController.getAllParticipations);

router.route('/:id')
  .get(participationController.getParticipationById)
  .patch(participationController.updateParticipation)
  .delete(participationController.deleteParticipation);

export default router;
