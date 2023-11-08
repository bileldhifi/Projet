package com.oumaymasapplication.app.modules.recyclingdetailsone.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RecyclingDetailsOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlastic: String? = MyApp.getInstance().resources.getString(R.string.lbl_plastic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCarton: String? = MyApp.getInstance().resources.getString(R.string.lbl_carton)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSports: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSportsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null
)
