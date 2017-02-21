package com.example.android.miwok;

/**
 * Created by bsherry on 2/14/17.
 */

public class WordConversion {


    protected String mEnglish;
    protected String mMiwok;


    WordConversion() {
        this("Unset", "Unset");
    }


    WordConversion(String english, String miwok) {
        mEnglish = english;
        mMiwok = miwok;
    }

    public String getEnglish() {
        return mEnglish;

    }

    public String getMiwok() {
        return mMiwok;
    }


}
