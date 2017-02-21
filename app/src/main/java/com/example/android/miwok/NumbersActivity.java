package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    static final String ClassName = "NumbersActivity";
    static final int NumWords = 10;


    static final String[] English = {"one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten"};
    static final String[] Miwok = {"One",
            "lutti",
            "otiiko",
            "tolookosu",
            "oyyisa",
            "temmokka",
            "kenekaku",
            "kawinta",
            "wo’e",
            "na’aacha"};
    static final int[] Images = {R.drawable.number_one,
            R.drawable.number_two,
            R.drawable.number_three,
            R.drawable.number_four,
            R.drawable.number_five,
            R.drawable.number_six,
            R.drawable.number_seven,
            R.drawable.number_eight,
            R.drawable.number_nine,
        R.drawable.number_ten};



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        CreateListFromDataSouceAdapterHelper.CreateListFromDataSouceAdapterHelper(English, Miwok, Images, this, R.id.list);


    }
}



