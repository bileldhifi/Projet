const express = require('express');
const router = express.Router();
const RepController = require('../Controllers/RepController');


router.get('/', RepController.index);
router.post('/store', RepController.store);
router.get('/show/:rep_id', RepController.show);
router.put('/update/:rep_id', RepController.update);
router.delete('/delete/:rep_id', RepController.destroy);

module.exports = router;
