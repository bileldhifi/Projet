const express = require('express');
const organizationController = require('../controllers/organizationController');

const router = express.Router();

router.get('/', organizationController.getOrganizations);
router.post('/', organizationController.createOrganization);
router.get('/:id', organizationController.getOrganization);
router.put('/:id', organizationController.updateOrganization);
router.delete('/:id', organizationController.deleteOrganization);

module.exports = router;
