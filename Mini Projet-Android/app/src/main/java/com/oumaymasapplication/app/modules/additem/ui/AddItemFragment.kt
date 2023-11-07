package com.oumaymasapplication.app.modules.additem.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseFragment
import com.oumaymasapplication.app.databinding.FragmentAddItemBinding
import com.oumaymasapplication.app.modules.additem.`data`.viewmodel.AddItemVM
import kotlin.String
import kotlin.Unit

class AddItemFragment : BaseFragment<FragmentAddItemBinding>(R.layout.fragment_add_item) {
  private val viewModel: AddItemVM by viewModels<AddItemVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.addItemVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "ADD_ITEM_FRAGMENT"


    fun getInstance(bundle: Bundle?): AddItemFragment {
      val fragment = AddItemFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
