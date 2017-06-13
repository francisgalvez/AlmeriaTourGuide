package com.example.android.almeriatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.monuments_1, R.string.monuments_1_location, R.drawable.alcazaba));
        places.add(new Place(R.string.monuments_2, R.string.monuments_2_location, R.drawable.catedral));
        places.add(new Place(R.string.monuments_3, R.string.monuments_3_location, R.drawable.refugios));
        places.add(new Place(R.string.monuments_4, R.string.monuments_4_location, R.drawable.museo_almeria));
        places.add(new Place(R.string.monuments_5, R.string.monuments_5_location, R.drawable.museo_guitarra));
        places.add(new Place(R.string.monuments_6, R.string.monuments_6_location, R.drawable.familias));
        places.add(new Place(R.string.monuments_7, R.string.monuments_7_location, R.drawable.aljibes));
        places.add(new Place(R.string.monuments_8, R.string.monuments_8_location, R.drawable.pakyta));
        places.add(new Place(R.string.monuments_9, R.string.monuments_9_location, R.drawable.plaza));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
