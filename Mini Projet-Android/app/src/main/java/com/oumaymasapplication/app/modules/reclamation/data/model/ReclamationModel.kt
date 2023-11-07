package com.oumaymasapplication.app.modules.reclamation.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReclamationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtContactUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_anyone_want_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_05_20_21_6_57pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFremont: String? = MyApp.getInstance().resources.getString(R.string.lbl_fremont)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComment: String? = MyApp.getInstance().resources.getString(R.string.lbl_comment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessage: String? = MyApp.getInstance().resources.getString(R.string.lbl_message)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_oumayma_cherif)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWritesomething: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_something)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReclamation: String? = MyApp.getInstance().resources.getString(R.string.lbl_reclamation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUniversityHeig: String? =
      MyApp.getInstance().resources.getString(R.string.msg_university_heig)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIwouldliketo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_would_like_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_avis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_proposition)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_reclamation2)
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
  var txtSettingsTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup108Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNameFiveValue: String? = null
)
