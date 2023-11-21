package com.example.front

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.PopupWindow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.zxing.integration.android.IntentIntegrator
import com.squareup.picasso.Picasso

class DetailsActivity : AppCompatActivity() {

    private lateinit var titleEvent: TextView
    private lateinit var descriptionEvent: TextView
    private lateinit var dateEvent: TextView
    private lateinit var lieuEvent: TextView
    private lateinit var organisation: TextView
    private lateinit var imageEvent: ImageView
    private lateinit var qrcode: ImageView

    companion object {
        private const val CAMERA_PERMISSION_REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        // Retrieve data from intent
        val name = intent.getStringExtra("name")
        val date = intent.getStringExtra("date")
        val description = intent.getStringExtra("description")
        val image = intent.getStringExtra("image")
        val lieu = intent.getStringExtra("lieu")
        val organisationH = intent.getStringExtra("organisation")
        val qrcodeh = intent.getStringExtra("qrcode")

        // Initialize UI elements
        titleEvent = findViewById(R.id.NameOrganization)
        descriptionEvent = findViewById(R.id.descriptionEvent)
        dateEvent = findViewById(R.id.DateEvent)
        lieuEvent = findViewById(R.id.AdressOrganization)
        organisation = findViewById(R.id.organisation)
        imageEvent = findViewById(R.id.ImageEvent)

        // Set data to UI elements
        titleEvent.text = name
        descriptionEvent.text = description
        dateEvent.text = date
        lieuEvent.text = lieu
        organisation.text = organisationH

        // Load image using Picasso
        Picasso.get().load("http://10.0.2.2:3000/$image").into(imageEvent)

        // Event button Qrcode
        val button: Button = findViewById(R.id.qrcode)
        val popupMenu = PopupMenu(this, button)
        popupMenu.menuInflater.inflate(R.menu.eventmenu, popupMenu.menu)

        // Handle clicks on menu items
        popupMenu.setOnMenuItemClickListener { menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.scanqrcode -> {
                    // Logic for option 1 (Scan QR Code)
                    Log.i("DetailsActivity", "Scan QR Code option selected")
                    checkCameraPermissionAndScanQRCode()
                    true
                }
                R.id.displayqrcode -> {
                    // Logic for option 2 (Display QR Code)
                    val displayInflater =
                        getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
                    val popupView: View =
                        displayInflater.inflate(R.layout.popup_layout, null)
                    qrcode = popupView.findViewById(R.id.QrCode)
                    Picasso.get().load("http://10.0.2.2:3000/$qrcodeh").into(qrcode)

                    // Create and show the popup window
                    showQRCodePopup(popupView)
                    true
                }
                else -> false
            }
        }

        // Show the popup menu when the button is clicked
        button.setOnClickListener {
            popupMenu.show()
        }
    }

    private fun showQRCodePopup(popupView: View) {
        val popupWindow = PopupWindow(
            popupView,
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        // Get a reference to the close button in the popup
        val closeButton: Button = popupView.findViewById(R.id.closeButton)

        // Set up a click listener for the close button to dismiss the popup
        closeButton.setOnClickListener {
            popupWindow.dismiss()
        }

        // Set background color for the popup window
        popupWindow.setBackgroundDrawable(
            ColorDrawable(ContextCompat.getColor(this, R.color.gris1))
        )

        // Display the popup at the center of the screen
        popupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0)
    }

    private fun checkCameraPermissionAndScanQRCode() {
        // Check for camera permission
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // Request permission if not granted
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CAMERA),
                CAMERA_PERMISSION_REQUEST_CODE
            )
        } else {
            // Permission already granted, start scanning
            startQRCodeScanning()
        }
    }

    private fun startQRCodeScanning() {
        val integrator = IntentIntegrator(this)
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE)
        integrator.setPrompt("Scan a QR Code")
        integrator.setCameraId(0)  // Use front camera (0) or back camera (1)
        integrator.setBeepEnabled(true)
        integrator.setBarcodeImageEnabled(false)
        integrator.initiateScan()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            CAMERA_PERMISSION_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission granted, start scanning
                    startQRCodeScanning()
                } else {
                    // Permission denied
                    // Handle the denial case
                    Log.e("DetailsActivity", "Camera permission denied")
                }
                return
            }
            // Handle other permission requests if any
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.contents != null) {
                // Handle the scanned QR code result
                val scannedData = result.contents
                // Now, you can use the scannedData to retrieve information about the specific event
                Log.i("DetailsActivity", "ScannedData: $scannedData")
            }
        }
    }

    fun backHome(view: View) {
        val intent = Intent(this, menuClient::class.java)
        startActivity(intent)
    }
}
