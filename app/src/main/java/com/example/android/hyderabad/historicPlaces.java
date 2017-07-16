package com.example.android.hyderabad;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class historicPlaces extends Fragment {


    public historicPlaces() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_historic_places, container, false);
        try {
            ArrayList<words> history = new ArrayList<words>();
            history.add(new words(getString(R.string.golkonda), getString(R.string.agolkonda), R.drawable.golkonda, 4.3f, getString(R.string.de_golkonda), getString(R.string.t_golkonda), getString(R.string.c_golkonda), getString(R.string.p_golkonda), getString(R.string.url_golkonda), 17.383319f, 78.401064f));
            history.add(new words(getString(R.string.charminar), getString(R.string.acharminar), R.drawable.charminar, 4.3f, getString(R.string.de_charminar), getString(R.string.t_charminar), getString(R.string.c_charminar), getString(R.string.p_charminar), getString(R.string.url_charminar), 17.361594f, 78.474654f));
            history.add(new words(getString(R.string.salar), getString(R.string.asalar), R.drawable.salarjung, 4.5f, getString(R.string.de_salar), getString(R.string.t_salar), getString(R.string.c_salar), getString(R.string.p_salar), getString(R.string.url_salar), 17.371346f, 78.480381f));
            history.add(new words(getString(R.string.makkah), getString(R.string.amakkah), R.drawable.makkah, 4.6f, getString(R.string.de_makkah), getString(R.string.t_makkah), getString(R.string.c_makkah), getString(R.string.p_makkah), getString(R.string.url_makkah), 17.360452f, 78.473571f));
            history.add(new words(getString(R.string.chowmahalla), getString(R.string.achowmahalla), R.drawable.chowmahalla, 4.3f, getString(R.string.de_chowmahalla), getString(R.string.t_chowmahalla), getString(R.string.c_chowmahalla), getString(R.string.p_chowmahalla), getString(R.string.url_chowmahalla), 17.358899f, 78.471297f));
            int n = history.size();

            placePagerAdapter itemsAdapter = new placePagerAdapter(getActivity(), R.layout.words, history, R.color.history);

            ListView listView = (ListView) rootView.findViewById(R.id.places);
            listView.setAdapter(itemsAdapter);
        } catch (Exception e) {
        }
        return rootView;


    }
}

