package com.example.ecocitoyen_frontend


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.lifecycle.ViewModelProvider
import com.example.ecocitoyen_frontend.Models.Reclamation
import com.example.ecocitoyen_frontend.ViewModels.AddRec

class MainActivity : AppCompatActivity() {
    private lateinit var spinnerType: Spinner
    private lateinit var editTextTitle: EditText
    private lateinit var editTextDescription: EditText


    lateinit var AddRecViewModel: AddRec
    private val PICK_IMAGE_REQUEST = 100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_rec)
        spinnerType = findViewById(R.id.spinnerType)
        editTextTitle = findViewById(R.id.editTextTitle)
        editTextDescription = findViewById(R.id.editTextDescription)
        val btnAddReclamation = findViewById<Button>(R.id.btnAddImg)
        btnAddReclamation.setOnClickListener {




            val reclamation = Reclamation(
                id = 1,  // Provide the appropriate ID
                title = editTextTitle.text.toString(),
                type = spinnerType.selectedItem.toString(),
                description = editTextDescription.text.toString(),
                id_user = 123  // Provide the appropriate user ID
            )


            AddRecViewModel= ViewModelProvider(this).get(AddRec::class.java)
            AddRecViewModel.addBudget(reclamation)
            AddRecViewModel._addReclamationLiveData.observe(this, androidx.lifecycle.Observer<Reclamation?>{

            })

            // Send the reclamation data to the server
            startActivity(Intent(this, Detail_news::class.java))
        }


    }

}