package com.example.gibbiez
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val textViewAppName: TextView = findViewById(R.id.textViewAppName)
        textViewAppName.text = "Gibbiez"


        val imageViewLogo: ImageView = findViewById(R.id.imageViewLogo)



        Handler().postDelayed({

            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // Durasi 3 detik
    }
}