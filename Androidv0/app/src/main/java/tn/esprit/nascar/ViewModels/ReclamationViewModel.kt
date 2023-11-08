package tn.esprit.nascar.ViewModels
import androidx.lifecycle.ViewModel
import tn.esprit.nascar.Models.Reclamation



class ReclamationViewModel : ViewModel() {
    private val reclamationList = mutableListOf<Reclamation>()


    fun addReclamation(reclamation: Reclamation) {
        reclamationList.add(reclamation)
    }


    fun getReclamations(): List<Reclamation> {
        return reclamationList
    }


    fun getReclamationById(id: Int): Reclamation? {
        return reclamationList.find { it.id == id }
    }


    fun updateReclamation(reclamation: Reclamation) {
        val existingReclamation = reclamationList.find { it.id == reclamation.id }
        existingReclamation?.apply {
            title = reclamation.title
            type = reclamation.type
            description = reclamation.description
            img = reclamation.img
        }
    }


    fun deleteReclamation(id: Int) {
        reclamationList.removeAll { it.id == id }
    }
}

