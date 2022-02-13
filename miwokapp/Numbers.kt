package com.example.miwokapp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.UserDictionary
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView

class Numbers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        val Arrayadpater:WordAdapter;
        val num = ArrayList<word>()
        num.add(word("one","бір",R.drawable.number_one))
        num.add(word("two","екі",R.drawable.number_two))
        num.add(word("three","үш",R.drawable.number_three))
        num.add(word("four","төрт",R.drawable.number_four))
        num.add(word("five","бес",R.drawable.number_five))
        num.add(word("six","алты",R.drawable.number_six))
        num.add(word("seven","жеті",R.drawable.number_seven))
        num.add(word("eight","сегіз",R.drawable.number_eight))
        num.add(word("nine","тоғыз",R.drawable.number_nine))
        num.add(word("ten","он",R.drawable.number_ten))

        val listView = findViewById<ListView>(R.id.listView)
        Arrayadpater = WordAdapter(
           this,
            num,

        )
        listView.adapter= Arrayadpater





























//        val linear = findViewById<LinearLayout>(R.id.root)
//        var index = 0

//        while (index<num.size){
//
//            var textView = TextView(this)
//            textView.setPadding(40,58,40,58)
//            textView.setTextSize(18.0F)
//            textView.setText(num[index])
//            linear.addView(textView)
//
//            index++
//
//        }







    }
}