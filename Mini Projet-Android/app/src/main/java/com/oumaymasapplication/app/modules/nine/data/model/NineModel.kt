package com.oumaymasapplication.app.modules.nine.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecyclingCentr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recycling_centr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocation123x: String? =
      MyApp.getInstance().resources.getString(R.string.msg_location_123_x)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecycleCategor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recycle_categor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_cardboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlastic: String? = MyApp.getInstance().resources.getString(R.string.lbl_plastic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInstructions: String? = MyApp.getInstance().resources.getString(R.string.lbl_instructions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForCardboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_for_cardboard)

)
