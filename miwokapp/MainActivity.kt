package com.example.miwokapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val numbers = findViewById<TextView>(R.id.numbers)

        numbers.setOnClickListener {
            val intent = Intent(this, Numbers::class.java)
            startActivity(intent)
        }

        val family = findViewById<TextView>(R.id.family)

        family.setOnClickListener {
            val intent = Intent(this, FamilyMembers::class.java)
            startActivity(intent)
        }
        val colors = findViewById<TextView>(R.id.colors)

        colors.setOnClickListener {
            val intent = Intent(this, Colors::class.java)
            startActivity(intent)
        }


        val phrases = findViewById<TextView>(R.id.phrases)

        phrases.setOnClickListener {
            val intent = Intent(this, Phrases::class.java)
            startActivity(intent)
        }

    }
}