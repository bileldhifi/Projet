package com.oumaymasapplication.app.modules.recyclingdetailsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.recyclingdetailsone.`data`.model.Listtime1RowModel
import com.oumaymasapplication.app.modules.recyclingdetailsone.`data`.model.RecyclingDetailsOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecyclingDetailsOneVM : ViewModel(), KoinComponent {
  val recyclingDetailsOneModel: MutableLiveData<RecyclingDetailsOneModel> =
      MutableLiveData(RecyclingDetailsOneModel())

  var navArguments: Bundle? = null

  val listtimeList: MutableLiveData<MutableList<Listtime1RowModel>> =
      MutableLiveData(mutableListOf())
}
