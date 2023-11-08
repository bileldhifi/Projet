package tn.esprit.nascar.Models

class Reclamation(
    var id: Int,
    var title: String,
    var type: String,
    var description: String,
    var img: String,
    var id_user: Int
) {

    override fun toString(): String {
        return "Reclamation(id=$id, title='$title', type='$type', description='$description', img='$img')"
    }
}
