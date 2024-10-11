package com.example.services

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to start the service
        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val serviceIntent = Intent(this, MyService::class.java)
            startService(serviceIntent)
        }

        // Button to stop the service
        val stopButton = findViewById<Button>(R.id.stopButton)
        stopButton.setOnClickListener {
            val serviceIntent = Intent(this, MyService::class.java)
            stopService(serviceIntent)
        }
    }
}

