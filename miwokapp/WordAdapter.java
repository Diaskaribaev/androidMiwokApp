package com.example.miwokapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {

    public WordAdapter(Activity context, ArrayList<word> words ) {
        super(context,0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listlayout, parent, false);
        }


        word currentword = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.version_name);

        miwokTextView.setText(currentword.getmMiwokTranslation());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.version_name_1);

        defaultTextView.setText(currentword.getmDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        imageView.setImageResource(currentword.getmImageResourceID());

        return listItemView;
}}
