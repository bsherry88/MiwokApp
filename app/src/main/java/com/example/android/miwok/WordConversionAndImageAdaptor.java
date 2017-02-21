package com.example.android.miwok;

import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by bsherry on 2/15/17.
  */

public class WordConversionAndImageAdaptor extends WordConversionAdaptor<WordConversionAndImage>  {

    private static final String LOG_TAG = WordConversionAndImageAdaptor.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of WordConversion objects to display in a list
     */
    public WordConversionAndImageAdaptor(Activity context, ArrayList<WordConversionAndImage> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = super.getView(position, convertView, parent);

        // Get the object located at this position in the list
        WordConversionAndImage wc = getItem(position);
        ImageView iv = (ImageView) listItemView.findViewById(R.id.photo_image_view);
        iv.setImageResource(wc.getmImageResource());
        // The base class turned off this View.
        iv.setVisibility(View.VISIBLE);

        return listItemView;
    }
}
