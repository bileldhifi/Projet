package com.oumaymasapplication.app.modules.itemframe215.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemFrame215Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_sign_in_to_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemeberme: String? = MyApp.getInstance().resources.getString(R.string.lbl_remeber_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotthepass: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_the_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinuewit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_ac)

)
