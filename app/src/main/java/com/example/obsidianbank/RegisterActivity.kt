package com.example.obsidianbank

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val alreadyRegistered =findViewById<TextView>(R.id.alreadyRegistered)
        alreadyRegistered.setOnClickListener{
        }
        val buttonRegister = findViewById<Button>(R.id.buttonRegister)
        buttonRegister.setOnClickListener{
        }

        startActivity(Intent(this, LoginActivity::class.java))
    }
}