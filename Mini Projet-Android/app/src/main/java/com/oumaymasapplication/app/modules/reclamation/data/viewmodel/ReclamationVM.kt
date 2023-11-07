package com.oumaymasapplication.app.modules.reclamation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.reclamation.`data`.model.ReclamationModel
import com.oumaymasapplication.app.modules.reclamation.`data`.model.SpinnerGroupFourteenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReclamationVM : ViewModel(), KoinComponent {
  val reclamationModel: MutableLiveData<ReclamationModel> = MutableLiveData(ReclamationModel())

  var navArguments: Bundle? = null

  val spinnerGroupFourteenList: MutableLiveData<MutableList<SpinnerGroupFourteenModel>> =
      MutableLiveData()
}
