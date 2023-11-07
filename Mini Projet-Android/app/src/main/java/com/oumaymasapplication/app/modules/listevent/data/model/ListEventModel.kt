package com.oumaymasapplication.app.modules.listevent.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListEventModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEventslist: String? = MyApp.getInstance().resources.getString(R.string.lbl_events_list)

)
