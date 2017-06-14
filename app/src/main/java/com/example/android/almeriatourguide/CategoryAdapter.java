/*
 * Copyright (c) 2017 by Francis Gálvez. All rights reserved.
 */
package com.example.android.almeriatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context context;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HistoryFragment();
            case 1:
                return new MonumentsFragment();
            case 2:
                return new EntertainmentFragment();
            default:
                return new BeachesFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.history);
            case 1:
                return context.getString(R.string.monuments);
            case 2:
                return context.getString(R.string.entertainment);
            default:
                return context.getString(R.string.beaches);
        }
    }
}