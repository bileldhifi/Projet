package com.oumaymasapplication.app.modules.frame223.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class List050721RowModel(
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
  var txtGroupFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
