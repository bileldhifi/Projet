package com.oumaymasapplication.app.modules.seven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.seven.`data`.model.SevenModel
import org.koin.core.KoinComponent

class SevenVM : ViewModel(), KoinComponent {
  val sevenModel: MutableLiveData<SevenModel> = MutableLiveData(SevenModel())

  var navArguments: Bundle? = null
}
