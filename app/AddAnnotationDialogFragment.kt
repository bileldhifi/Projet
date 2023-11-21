import android.app.DialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class AddAnnotationDialogFragment : DialogFragment() {

    // Define an interface to communicate with the host activity
    interface AddAnnotationListener {
        fun onAnnotationAdded(name: String, category: String, instruction: String, address: String)
    }

    var listener: AddAnnotationListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.dialog_add_annotation, container, false)

        // Initialize the EditText fields and the Submit button
        val nameEditText = view.findViewById<EditText>(R.id.name_edittext)
        val categoryEditText = view.findViewById<EditText>(R.id.category_edittext)
        val instructionEditText = view.findViewById<EditText>(R.id.instruction_edittext)
        val addressEditText = view.findViewById<EditText>(R.id.address_edittext)
        val submitButton = view.findViewById<Button>(R.id.submit_button)

        // Set up the button click listener
        submitButton.setOnClickListener {
            // Retrieve the data from the EditText fields
            val name = nameEditText.text.toString()
            val category = categoryEditText.text.toString()
            val instruction = instructionEditText.text.toString()
            val address = addressEditText.text.toString()

            // Pass the data back to the host activity through the interface
            listener?.onAnnotationAdded(name, category, instruction, address)

            // Dismiss the dialog
            dismiss()
        }

        return view
    }
}
