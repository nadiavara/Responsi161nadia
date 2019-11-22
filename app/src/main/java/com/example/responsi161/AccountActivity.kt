package com.example.responsi161

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val bundle = intent.extras
        val NamaAM = bundle?.get("namaAM").toString()
        val NimAM = bundle?.get("nimAM").toString()
        val ProdiAM = bundle?.get("prodiAM").toString()
        val UsernameAM = bundle?.get("usernameAM").toString()
        val PasswordAM = bundle?.get("passwordAM").toString()


        tv_Nama.text = NamaAM
        tv_Nim.text = NimAM
        tv_Prodi.text = ProdiAM
        tv_Username.text = UsernameAM
        tv_Password.text = PasswordAM
    }
}
