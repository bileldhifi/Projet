package com.oumaymasapplication.app.modules.eight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.eight.`data`.model.EightModel
import org.koin.core.KoinComponent

class EightVM : ViewModel(), KoinComponent {
  val eightModel: MutableLiveData<EightModel> = MutableLiveData(EightModel())

  var navArguments: Bundle? = null
}
