package com.example.miwokapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Colors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)





        val Arrayadpater:WordAdapter;
        val num = ArrayList<word>()
        num.add(word("black","қара",R.drawable.color_black))
        num.add(word("brown","қоңыр",R.drawable.color_brown))
        num.add(word("dusty yellow","сұр сары",R.drawable.color_dusty_yellow))
        num.add(word("gray","сұр",R.drawable.color_gray))
        num.add(word("green","жасыл",R.drawable.color_green))
        num.add(word("mustard yellow","қоңыр сары",R.drawable.color_mustard_yellow))
        num.add(word("red","қызыл",R.drawable.color_red))
        num.add(word("white","ақ",R.drawable.color_white))


        val listView = findViewById<ListView>(R.id.listView3)
        Arrayadpater = WordAdapter(
            this,
            num,

            )
        listView.adapter= Arrayadpater

















    }
}