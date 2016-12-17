package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by mihirnewalkar on 12/15/16.
 */

public class AttractionsFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of words
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Beehive House", "One of the official residences of Brigham Young",R.drawable.ic_beehivehouse));
        tours.add(new Tour("City Creek Center", "Upscale open-air shopping center",R.drawable.ic_citycreekcenter));
        tours.add(new Tour("Gilgal Sculpture Garden", "Whimsical, off-the-beaten-path public green space exhibiting original statues & engravings",R.drawable.ic_gilgal));
        tours.add(new Tour("Red Butte Garden and Arboretum", "A botanical garden, arboretum, and amphitheatre",R.drawable.ic_redbuttegarden));
        tours.add(new Tour("Tabernacle", "World-famous Mormon Tabernacle Choir",R.drawable.ic_tabernacle));
        tours.add(new Tour("Temple Square", "The Church of Jesus Christ of Latter-day Saints",R.drawable.ic_templesquare));
        tours.add(new Tour("Utah State Capitol", "The house of government for the U.S. state of Utah.",R.drawable.ic_capitol));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each tour in the list of tours.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}