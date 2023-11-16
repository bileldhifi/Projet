import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import tn.esprit.front.R
import tn.esprit.front.RegisterActivity


class MoreInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.more_info_layout)

        val btContButton: ImageButton = findViewById(R.id.bt_cont)
        val btnextButton: ImageButton = findViewById(R.id.btnext)

        btContButton.setOnClickListener {
            // Navigate to the same layout with different content
            val intent = Intent(this, MoreInfoActivity::class.java)
            // Pass any data needed for the new layout
            intent.putExtra("title", "Different Title")
            intent.putExtra("description", "Different description.")
            startActivity(intent)
        }

        btnextButton.setOnClickListener {
            // Navigate to the register layout for account creation
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
