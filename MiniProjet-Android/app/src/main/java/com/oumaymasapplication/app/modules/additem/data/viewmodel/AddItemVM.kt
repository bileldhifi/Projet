package com.oumaymasapplication.app.modules.additem.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.additem.`data`.model.AddItemModel
import org.koin.core.KoinComponent

class AddItemVM : ViewModel(), KoinComponent {
  val addItemModel: MutableLiveData<AddItemModel> = MutableLiveData(AddItemModel())

  var navArguments: Bundle? = null
}
