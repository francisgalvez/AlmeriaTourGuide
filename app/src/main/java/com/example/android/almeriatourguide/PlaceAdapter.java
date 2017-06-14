package com.example.android.almeriatourguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>{

    private ArrayList<Place> places = new ArrayList<>();

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     */
    PlaceAdapter(Context context, ArrayList<Place> places) {
        super();
        this.places = places;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView titleTextView, locationTextView;
        ImageView imageView;

        ViewHolder(View listItemView){
            super(listItemView);
            // Find the TextView in the list_item.xml layout with the place's ID text_view.
            titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);

            // Find the TextView in the list_item.xml layout with the place's ID text_view.
            locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);

            // Find the ImageView in the list_item.xml layout with the ID image.
            imageView = (ImageView) listItemView.findViewById(R.id.image);
        }
    }

    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View listItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new PlaceAdapter.ViewHolder(listItemView);
    }

    @Override
    public void onBindViewHolder(PlaceAdapter.ViewHolder holder, int position){
        // Get the {@link Place} object located at this position in the list
        Place currentPlace = places.get(position);
        holder.titleTextView.setText(currentPlace.getNameId());
        holder.locationTextView.setText(currentPlace.getLocationId());
        holder.imageView.setImageResource(currentPlace.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    /*@Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the place's ID text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the name current Place object and set this text on its TextView.
        titleTextView.setText(currentPlace.getNameId());

        // Find the TextView in the list_item.xml layout with the place's ID text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the name current Place object and set this text on its TextView.
        locationTextView.setText(currentPlace.getLocationId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // If an image is available, display the provided image based on the resource ID
        imageView.setImageResource(currentPlace.getImageResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in the ListView.
        return listItemView;
    }*/
}