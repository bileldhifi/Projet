package com.oumaymasapplication.app.modules.frame219.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame219.`data`.model.Frame219Model
import com.oumaymasapplication.app.modules.frame219.`data`.model.GridlocationRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Frame219VM : ViewModel(), KoinComponent {
  val frame219Model: MutableLiveData<Frame219Model> = MutableLiveData(Frame219Model())

  var navArguments: Bundle? = null

  val gridlocationList: MutableLiveData<MutableList<GridlocationRowModel>> =
      MutableLiveData(mutableListOf())
}
