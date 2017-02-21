package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ColorsActivity extends AppCompatActivity {

    static final String ClassName = "NumbersActivity";


    static final String[] English = {"red",
            "mustard yellow",
            "dusty yellow",
            "green",
            "brown",
            "gray",
            "black",
            "white"};
    static final String[] Miwok = {"weṭeṭṭi",
            "chiwiiṭә",
            "ṭopiisә",
            "chokokki",
            "ṭakaakki",
            "ṭopoppi",
            "kululli",
            "kelelli"};
    static int[] Images = {R.drawable.color_red,
            R.drawable.color_mustard_yellow,
            R.drawable.color_dusty_yellow,
            R.drawable.color_green,
            R.drawable.color_brown,
            R.drawable.color_gray,
            R.drawable.color_black,
            R.drawable.color_white};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        CreateListFromDataSouceAdapterHelper.CreateListFromDataSouceAdapterHelper(English, Miwok, Images, this, R.id.list);
    }
}
