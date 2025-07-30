package com.example.aula2703.ui.computacao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.aula2703.databinding.FragmentCienciaComputacaoBinding

class ComputacaoFragment : Fragment() {

    private var _binding: FragmentCienciaComputacaoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ComputacaoViewModel =
            ViewModelProvider(this).get(ComputacaoViewModel::class.java)

        _binding = FragmentCienciaComputacaoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textComputacao
        ComputacaoViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}