package com.oumaymasapplication.app.modules.seven.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtElectric: String? = MyApp.getInstance().resources.getString(R.string.lbl_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClothes: String? = MyApp.getInstance().resources.getString(R.string.lbl_clothes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMedic: String? = MyApp.getInstance().resources.getString(R.string.lbl_medic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBloodDonation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_blood_donation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPackage: String? = MyApp.getInstance().resources.getString(R.string.lbl_package)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSaved: String? = MyApp.getInstance().resources.getString(R.string.lbl_saved)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
