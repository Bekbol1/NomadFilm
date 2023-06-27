package com.example.nomadfilm_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class film_pervyi_uchitel : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_film_pervyi_uchitel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trailerImageButton = view.findViewById<Button>(R.id.trailer_btn)
        trailerImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jOzg8GXT7RU&pp=ygUq0L_QtdGA0LLRi9C5INGD0YfQuNGC0LXQu9GMINGC0YDQtdC50LvQtdGA"))
            startActivity(intent)

        }

        val watchImageButton = view.findViewById<Button>(R.id.watch_btn)
        watchImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=EQfJup0icfU&pp=ygUs0L_QtdGA0LLRi9C5INGD0YfQuNGC0LXQu9GMINGB0LzQvtGC0YDQtdGC0Yw%3D"))
            startActivity(intent)

        }
    }

}