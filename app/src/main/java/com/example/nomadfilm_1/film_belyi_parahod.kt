package com.example.nomadfilm_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class film_belyi_parahod : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_film_belyi_parahod, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trailerImageButton = view.findViewById<Button>(R.id.trailer_btn)
        trailerImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TH__yG9gz5M&pp=ygUo0LHQtdC70YvQuSDQv9Cw0YDQvtGF0L7QtCDRgtGA0LXQudC70LXRgA%3D%3D"))
            startActivity(intent)

        }

        val watchImageButton = view.findViewById<Button>(R.id.watch_btn)
        watchImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TH__yG9gz5M&pp=ygUg0LHQtdC70YvQuSDQv9Cw0YDQvtGF0L7QtCDRgtGA0LU%3D"))
            startActivity(intent)

        }
    }

}