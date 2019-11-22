package com.example.responsi161

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_LoginAM.setOnClickListener{
            val bundle = intent.extras
            val NamaAM = bundle?.get("namaAR").toString()
            val NimAM = bundle?.get("nimAR").toString()
            val ProdiAM = bundle?.get("prodiAR").toString()
            val UsernameAM = bundle?.get("usernameAR").toString()
            val PasswordAM = bundle?.get("passwordAR").toString()

            val UsernameAR: EditText = findViewById(R.id.et_UsernameAM)
            val UsernameAM2 = UsernameAR.text.toString()
            val PasswordAR: EditText = findViewById(R.id.et_PasswordAM)
            val PasswordAM2 = PasswordAR.text.toString()

            if(UsernameAM2 == UsernameAM && PasswordAM2 == PasswordAM){
                intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("namaAM", NamaAM)
                intent.putExtra("nimAM", NimAM)
                intent.putExtra("prodiAM", ProdiAM)
                intent.putExtra("usernameAM",UsernameAM)
                intent.putExtra("passwordAM",PasswordAM)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Username atau Password Anda SALAH!!!", Toast.LENGTH_SHORT).show()
            }
        }

        b_RegisterAM.setOnClickListener {
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
