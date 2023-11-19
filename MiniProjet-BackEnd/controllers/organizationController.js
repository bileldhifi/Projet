const Organization = require('../models/organization');

const index = (req, res, next) => {
  Organization.find()
    .then((organizations) => {
      res.json({
        organizations,
      });
    })
    .catch((error) => {
      res.json({
        error,
      });
    });
};

const store = async (req, res, next) => {
  try {
    const newOrganization = new Organization({
      name: req.body.name,
      date: req.body.date,
      address: req.body.address,
      email: req.body.email,
      lien: req.body.lien,
      // Add other fields from your schema as needed
    });

    const savedOrganization = await newOrganization.save();
    res.json(savedOrganization);
  } catch (error) {
    return res.status(422).send({
      error: { message: error.message, resend: true },
    });
  }
};

const show = async (req, res, next) => {
  try {
    const organization = await Organization.findById(req.params.id);
    if (!organization) {
      return res.status(404).json({ error: 'Organization not found' });
    }
    res.json(organization);
  } catch (error) {
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const update = async (req, res, next) => {
  try {
    const organization = await Organization.findByIdAndUpdate(
      req.params.id,
      {
        $set: {
          name: req.body.name,
          date: req.body.date,
          address: req.body.address,
          email: req.body.email,
          lien: req.body.lien,
          // Update other fields as needed
        },
      },
      { new: true }
    );

    if (!organization) {
      return res.status(404).json({ error: 'Organization not found' });
    }

    res.json(organization);
  } catch (error) {
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const destroy = async (req, res, next) => {
  try {
    const organization = await Organization.findByIdAndRemove(req.params.id);
    if (!organization) {
      return res.status(404).json({ error: 'Organization not found' });
    }
    res.status(204).json(); // No content on successful deletion
  } catch (error) {
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

module.exports = {
  index,
  store,
  show,
  update,
  destroy,
};
