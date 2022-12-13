package com.example.adoppets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Star2Fragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_activity_star2)

        val btn2 = findViewById<Button>(R.id.button2)

        btn2.setOnClickListener {
            startActivity(Intent(this@Star2Fragment, Star3Fragment::class.java))
//            overridePendingTransition(R.anim.slide_in_left)
        }
    }
}