package com.example.nomadfilm_1

import NameInputDialog
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment(), NameInputDialog.NameInputDialogListener {
    private lateinit var profileImageButton: ImageButton
    private lateinit var profileNameTextView: TextView
    private val NAME_DIALOG_TAG = "name_dialog"

    private val galleryLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            val imageUri: Uri? = data?.data
            // Обработка выбранного изображения, например, установка выбранного изображения в `ImageButton`
            profileImageButton.setImageURI(imageUri)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        profileImageButton = view.findViewById(R.id.profile_image)
        profileImageButton.setOnClickListener {
            openGallery()
        }

        profileNameTextView = view.findViewById(R.id.profile_name)
        profileNameTextView.setOnClickListener {
            showNameInputDialog()
        }
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        galleryLauncher.launch(intent)
    }

    override fun onNameEntered(name: String) {
        profileNameTextView.text = name
    }

    private fun showNameInputDialog() {
        val dialog = NameInputDialog()
        dialog.setTargetFragment(this, 1)
        dialog.show(parentFragmentManager, NAME_DIALOG_TAG)
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            val name = data?.getStringExtra("name")
            name?.let {
                profileNameTextView.text = it
            }
        }
    }
}
