package com.example.android.miwok;

/**
 * Created by bsherry on 2/16/17.
 */

public class WordConversionAndImage extends WordConversion {

    private int mImageResource;

    WordConversionAndImage() {
        this("Unset", "Unset", 0);
    }

    WordConversionAndImage(String english, String miwok, int imageResource) {
        mEnglish = english;
        mMiwok = miwok;
        mImageResource = imageResource;
    }


    public int getmImageResource() {return mImageResource;};
}
