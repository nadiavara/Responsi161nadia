package com.example.responsi161

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val NamaAR: EditText = findViewById(R.id.et_NamaAR)
        val NimAR: EditText = findViewById(R.id.et_NimAR)
        val ProdiAR: EditText = findViewById(R.id.et_ProdiAR)
        val UsernameAR: EditText = findViewById(R.id.et_UsernameAR)
        val PasswordAR: EditText = findViewById(R.id.et_PasswordAR)

        b_RegisterAR.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("namaAR",NamaAR.text)
            intent.putExtra("nimAR",NimAR.text)
            intent.putExtra("prodiAR",ProdiAR.text)
            intent.putExtra("usernameAR",UsernameAR.text)
            intent.putExtra("passwordAR",PasswordAR.text)
            Toast.makeText(this, "Akun berhasil ditambahkan", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}
