package com.oumaymasapplication.app.modules.frame211.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Frame211Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyourown: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_own)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)

)
