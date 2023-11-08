package tn.esprit.nascar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tn.esprit.nascar.databinding.FragmentEventsBinding

class EventsFragment : Fragment() {

    private lateinit var binding: FragmentEventsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment using data binding
        binding = FragmentEventsBinding.inflate(inflater, container, false)
        return binding.root
    }

    // Add any fragment-specific logic here
}
