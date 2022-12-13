package com.example.myrecipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myrecipes.databinding.ShoppinglistFragmentBinding


/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ShoppingListFragment : Fragment() {

    private var _binding:ShoppinglistFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ShoppinglistFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.previousButton.setOnClickListener {
            findNavController().navigate(R.id.action_FoodFragment_to_DayFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}