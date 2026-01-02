package com.example.helloandroidui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userName = intent.getStringExtra("USER_NAME") ?: "User"

        val welcomeText = findViewById<TextView>(R.id.secondActivityText)

        welcomeText.text = getString(R.string.dashboard_welcome, userName)
    }
}
