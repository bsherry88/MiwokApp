package com.example.android.miwok;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bsherry on 2/15/17.
 * * public class IconArrayAdapter<T extends IconListItem> extends ArrayAdapter<T> {
 protected int resource;
 public IconArrayAdapter(Context context, int resource, ArrayList<T> items) {
 super(context, resource, items);
 this.resource = resource;
 }
 }

 public class TeamListArrayAdapter extends IconArrayAdapter<TeamListItem> {
 public TeamListArrayAdapter(Context context, ArrayList<TeamListItem> items) {
 super(context, R.layout.team_list_item, items);
 }
 }
 */

public class WordConversionAdaptor<T extends WordConversion> extends ArrayAdapter<T> {
    
    private static final String LOG_TAG = WordConversionAdaptor.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of WordConversion objects to display in a list
     */
    public WordConversionAdaptor(Activity context, ArrayList<T> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
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
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        WordConversion  wc = getItem(position);

        // Find the TextView in the list_item.xml layout
        TextView tv = (TextView) listItemView.findViewById(R.id.list_item_english);
        tv.setText(wc.getEnglish());

        // Find the TextView in the list_item.xml layout
        tv = (TextView) listItemView.findViewById(R.id.list_item_miwok);
        tv.setText(wc.getMiwok());

        ImageView iv = (ImageView) listItemView.findViewById(R.id.photo_image_view);
        iv.setVisibility(View.GONE);

        return listItemView;
    }
}
