import express from 'express';
import * as benevole from '../controller/benevole.js';

const router = express.Router();

router.route('')
    .post(benevole.addBenevole)
    .get(benevole.getAllBenevoles);

router.route('/:id')
    .get(benevole.getBenevoleById)
    .patch(benevole.updateBenevole)
   // .delete(benevole.deleteBenevoles);
export default router;
