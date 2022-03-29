package com.example.chapterempat.toastsnackbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.chapterempat.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_latihan_toas_snackbar.*

class LatihanToasSnackbarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_latihan_toas_snackbar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_fragment_toast_latihan.setOnClickListener {
            val nama = et_nama_latihan.text.toString()
            Toast.makeText(requireContext(), "Selamat Datang $nama", Toast.LENGTH_LONG).show()
        }

        btn_fragment_snackbar_latihan.setOnClickListener {
            Snackbar.make(it, "Pindah halaman", Snackbar.LENGTH_INDEFINITE)
                .setAction("Pindah"){
                    Navigation.findNavController(view).navigate(R.id.action_latihanToasSnackbarFragment_to_latihanToasSnackbar2Fragment)
                }
                .show()
        }
    }
}