package com.oumaymasapplication.app.modules.nine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.nine.`data`.model.NineModel
import org.koin.core.KoinComponent

class NineVM : ViewModel(), KoinComponent {
  val nineModel: MutableLiveData<NineModel> = MutableLiveData(NineModel())

  var navArguments: Bundle? = null
}
