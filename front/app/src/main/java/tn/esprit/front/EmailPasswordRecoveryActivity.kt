import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import tn.esprit.front.R  // Replace with your package name
import okhttp3.*
import java.io.IOException


class EmailPasswordRecoveryActivity : AppCompatActivity() {

    private lateinit var editTextEmail: EditText
    private lateinit var buttonSendCode: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_password_recovery)

        editTextEmail = findViewById(R.id.editTextEmail)
        buttonSendCode = findViewById(R.id.buttonSendCode)

        buttonSendCode.setOnClickListener {
            val emailAddress = editTextEmail.text.toString()

            // Replace with your Mailgun API details
            val apiKey = "b454d8ed13eee424f053d5b18e2c5c9b-1c7e8847-735c4eb0"
            val domain = "sandboxbfd1002d455d406c9a7c986e5dea59c6.mailgun.org"
            val senderEmail = "cawael09@gmail.com"

            // URL for sending emails through Mailgun
            val url = "https://api.mailgun.net/v3/$domain/messages"

            val client = OkHttpClient()

            val body = FormBody.Builder()
                .add("from", senderEmail)
                .add("to", emailAddress)
                .add("subject", "Forgot Password")
                .add("text", "Your recovery code is: 123456") // Replace with your generated OTP code
                .build()

            val request = Request.Builder()
                .url(url)
                .post(body)
                .addHeader("Authorization", Credentials.basic("api", apiKey))
                .build()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    // Handle failure (e.g., network issues)
                }

                override fun onResponse(call: Call, response: Response) {
                    // Handle response (e.g., email sent successfully)
                }
            })
        }
    }
}
