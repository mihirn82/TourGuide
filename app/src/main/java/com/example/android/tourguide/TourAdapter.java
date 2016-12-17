package com.example.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mihirnewalkar on 12/16/16.
 */

public class TourAdapter extends ArrayAdapter<Tour> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of AndroidFlavor objects to display in a list
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public TourAdapter(Activity context, ArrayList<Tour> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        //return super.getView(position, convertView, parent);
//
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Tour currentTour = getItem(position);

        TextView tourTextView = (TextView) listItemView.findViewById(R.id.tour_text_view);
        tourTextView.setText(currentTour.getName());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentTour.getDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
//
//        // Check if an image is provided for this word or not
        if (currentTour.hasImage()) {
//            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentTour.getImageResourceId());
//            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
//            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
