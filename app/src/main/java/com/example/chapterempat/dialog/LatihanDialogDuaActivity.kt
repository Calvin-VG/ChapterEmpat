package com.example.chapterempat.dialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.activity_latihan_dialog_dua.*

class LatihanDialogDuaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_dialog_dua)

        btn_hitung_dialog.setOnClickListener {
            val angka1 = et_angka1.text.toString().toInt()
            val angka2 = et_angka2.text.toString().toInt()
            val kali = angka1 * angka2

            val aa = AlertDialog.Builder(this)
            val ab = aa.create()
            aa.setTitle("Latihan Dialog Alert 2")
            aa.setMessage("Hasil kali dari $angka1 dan $angka2 adalah $kali")
            aa.setNeutralButton("Dismiss"){ dialogInterface: DialogInterface, i: Int ->
                ab.dismiss()
            }
            aa.show()
        }
    }
}