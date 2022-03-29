package com.example.chapterempat.toastsnackbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.fragment_screen2.*

class Screen2Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_fragment_kembali.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_screen2Fragment_to_screen1Fragment)
        }
    }
}