package com.oumaymasapplication.app.modules.rewards.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.rewards.`data`.model.RewardsModel
import org.koin.core.KoinComponent

class RewardsVM : ViewModel(), KoinComponent {
  val rewardsModel: MutableLiveData<RewardsModel> = MutableLiveData(RewardsModel())

  var navArguments: Bundle? = null
}
