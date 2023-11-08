package tn.esprit.nascar.ViewModels
import tn.esprit.nascar.Models.Response
import androidx.lifecycle.ViewModel

class ResponseViewModel : ViewModel() {
    private val responseList = mutableListOf<Response>()


    fun addResponse(response: Response) {
        responseList.add(response)
    }


    fun getResponses(): List<Response> {
        return responseList
    }


    fun getResponseById(id: Int): Response? {
        return responseList.find { it.id == id }
    }


    fun updateResponse(response: Response) {
        val existingResponse = responseList.find { it.id == response.id }
        existingResponse?.apply {
            content = response.content
            id_admin = response.id_admin
            id_rec = response.id_rec
        }
    }


    fun deleteResponse(id: Int) {
        responseList.removeAll { it.id == id }
    }
}
