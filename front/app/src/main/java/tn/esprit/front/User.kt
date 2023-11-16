package tn.esprit.front

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val phone: String,
    val email: String,
    val password: String,
    val aboutme: String,
    val photo: String,
    val address: String
    // Add other properties as needed
)