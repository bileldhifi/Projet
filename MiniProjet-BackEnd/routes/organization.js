const express = require('express');
const router = express.Router();
const organizationController  = require('../controllers/organizationController');

// Get all organizations
router.get('/', organizationController.index);

// Create a new organization
router.post('/',organizationController.store);

// Get a specific organization by ID
router.get('/:id', organizationController.show);

// Update a specific organization by ID
router.put('/:id', organizationController.update);

// Delete a specific organization by ID
router.delete('/:id', organizationController.destroy);

module.exports = router;
