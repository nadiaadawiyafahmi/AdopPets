package com.example.adoppets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.adoppets.R

class Star3Fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_activity_star3)

        val btn3 = findViewById<Button>(R.id.button3)

        btn3.setOnClickListener {
            startActivity(Intent(this@Star3Fragment, LoginActivity::class.java))
        }
    }
}