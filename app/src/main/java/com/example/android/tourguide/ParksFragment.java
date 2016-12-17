package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mihirnewalkar on 12/16/16.
 */

public class ParksFragment extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of words
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Arches National Park", "Landscape of contrasting colors, landforms and textures",R.drawable.ic_arches));
        tours.add(new Tour("Bryce Canyon National Park", "Known for crimson-colored hoodoos",R.drawable.ic_bryce));
        tours.add(new Tour("Four Corners Monument", "Marks the quadripoint where the states of Arizona, Colorado, New Mexico, & Utah meet",R.drawable.ic_fourcorners));
        tours.add(new Tour("Glen Canyon National Recreation Area", "Offers unparalleled opportunities for water-based & backcountry recreation",R.drawable.ic_glencanyon));
        tours.add(new Tour("Monument Valley", "Known for the towering sandstone buttes",R.drawable.ic_monumentvalley));
        tours.add(new Tour("Zion National Park", "Distinguished by Zion Canyon’s steep red cliffs",R.drawable.ic_zions));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_parks);

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
