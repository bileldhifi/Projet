package com.oumaymasapplication.app.modules.frame220.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame220.`data`.model.Frame220Model
import com.oumaymasapplication.app.modules.frame220.`data`.model.ListuserRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Frame220VM : ViewModel(), KoinComponent {
  val frame220Model: MutableLiveData<Frame220Model> = MutableLiveData(Frame220Model())

  var navArguments: Bundle? = null

  val listuserList: MutableLiveData<MutableList<ListuserRowModel>> =
      MutableLiveData(mutableListOf())
}
