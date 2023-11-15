import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import com.example.ecocitoyen_frontend.R
import com.example.ecocitoyen_frontend.Models.Reclamation


class Reclamation : AppCompatActivity() {
    private lateinit var spinnerType: Spinner
    private lateinit var editTextTitle: EditText
    private lateinit var editTextDescription: EditText
    private lateinit var imagePreview: ImageView
    private lateinit var btnAddReclamation: Button

    private val PICK_IMAGE_REQUEST = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_rec)

        spinnerType = findViewById(R.id.spinnerType)
        editTextTitle = findViewById(R.id.editTextTitle)
        editTextDescription = findViewById(R.id.editTextDescription)

        btnAddReclamation = findViewById(R.id.btnAddImg)

        // Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.reclamation_types,
            android.R.layout.simple_spinner_item
        )

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        spinnerType.adapter = adapter

        btnAddReclamation.setOnClickListener {
            val reclamation = Reclamation(
                id = 1,  // Provide the appropriate ID
                title = editTextTitle.text.toString(),
                type = spinnerType.selectedItem.toString(),
                description = editTextDescription.text.toString(),
                id_user = 123  // Provide the appropriate user ID
            )
            Log.i("rec",reclamation.toString())
            // Send the reclamation data to the server

        }


    }




    }

