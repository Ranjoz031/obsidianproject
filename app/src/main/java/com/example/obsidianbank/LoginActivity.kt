package com.example.obsidianbank

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import layout.HomeActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signup = findViewById<Button>(R.id.signup)
        signup.setOnClickListener {
        }
        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener{
        }


        fun login(userName: String, password: String) {
            if (userName == "name" && password == "1234") {
                startActivity(Intent(this, HomeActivity::class.java))
                Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}