package com.jstevenunez.androidstarter.activity;

import android.app.Activity;
import android.os.Bundle;

import com.jstevenunez.androidstarter.R;

/**
 * Created by kryonex on 022, 2/22/2015.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
