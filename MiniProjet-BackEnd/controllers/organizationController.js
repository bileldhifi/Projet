const Organization = require('../models/organization');

const getOrganizations = async (req, res) => {
  try {
    const organizations = await Organization.find();
    res.json(organizations);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
};

const createOrganization = async (req, res) => {
  const { organizationName, organizationDescription, organizationAddress, organizationEmail, organizationPhone } = req.body;

  try {
    const newOrganization = new Organization({
      organizationName,
      organizationDescription,
      organizationAddress,
      organizationEmail,
      organizationPhone,
    });

    await newOrganization.save();
    res.json(newOrganization);
  } catch (err) {
    res.status(400).json({ error: err.message });
  }
};

const getOrganization = async (req, res) => {
  const { id } = req.params;

  try {
    const organization = await Organization.findById(id);
    if (!organization) {
      return res.status(404).json({ error: 'Organization not found' });
    }
    res.json(organization);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
};

const updateOrganization = async (req, res) => {
  const { id } = req.params;
  const { organizationName, organizationDescription, organizationAddress, organizationEmail, organizationPhone } = req.body;

  try {
    const organization = await Organization.findByIdAndUpdate(id, {
      organizationName,
      organizationDescription,
      organizationAddress,
      organizationEmail,
      organizationPhone,
    }, { new: true }); // Return updated document

    if (!organization) {
      return res.status(404).json({ error: 'Organization not found' });
    }
    res.json(organization);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
};

const deleteOrganization = async (req, res) => {
  const { id } = req.params;

  try {
    const organization = await Organization.findByIdAndDelete(id);
    if (!organization) {
      return res.status(404).json({ error: 'Organization not found' });
    }
    res.json({ message: 'Organization deleted successfully' });
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
};

module.exports = {
  getOrganizations,
  createOrganization,
  getOrganization,
  updateOrganization,
  deleteOrganization,
};
