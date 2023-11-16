import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import tn.esprit.front.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FillProfileActivity : AppCompatActivity() {

    private lateinit var editTextFirstName: EditText
    private lateinit var editTextLastName: EditText
    private lateinit var editTextAddress: EditText
    private lateinit var buttonSaveProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fill_profile_layout)

        // Initialize views
        editTextFirstName = findViewById(R.id.editTextFirstName)
        editTextLastName = findViewById(R.id.editTextLastName)
        editTextAddress = findViewById(R.id.editTextAddress)
        buttonSaveProfile = findViewById(R.id.buttonSaveProfile)

        // Listen for Save Profile button click
        buttonSaveProfile.setOnClickListener {
            // Retrieve user input from EditText fields
            val firstName = editTextFirstName.text.toString()
            val lastName = editTextLastName.text.toString()
            val address = editTextAddress.text.toString()

            // Create a User object with user data (Replace default values with actual user input)
            val user = User(
                firstName = firstName,
                lastName = lastName,
                address = address,
                age = 25, // Replace with appropriate age value
                phone = "1234567890", // Replace with appropriate phone value
                email = "example@example.com", // Replace with appropriate email value
                password = "password123", // Replace with appropriate password value
                aboutme = "Description", // Replace with appropriate aboutme value
                photo = "photo-url" // Replace with appropriate photo URL value
            )

            // Create Retrofit instance with base URL
            val retrofit = Retrofit.Builder()
                .baseUrl("YOUR_BASE_URL") // Replace with your base URL
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            // Create UserApiService instance
            val userApiService = retrofit.create(UserApiService::class.java)

            // Make an API call to save user profile information
            val call = userApiService.saveUserProfile(user)

            // Enqueue the call to handle response asynchronously
            call.enqueue(object : Callback<User> {
                override fun onResponse(call: Call<User>, response: Response<User>) {
                    if (response.isSuccessful) {
                        // Handle successful response from the server
                        val user = response.body() // Retrieve user data if needed

                        // Proceed with the next steps or navigate to another activity
                        // For example, after successfully saving user profile data, you might want to navigate to the home screen:
                        val intent = Intent(this@FillProfileActivity, ProfileActivity::class.java)
                        startActivity(intent)

                    } else {
                        // Handle unsuccessful response (e.g., server error, authentication issue)

                        // In case of a server error, you can display an error message to the user or provide a retry option.
                        // For instance, you might display a Toast message informing the user about the error:
                        Toast.makeText(this@FillProfileActivity, "Failed to save profile. Please try again later.", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    // Handle failure (e.g., network failure, timeout)

                    // In case of a network failure or timeout, you can display an error message to the user or provide a retry option.
                    // For instance, you might display a Snackbar informing the user about the network issue:
                    Snackbar.make(findViewById(android.R.id.content), "Network error. Please check your internet connection.", Snackbar.LENGTH_SHORT).show()
                }
            })
        }
    }
}
