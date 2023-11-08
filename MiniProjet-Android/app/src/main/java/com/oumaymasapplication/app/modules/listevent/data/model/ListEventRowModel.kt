package com.oumaymasapplication.app.modules.listevent.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListEventRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpsarahtod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_help_sarah_to_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup15791: String? = MyApp.getInstance().resources.getString(R.string.lbl_medical)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
