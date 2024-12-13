package com.example.gibbiez

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboarding2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)


        val btnStart = findViewById<Button>(R.id.btn_start)


        btnStart.setOnClickListener {

            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        val btnBack = findViewById<Button>(R.id.btn_back)
        btnBack.setOnClickListener {

        }
    }
}