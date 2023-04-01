package com.nochita.survivors.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.nochita.survivors.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val balanceCryptoTextView: TextView = binding.textBalanceCrypto
        homeViewModel.balanceCrypto.observe(viewLifecycleOwner) {
            balanceCryptoTextView.text = it
        }

        val balanceARSTextView: TextView = binding.textBalanceArs
        homeViewModel.balanceARS.observe(viewLifecycleOwner) {
            balanceARSTextView.text = it
        }

        val addressText: TextView = binding.textAddress
        homeViewModel.address.observe(viewLifecycleOwner) {
            addressText.text = it
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}