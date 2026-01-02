package com.example.helloandroidui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val nameInput = findViewById<EditText>(R.id.nameInput)

        button.setOnClickListener {
            val name = nameInput.text.toString().trim()

            if (name.isNotEmpty()) {
                Toast.makeText(this, "Hello, $name!", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
            } else {
                nameInput.error = "Please enter your name"
            }
        }
    }
}
