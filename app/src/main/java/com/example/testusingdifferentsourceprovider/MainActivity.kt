package com.example.testusingdifferentsourceprovider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val a = AddingClas()
        setContentView(R.layout.activity_main)
    }
}
