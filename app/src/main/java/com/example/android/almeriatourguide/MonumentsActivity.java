package com.example.android.almeriatourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by franc on 12/06/2017.
 */

public class MonumentsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MonumentsFragment())
                .commit();
    }
}
