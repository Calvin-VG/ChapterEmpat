package com.example.chapterempat.toastsnackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.activity_latihan_toast_snackbar.*

class LatihanToastSnackbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_toast_snackbar)

        btn_toast_latihan.setOnClickListener {
            val nama = et_nama.text.toString()
            Toast.makeText(this, "Selamat Datang $nama", Toast.LENGTH_LONG).show()
        }

        btn_lanjutkan.setOnClickListener {
            val pindah = Intent(this, LatihanToastSnackbar2Activity::class.java)
            startActivity(pindah)
        }
    }
}