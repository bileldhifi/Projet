import Benevoles from "../models/benevoles.js";

// TODO 4: Permet d'ajouter un nouveau benevoles
export async function addBenevole(req, res, next) {
    try {
      const newBenevole = new Benevoles ({
        ...req.body, 
      });
  
      const savedBenevole = await newBenevole.save();
      res.status(200).json({ benevole: savedBenevole });
    } catch (error) {
      res.status(400).json({ error: error.message });
    }
  }
  
  // TODO 5: Permet de récupérer la liste des benevoles 
  export async function getAllBenevoles(req, res, next) {
    try {
      const  benevoles = await Benevoles.find();
      res.status(200).json({ benevole: benevoles });
    } catch (error) {
      res.status(400).json({ error: error.message });
    }
  }
  
  // TODO 6: Permet de récupérer un benevole à l'aide de son id 
  export async function getBenevoleById (req, res, next) {
    try {
      const benevole = await benevole.findById(req.params.id);
      res.status(200).json({ benevole });
    } catch (error) {
      res.status(400).json({ error: error.message });
    }
  }
  
  // Update Restaurent
  export async function updateBenevole(req, res, next) {
    try {
      const existingBenevole = await Benevoles.findById(req.params.id);
  
      if (!existingBenevole) {
        return res.status(404).json({ message: 'Benevole not found' });
      }
  
      if (req.body.volunteer_name) {
        existingBenevole.volunteer_name = req.body.volunteer_name;
      }
      if (req.body.volunteer_email) {
        existingBenevole.volunteer_email = req.body.volunteer_email;
      }
      if (req.body.volunteer_phone) {
        existingBenevole.volunteer_phone = req.body.volunteer_phone;
      }
      if (req.body.volunteer_address) {
        existingBenevole.volunteer_address = req.body.volunteer_address;
      }
  
      const updatedBenevole = await existingBenevole.save();
      res.status(200).json({ updatedBenevole });
    } catch (error) {
      res.status(400).json({ error: error.message });
    }
  }
// TODO: Delete a benevoles
export async function deleteBenevoles(req, res, next) {
  try {
    const deletedBenevoles = await Benevoles.findByIdAndDelete(req.params.id);
    if (!deletedBenevoles) {
      return res.status(404).json({ message: 'Benevoles not found' });
    }
    res.status(200).json({ message: 'Benevoles deleted' });
  } catch (error) {
    res.status(400).json({ error: error.message });
  }
}
