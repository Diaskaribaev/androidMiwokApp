package com.example.miwokapp;

public class word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;

    public word(String defaultTranslation, String miwokTranslation,int ImageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID  = ImageResourceID;
    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }
}
