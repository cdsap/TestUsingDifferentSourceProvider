package com.example.testusingdifferentsourceprovider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.Xas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val a = AddingClas()
        val c = Xas().alo()
        println(c)
        setContentView(R.layout.activity_main)
    }
}
