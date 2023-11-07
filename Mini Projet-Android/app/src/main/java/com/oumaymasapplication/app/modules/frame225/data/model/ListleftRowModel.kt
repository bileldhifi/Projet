package com.oumaymasapplication.app.modules.frame225.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListleftRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLeftOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_182)

)
