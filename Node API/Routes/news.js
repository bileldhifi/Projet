const express = require('express');
const router = express.Router();
const NewsController = require('../Controllers/NewsController');


router.get('/', NewsController.index);
router.post('/store', NewsController.store);
router.get('/show/:news_id', NewsController.show);
router.put('/update/:news_id', NewsController.update);
router.delete('/delete/:news_id', NewsController.destroy);

module.exports = router;
