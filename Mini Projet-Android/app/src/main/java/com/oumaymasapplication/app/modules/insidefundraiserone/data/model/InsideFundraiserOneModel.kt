package com.oumaymasapplication.app.modules.insidefundraiserone.`data`.model

import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InsideFundraiserOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_created_3_day_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpthemforb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_help_them_for_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt120donated: String? = MyApp.getInstance().resources.getString(R.string.lbl_120_donated)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_goals_2_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_raised_1900)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonikaIslam: String? = MyApp.getInstance().resources.getString(R.string.lbl_monika_islam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDhakaBanglades: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dhaka_banglades)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescrption: String? = MyApp.getInstance().resources.getString(R.string.lbl_descrption)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCommentsFiftyEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_comments_58)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol4)

)
