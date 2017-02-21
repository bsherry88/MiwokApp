package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FamilyActivity extends AppCompatActivity {


    static final String[] English = {"father",
            "mother",
            "son",
            "daughter",
            "older brother",
            "younger brother",
            "older sister",
            "younger sister",
            "grandmother",
            "grandfather"};
    static final String[] Miwok = {"әpә",
            "әṭa",
            "angsi",
            "tune",
            "taachi",
            "chalitti",
            "teṭe",
            "kolliti",
            "ama",
            "paapa"};

    static final int[] Images = {
            R.drawable.family_father,
            R.drawable.family_mother,
            R.drawable.family_son,
            R.drawable.family_daughter,
            R.drawable.family_older_brother,
            R.drawable.family_younger_brother,
            R.drawable.family_older_sister,
            R.drawable.family_younger_sister,
            R.drawable.family_grandmother,
            R.drawable.family_grandfather};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        CreateListFromDataSouceAdapterHelper.CreateListFromDataSouceAdapterHelper(English, Miwok, Images, this, R.id.list);
    }
}
