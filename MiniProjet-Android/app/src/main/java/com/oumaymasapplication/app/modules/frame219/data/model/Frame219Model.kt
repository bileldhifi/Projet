package com.oumaymasapplication.app.modules.frame219.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Frame219Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectYourInt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_your_int)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseyourint: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_your_int)

)
