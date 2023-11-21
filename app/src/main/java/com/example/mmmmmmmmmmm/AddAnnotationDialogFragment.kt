package com.example.mmmmmmmmmmm
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.example.mmmmmmmmmmm.Model.Location

class AddAnnotationDialogFragment : DialogFragment() {

    interface AddAnnotationListener {
        fun onAnnotationAdded(location: Location)
    }

    var listener: AddAnnotationListener? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dialog_add_annotation, container, false)

        val nameEditText = view.findViewById<EditText>(R.id.name_edittext)
        val categoryEditText = view.findViewById<EditText>(R.id.category_edittext)
        val instructionEditText = view.findViewById<EditText>(R.id.instruction_edittext)
        val addressEditText = view.findViewById<EditText>(R.id.address_edittext)
        val submitButton = view.findViewById<Button>(R.id.submit_button)
        val latitudeTextView = view.findViewById<TextView>(R.id.latitudeTextView)
        val longitudeTextView = view.findViewById<TextView>(R.id.longitudeTextView)
        val description = view.findViewById<TextView>(R.id.description)

        // Retrieve latitude and longitude passed from the activity
        val latitude = arguments?.getDouble("latitude", 0.0) ?: 0.0
        val longitude = arguments?.getDouble("longitude", 0.0) ?: 0.0

        // Set the latitude and longitude values to TextViews
        latitudeTextView.text = latitude.toString()
        longitudeTextView.text = longitude.toString()


        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val category = categoryEditText.text.toString()
            val instruction = instructionEditText.text.toString()
            val address = addressEditText.text.toString()
            val description = description.text.toString()
            // Create a Location object with all the data
            val location = Location(name, latitude,longitude, address, category, instruction, description)

            listener?.onAnnotationAdded(location)

            dismiss()
        }

        return view
    }

}
