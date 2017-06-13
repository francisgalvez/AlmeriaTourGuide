package com.example.android.almeriatourguide;

import static android.R.attr.name;

/**
 * Created by franc on 12/06/2017.
 */

public class Place {

    /** Place's popular name */
    private int nameId;

    /** Place's address */
    private int locationId;

    /** Image resource ID for the place */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param nameId is the place's name ID
     * @param locationId is the ID of the string which represents the address of the place
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Place(int nameId, int locationId, int imageResourceId) {
        this.imageResourceId = imageResourceId;
        this.nameId = nameId;
        this.locationId = locationId;
    }

    // Getters and setters
    public int getNameId() {
        return this.nameId;
    }

    public int getLocationId() {
        return locationId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
