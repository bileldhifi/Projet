package com.oumaymasapplication.app.modules.frame222.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Frame222Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtNews: String? = MyApp.getInstance().resources.getString(R.string.lbl_news)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtN: String? = MyApp.getInstance().resources.getString(R.string.msg_help_them_for_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNOne: String? = MyApp.getInstance().resources.getString(R.string.msg_help_them_for_b)
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
