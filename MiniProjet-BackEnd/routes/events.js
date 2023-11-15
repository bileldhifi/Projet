const express = require('express')
const router  = express.Router()
const eventsController = require('../controllers/eventsController')
const {upload} = require('../middleware/upload');

router.get('/',eventsController.index)
router.post('/store',upload.single('image'),eventsController.store)



module.exports=router