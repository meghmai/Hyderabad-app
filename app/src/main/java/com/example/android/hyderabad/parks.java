package com.example.android.hyderabad;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class parks extends Fragment {


    public parks() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_historic_places, container, false);
        try {
            ArrayList<words> park = new ArrayList<words>();
            park.add(new words(getString(R.string.lumbini), getString(R.string.alumbini), R.drawable.lumbini, 4.0f, getString(R.string.de_lumbini), getString(R.string.t_lumbini), getString(R.string.c_lumbini), getString(R.string.p_lumbini), getString(R.string.url_lumbini), 17.410037f, 78.473294f));
            park.add(new words(getString(R.string.ntr), getString(R.string.antr), R.drawable.ntr, 4.2f, getString(R.string.de_ntr), getString(R.string.t_ntr), getString(R.string.c_ntr), getString(R.string.p_ntr), getString(R.string.url_ntr), 17.412586f, 78.468731f));
            park.add(new words(getString(R.string.jalavihar), getString(R.string.ajalavihar), R.drawable.jalvihar, 4.0f, getString(R.string.de_jalavihar), getString(R.string.t_jalavihar), getString(R.string.c_jalavihar), getString(R.string.p_jalavihar), getString(R.string.url_jalavihar), 17.432812f, 78.464586f));
            park.add(new words(getString(R.string.oceanpark), getString(R.string.aoceanpark), R.drawable.ocean, 3.7f, getString(R.string.de_oceanpark), getString(R.string.t_ocean), getString(R.string.c_ocean), getString(R.string.p_ocean), getString(R.string.url_ocean), 17.389727f, 78.328860f));
            park.add(new words(getString(R.string.zoo), getString(R.string.azoo), R.drawable.zoopark, 4.2f, getString(R.string.de_zoo), getString(R.string.t_zoo), getString(R.string.c_zoo), getString(R.string.p_zoo), getString(R.string.url_zoo), 17.350839f, 78.449265f));
            int n = park.size();
            placePagerAdapter itemsAdapter = new placePagerAdapter(getActivity(), R.layout.words, park, R.color.parks);
            ListView listView = (ListView) rootView.findViewById(R.id.places);
            listView.setAdapter(itemsAdapter);
        } catch (Exception e) {
        }

        return rootView;

    }

}
