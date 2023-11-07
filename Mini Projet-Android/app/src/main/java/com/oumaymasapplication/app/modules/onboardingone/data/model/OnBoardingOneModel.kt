package com.oumaymasapplication.app.modules.onboardingone.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnBoardingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeNeedToChan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_need_to_chan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)

)
