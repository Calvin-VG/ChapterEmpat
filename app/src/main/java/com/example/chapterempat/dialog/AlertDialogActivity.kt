package com.example.chapterempat.dialog

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.chapterempat.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.activity_latihan_toast_snackbar.*
import kotlinx.android.synthetic.main.custom_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        btn_alert1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Judul alert dialog biasa")
                .setMessage("Ini adalah pesan dari dialog alert standar")
                .setCancelable(true)
                .setIcon(R.drawable.ic_launcher_background)
                .show()
        }

        btn_alert2.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Hapus Data")
                .setMessage("Apakah Anda yakin ingin menghapus data ini?")
                .setPositiveButton("Ya"){ dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this, "Data Anda terhapus", Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Tidak"){ dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this, "Anda telah membatalkan", Toast.LENGTH_LONG).show()
                }
                .setCancelable(true)
                .show()
        }

        btn_alert3.setOnClickListener {
            val a = AlertDialog.Builder(this)
                val b = a.create()
                a.setTitle("Contoh Dismiss")
                a.setMessage("Ini adalah contoh dari dismiss")
                a.setPositiveButton("Ya"){ dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this, "Ya Dismiss", Toast.LENGTH_LONG).show()
                }
                a.setNeutralButton("Dismiss"){ dialogInterface: DialogInterface, i: Int ->
                    b.dismiss()
                }
                a.show()
        }

        btn_latihan1_dialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Latihan alert dialog")
                .setMessage("Ini adalah latihan alert dialog biasa")
                .setCancelable(true)
                .setIcon(R.drawable.ic_launcher_background)
                .show()
        }

        btn_latihan2_dialog.setOnClickListener {
            startActivity(Intent(this, LatihanDialogDuaActivity::class.java))
        }

        btn_custom_dialog.setOnClickListener {
            val customdialog = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null, false)
            val a = AlertDialog.Builder(this)
                .setView(customdialog)
                .create()


            customdialog.btn_custom_alert_ok.setOnClickListener {
                val nama = customdialog.et_dialogalert_nama.text.toString()
                tv_nama_dialog.text = nama
                Toast.makeText(this, "Welcome $nama", Toast.LENGTH_LONG).show()
                a.dismiss()
            }
            a.show()
        }

        btn_alert4.setOnClickListener {
            AlertDialogFragment().show(supportFragmentManager, "abc")
        }
    }
}