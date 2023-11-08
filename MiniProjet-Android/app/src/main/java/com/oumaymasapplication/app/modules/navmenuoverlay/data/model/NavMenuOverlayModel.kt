package com.oumaymasapplication.app.modules.navmenuoverlay.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NavMenuOverlayModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRasith: String? = MyApp.getInstance().resources.getString(R.string.lbl_rasith)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRasith001: String? = MyApp.getInstance().resources.getString(R.string.lbl_rasith001)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRewards: String? = MyApp.getInstance().resources.getString(R.string.lbl_rewards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExit: String? = MyApp.getInstance().resources.getString(R.string.lbl_exit)

)
