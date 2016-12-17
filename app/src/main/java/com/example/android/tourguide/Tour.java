package com.example.android.tourguide;

/**
 * Created by mihirnewalkar on 12/16/16.
 */

public class Tour {

    /** Name */
    private String mName;

    /** Description */
    private String mDescription;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Tour object.
     *
     * @param name is Name of the place
     * @param description is the Description of the place
     * @param imageResourceId is a Thumbnail of the place
     */
    public Tour(String name, String description,int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the name of the place.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the description of the place.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
