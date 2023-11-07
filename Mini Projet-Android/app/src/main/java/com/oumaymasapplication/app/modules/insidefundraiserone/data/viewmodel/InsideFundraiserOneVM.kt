package com.oumaymasapplication.app.modules.insidefundraiserone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.insidefundraiserone.`data`.model.InsideFundraiserOneModel
import org.koin.core.KoinComponent

class InsideFundraiserOneVM : ViewModel(), KoinComponent {
  val insideFundraiserOneModel: MutableLiveData<InsideFundraiserOneModel> =
      MutableLiveData(InsideFundraiserOneModel())

  var navArguments: Bundle? = null
}
