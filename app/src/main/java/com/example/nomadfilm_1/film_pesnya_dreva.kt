package com.example.nomadfilm_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class film_pesnya_dreva : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_film_pesnya_dreva, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trailerImageButton = view.findViewById<Button>(R.id.trailer_btn)
        trailerImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OYOCfsLUuko&pp=ygUk0YLRgNC10LnQu9C10YAg0L_QtdGB0L3RjCDQtNGA0LXQstCw"))
            startActivity(intent)

        }

        val watchImageButton = view.findViewById<Button>(R.id.watch_btn)
        watchImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=I9_yQOX_tI4&pp=ygUm0L_QtdGB0L3RjCDQtNGA0LXQstCwINGB0LzQvtGC0YDQtdGC0Yw%3D"))
            startActivity(intent)

        }
    }

}