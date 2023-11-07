package com.oumaymasapplication.app.modules.recyclingdetails.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListtimeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_wed_apr_28_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jo_malone_londo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt24min: String? = MyApp.getInstance().resources.getString(R.string.msg_radius_gallery)

)
