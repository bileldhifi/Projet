package com.oumaymasapplication.app.modules.rewards.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RewardsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRewards: String? = MyApp.getInstance().resources.getString(R.string.lbl_rewards2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClaimyourRewa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_claim_your_rewa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecycleoverTen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recycle_over_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClaimyourRewaOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_claim_your_rewa2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouCompleted: String? = MyApp.getInstance().resources.getString(R.string.lbl_you_completed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecycleoverTenOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recycle_over_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSaved: String? = MyApp.getInstance().resources.getString(R.string.lbl_saved)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
