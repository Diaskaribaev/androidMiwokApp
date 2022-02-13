package com.example.miwokapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class FamilyMembers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_members)


        val Arrayadpater:WordAdapter;
        val num = ArrayList<word>()
        num.add(word("father","әке",R.drawable.family_father))
        num.add(word("mother","ана",R.drawable.family_mother))
        num.add(word("son","ұл бала",R.drawable.family_son))
        num.add(word("daughter","қыз бала",R.drawable.family_daughter))
        num.add(word("older brother","үлкен аға",R.drawable.family_older_brother))
        num.add(word("younger brother","жас аға",R.drawable.family_younger_brother))
        num.add(word("older sister","үлкен әпке",R.drawable.family_older_sister))
        num.add(word("grandmother","әже",R.drawable.family_grandmother))
        num.add(word("grandfather","ата",R.drawable.family_grandfather))
        num.add(word("younger sister","жас әпке",R.drawable.family_younger_sister))

        val listView = findViewById<ListView>(R.id.listView1)
        Arrayadpater = WordAdapter(
            this,
            num,

            )
        listView.adapter= Arrayadpater













    }
}