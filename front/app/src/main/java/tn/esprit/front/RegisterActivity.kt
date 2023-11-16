import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import tn.esprit.front.R
import com.facebook.CallbackManager
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.tasks.Task


class RegisterActivity : AppCompatActivity() {

    private lateinit var btfb: ImageButton
    private lateinit var btg: ImageButton
    private lateinit var btap: ImageButton
    private lateinit var btpswd: ImageButton
    private lateinit var signUpText: TextView
    private lateinit var callbackManager: CallbackManager
    private lateinit var mGoogleSignInClient: GoogleSignInClient
    private val RC_SIGN_IN = 9001 // Request code for Google Sign-In

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_layout)

        btfb = findViewById(R.id.btfb)
        btg = findViewById(R.id.btg)
        btap = findViewById(R.id.btap)
        btpswd = findViewById(R.id.btpswd)
        signUpText = findViewById(R.id.tvsignup)

        // Initialize CallbackManager for Facebook login
        callbackManager = CallbackManager.Factory.create()

        // Set up Google Sign-In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)

        // Set click listeners for each button

        // Perform Facebook login when Facebook button is clicked
        btfb.setOnClickListener {
            LoginManager.getInstance().logInWithReadPermissions(
                this,
                listOf("public_profile", "email")
            )
        }

        // Start Google Sign-In flow when Google button is clicked
        btg.setOnClickListener {
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }

        // Perform Apple Sign-In when Apple button is clicked
        btap.setOnClickListener {
            // Implement Apple Sign-In functionality here
            // val appleSignIn = SignInWithApple(this)
            // appleSignIn.signIn(object : SignInWithApple.SignInCallback {
            //     override fun onSignInSuccess(authorizationCode: String?, user: SignInWithApple.User?) {
            //         // Handle successful sign-in with Apple
            //         // Get user details from the 'user' object if required
            //     }
            //
            //     override fun onSignInFailure(error: Throwable?) {
            //         // Handle sign-in failure with Apple
            //     }
            // })
        }

        // Handle regular registration with email and password when Password button is clicked
        btpswd.setOnClickListener {
            // Handle regular registration with email and password

            // After successful registration, navigate to the FillProfileActivity
            val intent = Intent(this, FillProfileActivity::class.java)
            startActivity(intent)
        }

        // Handle click on "Sign up" text
        signUpText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    // Override onActivityResult to handle the result of the login process
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Handle Google Sign-In result
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleGoogleSignInResult(task)
        }

        // Handle Facebook callback result
        callbackManager.onActivityResult(requestCode, resultCode, data)
    }

    private fun handleGoogleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)


            // Signed in successfully, show authenticated UI.
            // You can get user details from the GoogleSignInAccount object.
        } catch (e: ApiException) {
            // The ApiException status code indicates the error that occurred during the sign-in process.
        }
    }
}
