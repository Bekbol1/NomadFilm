package com.example.nomadfilm_1.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.nomadfilm_1.R
import com.example.nomadfilm_1.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel = ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val button: Button = binding.entryButton
        val etEmail: EditText = binding.emailEdit
        val etPassword: EditText = binding.passwordEdit

        button.setOnClickListener {
            val enteredLogin = etEmail.text.toString()
            val enteredPassword = etPassword.text.toString()

            if (enteredLogin == "admin" && enteredPassword == "admin") {
                Toast.makeText(activity, "Вы успешно вошли", Toast.LENGTH_SHORT).show()
                val navController = findNavController()
                navController.navigate(R.id.navigation_profile_entry)
            } else {
                Toast.makeText(activity, "Неправильный логин или пароль", Toast.LENGTH_SHORT).show()
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

