import express from 'express';
import * as benevoles from '../controllers/benevoles.js';

const router = express.Router();

router.route('/')
  .post(benevoles.addBenevole)
  .get(benevoles.getAllBenevoles);

router.route('/:id')
  .get(benevoles.getBenevoleById)
  .patch(benevoles.updateBenevole)
  .delete(benevoles.deleteBenevoles);

export default router;
