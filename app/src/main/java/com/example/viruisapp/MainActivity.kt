package com.example.viruisapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.Runnable

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        handler= Handler(Looper.getMainLooper())
        handler.postDelayed(runnable,100)



    }

    private  val runnable=object :Runnable {
        override fun run() {
              handler.postDelayed(this,100)
            startActivity(Intent(this@MainActivity,MainActivity::class.java))
        }


    }
}