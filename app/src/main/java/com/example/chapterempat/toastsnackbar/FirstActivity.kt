package com.example.chapterempat.toastsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapterempat.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        btn_toast.setOnClickListener{
            val data = "qwerty"
            Toast.makeText(this,"Ini adalah Toast $data", Toast.LENGTH_LONG).show()
        }

        btn_snackbar1.setOnClickListener {
            Snackbar.make(it, "Ini adalah Snackbar", Snackbar.LENGTH_LONG).show()
        }

        btn_snackbar2.setOnClickListener {
            Snackbar.make(it, "Snackbar dengan action", Snackbar.LENGTH_INDEFINITE)
                .setAction("Toast 1"){
                    Toast.makeText(this, "Ini adalah Toast dari Snackbar", Toast.LENGTH_LONG).show()
                }
                .setAction("Toast 2"){
                    Toast.makeText(this, "Ini adalah Toast dari Snackbar", Toast.LENGTH_LONG).show()
                }
                .show()
        }

        btn_snackbar3.setOnClickListener {
            val a = Snackbar.make(it, "Snackbar dengan action", Snackbar.LENGTH_INDEFINITE)
                a.setAction("Dismiss"){
                    a.dismiss()
                }
            a.show()
        }
    }
}