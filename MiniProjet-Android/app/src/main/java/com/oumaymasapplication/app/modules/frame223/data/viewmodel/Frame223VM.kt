package com.oumaymasapplication.app.modules.frame223.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame223.`data`.model.Frame223Model
import com.oumaymasapplication.app.modules.frame223.`data`.model.List050721RowModel
import com.oumaymasapplication.app.modules.frame223.`data`.model.SpinnerNameThreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Frame223VM : ViewModel(), KoinComponent {
  val frame223Model: MutableLiveData<Frame223Model> = MutableLiveData(Frame223Model())

  var navArguments: Bundle? = null

  val spinnerNameThreeList: MutableLiveData<MutableList<SpinnerNameThreeModel>> = MutableLiveData()

  val list050721List: MutableLiveData<MutableList<List050721RowModel>> =
      MutableLiveData(mutableListOf())
}
