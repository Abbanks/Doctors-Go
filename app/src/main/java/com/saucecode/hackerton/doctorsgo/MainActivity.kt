package com.saucecode.hackerton.doctorsgo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val book = findViewById<MaterialButton>(R.id.book_now)
        book.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}