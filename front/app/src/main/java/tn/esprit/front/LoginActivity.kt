import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import tn.esprit.front.ForgotPasswordActivity
import tn.esprit.front.R

class LoginActivity : AppCompatActivity() {

    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        // Set a click listener for the login button
        buttonLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            // Here, you can implement your login logic
            // For password recovery, if the user forgets their password, offer options for recovery via SMS or Email

            // For SMS OTP recovery
            // Example: Navigate to the forgot password activity where you'll send OTP via SMS
            // Replace ForgotPasswordActivity::class.java with your actual activity for SMS OTP recovery
            val intent = Intent(this, ForgotPasswordActivity::class.java).apply {
                putExtra("email", email) // Pass the email to the forgot password activity
            }
            startActivity(intent)

            // For Email OTP recovery
            // Example: Send an intent to open an email sending app with prefilled data
            // Note: Requires an email sending library or API integration (like Mailgun)
            /*val emailIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                putExtra(Intent.EXTRA_SUBJECT, "Forgot Password")
                putExtra(Intent.EXTRA_TEXT, "Your OTP code is: 123456") // Replace with generated OTP
            }
            startActivity(Intent.createChooser(emailIntent, "Send Email"))*/
        }
    }
}
