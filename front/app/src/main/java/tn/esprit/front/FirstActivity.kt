import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import tn.esprit.front.LoginActivity
import tn.esprit.front.MoreInfoActivity
import tn.esprit.front.R

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout) // Set the layout for this activity

        val createAccountButton: ImageButton = findViewById(R.id.supButton)
        val loginButton: ImageButton = findViewById(R.id.logButton)

        createAccountButton.setOnClickListener {
            // Use Intent to navigate to the screen for more information about the app
            val intent = Intent(this, MoreInfoActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            // Use Intent to navigate to the login screen
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
