package com.oumaymasapplication.app.modules.frame225.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame225.`data`.model.Frame225Model
import com.oumaymasapplication.app.modules.frame225.`data`.model.ListleftRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Frame225VM : ViewModel(), KoinComponent {
  val frame225Model: MutableLiveData<Frame225Model> = MutableLiveData(Frame225Model())

  var navArguments: Bundle? = null

  val listleftList: MutableLiveData<MutableList<ListleftRowModel>> =
      MutableLiveData(mutableListOf())
}
