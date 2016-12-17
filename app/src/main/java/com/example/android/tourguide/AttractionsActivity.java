package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mihirnewalkar on 12/15/16.
 */

public class AttractionsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new AttractionsFragment()).commit();
    }
}
