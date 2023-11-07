package com.oumaymasapplication.app.modules.onboarding.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnBoardingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenActionsf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_green_actions_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_you_in)

)
