package com.oumaymasapplication.app.modules.frame221.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Frame221Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMohammadreza: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_oumayma_cherif)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6105: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalcalories: String? = MyApp.getInstance().resources.getString(R.string.lbl_saved)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt346copy: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowers: String? = MyApp.getInstance().resources.getString(R.string.lbl_participation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_your_favo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailableforh: String? = MyApp.getInstance().resources.getString(R.string.lbl_interest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnLive: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_games_online)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_concert)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)

)
