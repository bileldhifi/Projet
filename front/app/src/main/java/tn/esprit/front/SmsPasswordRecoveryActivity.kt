import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.twilio.Twilio
import com.twilio.rest.api.v2010.account.Message
import com.twilio.type.PhoneNumber
import tn.esprit.front.R  // Replace with your package name

class SmsPasswordRecoveryActivity : AppCompatActivity() {

    // Replace with your Twilio credentials
    private val ACCOUNT_SID = "AC116bed9aec0d7931b3f6ac0523f15e81"
    private val AUTH_TOKEN = "408b9228b6cd737e6da8b37f8f1bc6ea"
    private val TWILIO_PHONE_NUMBER = "+21694603330"

    private lateinit var editTextPhoneNumber: EditText
    private lateinit var buttonSendCode: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_password_recovery)

        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber)
        buttonSendCode = findViewById(R.id.buttonSendCode)

        buttonSendCode.setOnClickListener {
            val phoneNumber = editTextPhoneNumber.text.toString()

            // Generate a random recovery code (replace this with your actual logic)
            val recoveryCode = generateRecoveryCode()

            // Send the recovery code via SMS
            sendSms(phoneNumber, recoveryCode)
        }
    }

    private fun sendSms(phoneNumber: String, recoveryCode: String) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN)

        val message = Message.creator(
            PhoneNumber(phoneNumber),
            PhoneNumber(TWILIO_PHONE_NUMBER),
            "Your recovery code is: $recoveryCode"
        ).create()

        // Handle the result of the message sending (success or failure)
        // Implement the necessary logic here based on the result
    }

    // Replace this with your actual code to generate a recovery code
    private fun generateRecoveryCode(): String {
        // Implement logic to generate a recovery code (e.g., using random numbers)
        return "123456"  // Example recovery code; replace with your code generation logic
    }
}
