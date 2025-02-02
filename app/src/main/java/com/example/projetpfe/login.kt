package com.example.projetpfe

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        val forgotPassword =findViewById<TextView>(R.id.motPasseOublie)

        forgotPassword.setOnClickListener {
            val intent = Intent(this, forget_password::class.java)
            startActivity(intent)
        }
    }
}