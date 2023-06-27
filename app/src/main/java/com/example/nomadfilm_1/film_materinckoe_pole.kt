package com.example.nomadfilm_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class film_materinckoe_pole : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_film_materinckoe_pole, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trailerImageButton = view.findViewById<Button>(R.id.trailer_btn)
        trailerImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=voA1lHu9dJs&pp=ygUu0LzQsNGC0LXRgNC40L3RgdC60L7QtSDQv9C-0LvQtSDRgtGA0LXQudC70LXRgA%3D%3D"))
            startActivity(intent)

        }

        val watchImageButton = view.findViewById<Button>(R.id.watch_btn)
        watchImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=t4-XlgV3-Jc&pp=ygUu0LzQsNGC0LXRgNC40L3RgdC60L7QtSDQv9C-0LvQtSDRgtGA0LXQudC70LXRgA%3D%3D"))
            startActivity(intent)

        }
    }

}