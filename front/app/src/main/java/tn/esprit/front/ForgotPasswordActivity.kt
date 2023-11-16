import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import tn.esprit.front.R

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var buttonSms: Button
    private lateinit var buttonEmail: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        buttonSms = findViewById(R.id.buttonSms)
        buttonEmail = findViewById(R.id.buttonEmail)

        buttonSms.setOnClickListener {
            // Implement the logic for SMS password recovery
            // For example, navigate to the activity to handle SMS recovery
            startActivity(Intent(this, SmsPasswordRecoveryActivity::class.java))
        }

        buttonEmail.setOnClickListener {
            // Implement the logic for Email password recovery
            // For example, navigate to the activity to handle Email recovery
            startActivity(Intent(this, EmailPasswordRecoveryActivity::class.java))
        }
    }
}
