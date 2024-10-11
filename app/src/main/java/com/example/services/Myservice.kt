package com.example.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

class MyService : Service() {

    private val TAG = "MyService"


    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Service Created")
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show()
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "Service Started")
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show()


        return START_STICKY
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Service Destroyed")
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show()
    }


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}