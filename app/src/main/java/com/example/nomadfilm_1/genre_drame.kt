package com.example.nomadfilm_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

class genre_drame : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_genre_drame, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ImageButton1 = view.findViewById<ImageButton>(R.id.im)
        ImageButton1.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_kurmanjan)
        }

        val ImageButton2 = view.findViewById<ImageButton>(R.id.im2)
        ImageButton2.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_belyi_parahod)
        }

        val ImageButton3 = view.findViewById<ImageButton>(R.id.im3)
        ImageButton3.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_materinskoe)
        }

        val ImageButton4 = view.findViewById<ImageButton>(R.id.im4)
        ImageButton4.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_pervyi_uchitel)
        }
        val ImageButton5 = view.findViewById<ImageButton>(R.id.im5)
        ImageButton5.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_pesnya_dreva)
        }
        val ImageButton6 = view.findViewById<ImageButton>(R.id.im6)
        ImageButton6.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_akyrky_sabak)
        }
    }
}