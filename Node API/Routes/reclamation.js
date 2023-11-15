const express = require('express');
const router = express.Router();
const RecController = require('../Controllers/RecController');


router.get('/', RecController.index);
router.post('/store', RecController.store);
router.get('/show/:rec_id', RecController.show);
router.put('/update/:rec_id', RecController.update);
router.delete('/delete/:rec_id', RecController.destroy);

module.exports = router;
