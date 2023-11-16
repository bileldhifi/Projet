import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val phone: String,
    val email: String,
    val password: String,
    val aboutme: String,
    var photo: String, // Change to var to allow custom setter
    val address: String
    // Other properties...
) {
    // Custom setter for the photo URL
    var formattedPhotoUrl: String = ""
        set(value) {
            field = validateAndFormatPhotoUrl(value)
        }
        get() = field

    // Function to verify and format the photo URL
    private fun validateAndFormatPhotoUrl(url: String): String {
        return if (isValidUrl(url)) {
            if (!url.startsWith("http://") && !url.startsWith("https://")) {
                "https://$url" // Prefix with https:// if missing
            } else {
                url
            }
        } else {
            // Handle invalid URL or return a default URL
            // For example, return a placeholder URL or throw an exception
            // You can customize this based on your requirements
            "https://example.com/default_photo.jpg"
        }
    }

    // Function to validate the URL (you can implement your URL validation logic here)
    private fun isValidUrl(url: String): Boolean {
        // Implement your URL validation logic here (regex or URL validation library)
        // Return true if URL is valid, otherwise return false
        // Example regex validation:
        val urlRegex = "Your regex pattern"
         return url.matches(urlRegex.toRegex())
        return true // For demonstration purposes, assuming all URLs are valid
    }
}

interface UserApiService {
    @POST("users/create")
    fun saveUserProfile(@Body user: User): Call<User> // Change the return type according to your API response
}
