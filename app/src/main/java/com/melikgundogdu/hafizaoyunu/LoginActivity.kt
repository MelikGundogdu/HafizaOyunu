package com.melikgundogdu.hafizaoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val button = findViewById<Button>(R.id.login)
        button.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.login2)
        button2.setOnClickListener {

            val intent = Intent(this,MainActivity2::class.java)

            startActivity(intent)
        }
    }
}