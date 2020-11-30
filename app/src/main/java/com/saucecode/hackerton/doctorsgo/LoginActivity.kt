package com.saucecode.hackerton.doctorsgo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_login)

        val altSign = findViewById<TextView>(R.id.alt_sign_up)

        altSign.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

    }
}