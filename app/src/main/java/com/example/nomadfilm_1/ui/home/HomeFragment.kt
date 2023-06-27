package com.example.nomadfilm_1.ui.home

import FilmAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.nomadfilm_1.ItemDecoration
import com.example.nomadfilm_1.R
import com.example.nomadfilm_1.databinding.FragmentHomeBinding
import com.example.nomadfilm_1.ui.ActualFilms

class HomeFragment : Fragment(), FilmAdapter.OnItemClickListener {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: FilmAdapter
    private val imageIdList = listOf(
        R.drawable.im_5_32,
        R.drawable.im_chernyi_dvor,
        R.drawable.im_pervyi_uchitel,
        R.drawable.im_pesnya_dreva,
        R.drawable.im_agai,
        R.drawable.im_akyrkt_sabak,
        R.drawable.im_belyi_parahod,
        R.drawable.im_kurmanjan_datka,
        R.drawable.im_materinskoe_pole,
        R.drawable.im_salem_men_koyanbaev,
        R.drawable.im_sheker,
        R.drawable.im_ayash
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = FilmAdapter()
        adapter.setOnItemClickListener(this)

        initRecyclerView()
        populateRecyclerView()
    }

    private fun initRecyclerView() {
        binding.rcView.layoutManager = GridLayoutManager(requireContext(), 2)
        val spacing = resources.getDimensionPixelSize(R.dimen.film_item_spacing)
        binding.rcView.addItemDecoration(ItemDecoration(spacing))
        val bottomNavHeight = resources.getDimensionPixelSize(R.dimen.bottom_navigation_height)
        binding.rcView.setPadding(0, 0, 0, bottomNavHeight)
        binding.rcView.clipToPadding = false
        binding.rcView.adapter = adapter
    }


    override fun onItemClick(position: Int) {
        if (position == 0) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_5_32)
        }
        if (position == 1) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_chernyi_dvor)
        }
        if (position == 2) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_pervyi_uchitel)
        }
        if (position == 3) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_pesnya_dreva)
        }
        if (position == 5) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_akyrky_sabak)
        }
        if (position == 6) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_belyi_parahod)
        }
        if (position == 7) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_kurmanjan)
        }
        if (position == 4) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_agai)
        }
        if (position == 8) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_materinskoe)
        }
        if (position == 9) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_salem_men)
        }
        if (position == 10) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_sheker)
        }
        if (position == 11) {
            val navController = findNavController()
            navController.navigate(R.id.navigation_ayash)
        }
    }

    private fun populateRecyclerView() {
        val titles = listOf(
            "5:32",
            "Черный двор",
            "Первый учитель",
            "Песнь древа",
            "Агай",
            "Последний урок",
            "Белый параход",
            "Курманжан-Датка",
            "Материнское поле",
            "Cалем мен Нурлан",
            "Шекер",
            "Аяш"
        )

        val actualFilmsList = mutableListOf<ActualFilms>()
        for (i in imageIdList.indices) {
            val imageId = imageIdList[i]
            val title = titles[i]
            val actualFilms = ActualFilms(imageId, title)
            actualFilmsList.add(actualFilms)
        }

        adapter.updateData(actualFilmsList)
        binding.rcView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
