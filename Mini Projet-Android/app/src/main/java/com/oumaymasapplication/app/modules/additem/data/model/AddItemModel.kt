package com.oumaymasapplication.app.modules.additem.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddItemModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_item)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddPhoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
