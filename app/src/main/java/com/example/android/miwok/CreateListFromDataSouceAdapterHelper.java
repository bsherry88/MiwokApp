package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import com.example.android.miwok.WordConversion;
import java.util.ArrayList;

import static android.R.attr.id;

/**
 * Created by bsherry on 2/15/17.
 */

public class CreateListFromDataSouceAdapterHelper {

    private static final String LOG_TAG = WordConversionAdaptor.class.getSimpleName();

    static public boolean CreateListFromDataSouceAdapterHelper(String[] english, String[] miwok, Activity activity, int id) {

        if (english.length != miwok.length) {
            Log.e(LOG_TAG, "String lenghts are not equal and they need to be!");
            return false;
        }

        ArrayList<WordConversion> words = new ArrayList<WordConversion>();
        for (int ii = 0; ii < english.length; ii++) {
            WordConversion wc = new WordConversion(english[ii], miwok[ii]);
            words.add(wc);

        }
        WordConversionAdaptor itemsAdapter = new WordConversionAdaptor(activity, words);

        ListView listView = (ListView) activity.findViewById(id);

        listView.setAdapter(itemsAdapter);

        return true;

    }

    static public boolean CreateListFromDataSouceAdapterHelper(String[] english, String[] miwok, int[] images, Activity activity, int id) {

        if ((english.length != miwok.length) || (miwok.length != images.length)) {
            Log.e(LOG_TAG, "String lenghts are not equal and they need to be!");
            return false;
        }

        ArrayList<WordConversionAndImage> words = new ArrayList<WordConversionAndImage>();
        for (int ii = 0; ii < english.length; ii++) {
            WordConversionAndImage wc = new WordConversionAndImage(english[ii], miwok[ii], images[ii]);
            words.add(wc);

        }
        WordConversionAndImageAdaptor itemsAdapter = new WordConversionAndImageAdaptor(activity, words);

        ListView listView = (ListView) activity.findViewById(id);

        listView.setAdapter(itemsAdapter);

        return true;

    }


}
