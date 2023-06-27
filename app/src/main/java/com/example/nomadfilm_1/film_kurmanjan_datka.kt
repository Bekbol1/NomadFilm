package com.example.nomadfilm_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class film_kurmanjan_datka : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_film_kurmanjan_datka, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trailerImageButton = view.findViewById<Button>(R.id.trailer_btn)
        trailerImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=go7dgbvK-_w&pp=ygUs0LrRg9GA0LzQsNC90LbQsNC9INC00LDRgtC60LAg0YLRgNC10LnQu9C10YA%3D"))
            startActivity(intent)

        }

        val watchImageButton = view.findViewById<Button>(R.id.watch_btn)
        watchImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=I3H86R3zx3E&t=2s&pp=ygUs0LrRg9GA0LzQsNC90LbQsNC9INC00LDRgtC60LAg0YLRgNC10LnQu9C10YA%3D"))
            startActivity(intent)

        }
    }

}