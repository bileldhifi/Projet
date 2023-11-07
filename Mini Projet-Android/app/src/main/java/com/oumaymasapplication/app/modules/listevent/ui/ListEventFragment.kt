package com.oumaymasapplication.app.modules.listevent.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseFragment
import com.oumaymasapplication.app.databinding.FragmentListEventBinding
import com.oumaymasapplication.app.modules.listevent.`data`.model.ListEventRowModel
import com.oumaymasapplication.app.modules.listevent.`data`.viewmodel.ListEventVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ListEventFragment : BaseFragment<FragmentListEventBinding>(R.layout.fragment_list_event) {
  private val viewModel: ListEventVM by viewModels<ListEventVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listEventAdapter = ListEventAdapter(viewModel.listEventList.value?:mutableListOf())
    binding.recyclerListEvent.adapter = listEventAdapter
    listEventAdapter.setOnItemClickListener(
    object : ListEventAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListEventRowModel) {
        onClickRecyclerListEvent(view, position, item)
      }
    }
    )
    viewModel.listEventList.observe(requireActivity()) {
      listEventAdapter.updateData(it)
    }
    binding.listEventVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListEvent(
    view: View,
    position: Int,
    item: ListEventRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIST_EVENT_FRAGMENT"


    fun getInstance(bundle: Bundle?): ListEventFragment {
      val fragment = ListEventFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
