import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import tn.esprit.front.R
import tn.esprit.front.User

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Retrieve user data from intent or your storage mechanism
        val user = intent.getParcelableExtra<User>("data")

        // Display user profile information in the UI
        user?.let { userProfile ->
            val imageViewUserPhoto: ImageView = findViewById(R.id.imageViewUserPhoto)
            val textViewUserNameAge: TextView = findViewById(R.id.textViewUserNameAge)
            val textViewAboutMe: TextView = findViewById(R.id.textViewAboutMe)

            // Load user photo from URL using Picasso library
            Picasso.get().load(userProfile.photo).placeholder(R.drawable.default_user_photo).into(imageViewUserPhoto)

            // Set user name and age
            textViewUserNameAge.text = "${userProfile.firstName}, ${userProfile.age}"

            // Set about me information
            textViewAboutMe.text = "About Me: ${userProfile.aboutme}"

            // Set other user information in a similar manner using findViewById and setting appropriate text
        }
    }
}
