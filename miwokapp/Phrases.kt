package com.example.miwokapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Phrases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrases)



        val Arrayadpater:WordAdapter;
        val num = ArrayList<word>()
        num.add(word("What are you doing?","Не істеп жатсың?",R.drawable.color_white))
        num.add(word("what is your name?","Сенің атың кім?",R.drawable.color_white))
        num.add(word("My name is...","Менің атым ...",R.drawable.color_white))
        num.add(word("How are you feeling?","Өзіңді қалай сезініп тұрсың",R.drawable.color_white))
        num.add(word("I'am feeling good","Мен өзімді жақсы сезіп тұрмын",R.drawable.color_white))
        num.add(word("Have a nice day","Күнің жақсы өтсін",R.drawable.color_white))



        val listView = findViewById<ListView>(R.id.listView4)
        Arrayadpater = WordAdapter(
            this,
            num,

            )
        listView.adapter= Arrayadpater








    }
}