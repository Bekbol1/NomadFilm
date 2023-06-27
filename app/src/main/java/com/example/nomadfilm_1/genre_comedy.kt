package com.example.nomadfilm_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController


class genre_comedy : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_genre_comedy, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ImageButton1 = view.findViewById<ImageButton>(R.id.im2)
        ImageButton1.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.gg_show_fragment)
        }

        val ImageButton2 = view.findViewById<ImageButton>(R.id.im)
        ImageButton2.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_serial_sake)
        }

        val ImageButton3 = view.findViewById<ImageButton>(R.id.im3)
        ImageButton3.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_salem_men)
        }

        val ImageButton4 = view.findViewById<ImageButton>(R.id.im4)
        ImageButton4.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_ayash)
        }

        }
    }
