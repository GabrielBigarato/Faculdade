package com.example.aula2703.ui.ads

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.aula2703.databinding.FragmentAnaliseDevSisBinding


class AdsFragment : Fragment() {

    private var _binding: FragmentAnaliseDevSisBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val AdsViewModel=
            ViewModelProvider(this).get(AdsViewModel::class.java)

        _binding = FragmentAnaliseDevSisBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAds
        AdsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}