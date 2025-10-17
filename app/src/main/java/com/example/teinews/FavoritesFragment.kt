package com.example.teinews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teinews.databinding.FragmentFavoritesBinding

class FavoritesFragment : Fragment() {

    private var _binding: FragmentFavoritesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoritesBinding.inflate(inflater, container, false)

        val favorites = listOf(
            "Intel anuncia nueva generación de procesadores",
            "Top 10 innovaciones tecnológicas del año"
        )

        binding.recyclerViewFavorites.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewFavorites.adapter = NewsAdapter(favorites)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
