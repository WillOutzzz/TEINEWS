package com.example.teinews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teinews.databinding.FragmentReadLaterBinding

class ReadLaterFragment : Fragment() {

    private var _binding: FragmentReadLaterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReadLaterBinding.inflate(inflater, container, false)

        val savedArticles = listOf(
            "Robótica y automatización en el hogar",
            "El impacto del metaverso en la educación"
        )

        binding.recyclerViewReadLater.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewReadLater.adapter = NewsAdapter(savedArticles)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
