package com.example.front

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
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
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.front.data.Organization
import com.squareup.picasso.Picasso


class OrganizationActivity : AppCompatActivity() {

    lateinit var nameOrganization : TextView
    lateinit var dateOrganization : TextView
    lateinit var adresseOrganization : TextView
    lateinit var emailOrganization : TextView
    lateinit var lieuOrganisation : TextView
    lateinit var lienOrganization : ImageView
    // lateinit var  qrcode : ImageView
   // lateinit var image: Image
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_organization)

       val inflater = LayoutInflater.from(this)
       //val popup_layout: View = inflater.inflate(R.layout.popup_layout, null, false)
        val name = intent.getStringExtra("name")
        val date = intent.getStringExtra("date")
       val lien = intent.getStringExtra("lien")
       val email = intent.getStringExtra("email")
       val address= intent.getStringExtra("address")
       //val organisationH = intent.getStringExtra("organisation")
       //val qrcodeh = intent.getStringExtra("qrcode")

       //Log.i("testt",qrcodeh.toString())

       nameOrganization = findViewById(R.id.NameOrganization)
       dateOrganization = findViewById(R.id.DateOrganization)
       adresseOrganization = findViewById(R.id.AdresseOrganization)
       lieuOrganisation = findViewById(R.id.LieuOrganization)
       emailOrganization = findViewById(R.id.EmailOrganisation)
       // lienOrganization = findViewById(R.id.LienOrganization)



       nameOrganization.text = name
       lieuOrganisation.text = lien
         dateOrganization.text = date
       adresseOrganization.text = address
       emailOrganization.text = email

      // Picasso.get().load("http://10.0.2.2:3000/"+image).into(imageEvent);



       //event  button Qrcode
      // val button: Button = findViewById(R.id.qrcode)
      // val popupMenu = PopupMenu(this, button)
       //popupMenu.menuInflater.inflate(R.menu.eventmenu, popupMenu.menu)

       // Gérez les clics sur les éléments du menu
      // popupMenu.setOnMenuItemClickListener { menuItem: MenuItem ->
         //  when (menuItem.itemId) {
            //   R.id.scanqrcode -> {
                   // Logique pour l'option 1
               //    Log.i("test","scanqrcode")
                //   true
             //  }
             //  R.id.displayqrcode -> {
                   // Logique pour l'option 2
                   // Utilisez LayoutInflater pour créer une vue à partir du fichier XML de la popup
                 //  val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
                  // val popupView: View = inflater.inflate(R.layout.popup_layout, null)
                 //  qrcode = popupView.findViewById(R.id.QrCode)
                  // Picasso.get().load("http://10.0.2.2:3000/"+qrcodeh).into(qrcode);
                   // Créez la popup en spécifiant la vue, la largeur et la hauteur
                 //  val popupWindow = PopupWindow(
                  //     popupView,
                  //     LinearLayout.LayoutParams.WRAP_CONTENT,
                     //  LinearLayout.LayoutParams.WRAP_CONTENT
                   //)

                   // Obtenez une référence au bouton de fermeture dans la popup
                  // val closeButton: Button = popupView.findViewById(R.id.closeButton)

                   // Configurez un clic sur le bouton de fermeture pour fermer la popup
                  // closeButton.setOnClickListener {
                    //   popupWindow.dismiss()
                   //}
                  // popupWindow.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.gris1)))


                   // Affichez la popup au centre de l'écran
                  // popupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0)

                  // true
              // }
             //  else -> false
           //}
      // }
     //  button.setOnClickListener {
     //      popupMenu.show()
      // }

    }


    fun backHome(view: android.view.View) {
        val intent = Intent(this, menuClient::class.java)
        startActivity(intent)
    }
}