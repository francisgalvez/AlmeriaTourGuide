/*
 * Copyright (c) 2017 by Francis Gálvez. All rights reserved.
 */
package com.example.android.almeriatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeachesFragment extends Fragment {

    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.beaches_1, R.string.beaches_1_location, R.drawable.monsul));
        places.add(new Place(R.string.beaches_2, R.string.beaches_2_location, R.drawable.genoveses));
        places.add(new Place(R.string.beaches_3, R.string.beaches_3_location, R.drawable.negras));
        places.add(new Place(R.string.beaches_4, R.string.beaches_4_location, R.drawable.muertos));
        places.add(new Place(R.string.beaches_5, R.string.beaches_5_location, R.drawable.enmedio));
        places.add(new Place(R.string.beaches_6, R.string.beaches_6_location, R.drawable.aguadulce));
        places.add(new Place(R.string.beaches_7, R.string.beaches_7_location, R.drawable.escullos));
        places.add(new Place(R.string.beaches_8, R.string.beaches_8_location, R.drawable.playazo));
        places.add(new Place(R.string.beaches_9, R.string.beaches_9_location, R.drawable.salinas));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Place_list.xml layout file.
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Add separator between the different TextViews
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return rootView;
    }
}
