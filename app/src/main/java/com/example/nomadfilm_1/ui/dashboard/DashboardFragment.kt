package com.example.nomadfilm_1.ui.dashboard

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.nomadfilm_1.R
import com.example.nomadfilm_1.databinding.FragmentDashboardBinding

class DashboardFragment() : Fragment(), Parcelable {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DashboardFragment> {
        override fun createFromParcel(parcel: Parcel): DashboardFragment {
            return DashboardFragment(parcel)
        }

        override fun newArray(size: Int): Array<DashboardFragment?> {
            return arrayOfNulls(size)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val advice2ImageButton = binding.imAdvice2
        advice2ImageButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_serial_sake)
        }

        val advice1ImageButton = binding.imAdvice1
        advice1ImageButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.gg_show_fragment)
        }

        val adviceImageButton = binding.imAdvice
        adviceImageButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_chernyi_dvor)
        }

        val comedyButton = binding.comedyBtn
        comedyButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_comedy)
        }

        val criminalButton = binding.criminalBtn
        criminalButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_criminal)
        }

        val detectiveButton = binding.detectiveBtn
        detectiveButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_detective)
        }

        val dramaButton = binding.drameBtn
        dramaButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.navigation_drame)
        }
        val result1 = binding.etSearch
        result1.setOnClickListener {
            val searchText = result1.text.toString().trim()
            val navController = findNavController()

            when (searchText) {
                "5:32" -> navController.navigate(R.id.navigation_5_32)
                "Черный двор" -> navController.navigate(R.id.navigation_chernyi_dvor)
                "Первый учитель" -> navController.navigate(R.id.navigation_pervyi_uchitel)
                "Песнь древа" -> navController.navigate(R.id.navigation_pesnya_dreva)
                "Агай" -> navController.navigate(R.id.navigation_agai)
                "Последний урок" -> navController.navigate(R.id.navigation_akyrky_sabak)
                "Белый параход" -> navController.navigate(R.id.navigation_belyi_parahod)
                "Курманжан-Датка" -> navController.navigate(R.id.navigation_kurmanjan)
                "Материнское поле" -> navController.navigate(R.id.navigation_materinskoe)
                "Cалем мен Нурлан" -> navController.navigate(R.id.navigation_salem_men)
                "Шекер" -> navController.navigate(R.id.navigation_sheker)
                "Аяш" -> navController.navigate(R.id.navigation_ayash)
                else -> {
                    // Если введенный текст не соответствует ни одному фильму, можно выполнить другое действие или отобразить сообщение об ошибке.
                }
            }
        }
    }
}
