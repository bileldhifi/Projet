package com.oumaymasapplication.app.modules.frame216.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Frame216Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectwhichco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_which_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSMSOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_email3)

)
