package com.example.responsi161

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    val Makanan = arrayOf<String>("Mie Ayam",
        "Bakso",
        "Soto",
        "Orak Arik",
        "Nasi Telur",
        "Mie Goreng",
        "Mie Rebus",
        "Nasi Goreng",
        "Bubur Kacang Hijau",
        "Bubur Cendol Dawet")

    val Gambar = arrayOf<Int>(
        R.drawable.dapur,
        R.drawable.dapur,
        R.drawable.dapur,
        R.drawable.dapur,
        R.drawable.dapur,
        R.drawable.dapur,
        R.drawable.dapur,
        R.drawable.dapur,
        R.drawable.dapur,
        R.drawable.dapur
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val myListAdapter = ListAdapter(this, Makanan, Gambar)
        lv_Makanan.adapter = myListAdapter

        val bundle = intent.extras
        val NamaAM = bundle?.get("namaAM").toString()
        val NimAM = bundle?.get("nimAM").toString()
        val ProdiAM = bundle?.get("prodiAM").toString()
        val UsernameAM = bundle?.get("usernameAM").toString()
        val PasswordAM = bundle?.get("passwordAM").toString()

        b_Detail.setOnClickListener{
            intent = Intent(this, AccountActivity::class.java)
            intent.putExtra("namaAM",NamaAM)
            intent.putExtra("nimAM",NimAM)
            intent.putExtra("prodiAM",ProdiAM)
            intent.putExtra("usernameAM",UsernameAM)
            intent.putExtra("passwordAM",PasswordAM)
            startActivity(intent)
        }

        lv_Makanan.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            var a = Integer.parseInt(itemIdAtPos.toString())
            var pr = a + 1

            if (a.equals(0)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            } else if (a.equals(1)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            } else if (a.equals(2)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            } else if (a.equals(4)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            }else if (a.equals(5)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            } else if (a.equals(5)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            } else if (a.equals(6)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            }else if (a.equals(7)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            }else if (a.equals(8)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            }else if (a.equals(9)) {
                Toast.makeText(this, "$itemAtPos adalah salah satu jenis makanan", Toast.LENGTH_LONG).show()
            }

        }
    }
}