package com.example.android.almeriatourguide;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EntertainmentFragment extends Fragment {

    public EntertainmentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.entertainment_1, R.string.entertainment_1_location, R.drawable.bambalina));
        places.add(new Place(R.string.entertainment_2, R.string.entertainment_2_location, R.drawable.cyrano));
        places.add(new Place(R.string.entertainment_3, R.string.entertainment_3_location, R.drawable.karting));
        places.add(new Place(R.string.entertainment_4, R.string.entertainment_4_location, R.drawable.sharelock_1));
        places.add(new Place(R.string.entertainment_5, R.string.entertainment_5_location, R.drawable.monumental));
        places.add(new Place(R.string.entertainment_6, R.string.entertainment_6_location, R.drawable.kayak));
        places.add(new Place(R.string.entertainment_7, R.string.entertainment_7_location, R.drawable.toros));
        places.add(new Place(R.string.entertainment_8, R.string.entertainment_8_location, R.drawable.castor));
        places.add(new Place(R.string.entertainment_9, R.string.entertainment_9_location, R.drawable.bowling));
        places.add(new Place(R.string.entertainment_10, R.string.entertainment_10_location, R.drawable.microteatro));
        places.add(new Place(R.string.entertainment_11, R.string.entertainment_11_location, R.drawable.paintball));

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
