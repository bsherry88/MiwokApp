package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhrasesActivity extends AppCompatActivity {

    static final String[] English = {
            "Where are you going?",
            "What is your name?",
            "My name is...",
            "How are you feeling?",
            "I’m feeling good.",
            "Are you coming?",
            "Yes, I’m coming.",
            "I’m coming.",
            "Let’s go.",
            "Come here."};

    static final String[] Miwok = {
            "minto wuksus",
            "tinnә oyaase'nә",
            "oyaaset...",
            "michәksәs?",
            "kuchi achit",
            "әәnәs'aa?",
            "hәә’ әәnәm",
            "әәnәm",
            "yoowutis",
            "әnni'nem"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        CreateListFromDataSouceAdapterHelper.CreateListFromDataSouceAdapterHelper(English, Miwok, this, R.id.list);
    }
}
