package com.example.chapterempat.toastsnackbar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.chapterempat.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_screen1.*

class Screen1Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_fragment_toast.setOnClickListener {
            Toast.makeText(requireContext(), "Ini adalah Toast Fragment", Toast.LENGTH_LONG).show()
        }

        btn_fragment_snackbar.setOnClickListener {
            Snackbar.make(it, "Pindah ke halaman berikutnya", Snackbar.LENGTH_INDEFINITE)
                .setAction("Pindah"){
                    Navigation.findNavController(view).navigate(R.id.action_screen1Fragment_to_screen2Fragment)
                }
                .show()
        }
    }
}