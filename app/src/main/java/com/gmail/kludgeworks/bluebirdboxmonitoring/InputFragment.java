package com.gmail.kludgeworks.bluebirdboxmonitoring;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Joshua Douty on 4/28/15.
 */
public class InputFragment extends Fragment {

    private static final String LOG_TAG = InputFragment.class.getSimpleName();

    public TextView mDateView;
    public TextView mBoxView;
    public TextView mSpeciesView;
    public TextView mNestView;
    public TextView mEggsView;
    public TextView mYoungView;
    public TextView mFledgedView;
    public TextView mCommentsView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_input, container, false);
        mDateView = (TextView) rootView.findViewById(R.id.input_date_textview);
        mBoxView = (TextView) rootView.findViewById(R.id.input_box_textview);
        mSpeciesView = (TextView) rootView.findViewById(R.id.input_species_textview);
        mNestView = (TextView) rootView.findViewById(R.id.input_nest_textview);
        mEggsView = (TextView) rootView.findViewById(R.id.input_eggs_textview);
        mYoungView = (TextView) rootView.findViewById(R.id.input_young_textview);
        mFledgedView = (TextView) rootView.findViewById(R.id.input_fledged_textview);
        mCommentsView = (TextView) rootView.findViewById(R.id.input_comments_textview);
        return rootView;
    }
}

