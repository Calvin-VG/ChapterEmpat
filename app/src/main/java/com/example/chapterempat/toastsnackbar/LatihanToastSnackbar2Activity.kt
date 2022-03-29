package com.example.chapterempat.toastsnackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapterempat.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_latihan_toast_snackbar2.*

class LatihanToastSnackbar2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_toast_snackbar2)

        btn_snackbar_latihan.setOnClickListener {
            Snackbar.make(it, "Pindah ke halaman sebelumnya", Snackbar.LENGTH_INDEFINITE)
                .setAction("Move"){
                    val a = Intent(this, LatihanToastSnackbarActivity::class.java)
                    startActivity(a)
                }
                .show()
        }
    }
}