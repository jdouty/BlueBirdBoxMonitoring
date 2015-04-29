package com.gmail.kludgeworks.bluebirdboxmonitoring;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Joshua Douty on 4/28/15.
 */
public class InputActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_detail);
        if (savedInstanceState == null) {
            InputFragment fragment = new InputFragment();

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.input_detail_container, fragment)
                    .commit();
        }
    }
}
