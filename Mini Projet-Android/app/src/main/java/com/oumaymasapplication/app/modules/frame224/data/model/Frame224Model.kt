package com.oumaymasapplication.app.modules.frame224.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Frame224Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtVolunteerhours: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_volunteer_hours)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_collecting_and)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt050721: String? = MyApp.getInstance().resources.getString(R.string.lbl_05_07_21)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSweptthewalkw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swept_the_walkw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt043021: String? = MyApp.getInstance().resources.getString(R.string.lbl_04_30_21)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrganizedthes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_organized_the_s)
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
