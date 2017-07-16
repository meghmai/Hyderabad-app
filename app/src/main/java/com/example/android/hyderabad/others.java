package com.example.android.hyderabad;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class others extends Fragment {


    public others() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_historic_places, container, false);
        try {
            ArrayList<words> other = new ArrayList<words>();
            other.add(new words(getString(R.string.ramoji), getString(R.string.aramoji), R.drawable.ramojifilmcity, 4.4f, getString(R.string.de_ramoji), getString(R.string.t_ramoji), getString(R.string.c_ramoji), getString(R.string.p_ramoji), getString(R.string.url_ramoji), 17.254362f, 78.680788f));
            other.add(new words(getString(R.string.wonderla), getString(R.string.awonderla), R.drawable.wonderla, 4.2f, getString(R.string.de_wonderla), getString(R.string.t_wonderla), getString(R.string.c_wonderla), getString(R.string.p_wonderla), getString(R.string.url_wonderla), 17.217380f, 78.529233f));
            other.add(new words(getString(R.string.runway9), getString(R.string.arunway9), R.drawable.runway9, 4.0f, getString(R.string.de_runway9), getString(R.string.t_runway9), getString(R.string.c_runway9), getString(R.string.p_runway9), getString(R.string.url_runway9), 17.535153f, 78.488530f));
            other.add(new words(getString(R.string.snowworld), getString(R.string.asnowworld), R.drawable.snow, 3.9f, getString(R.string.de_snowworld), getString(R.string.t_snowworld), getString(R.string.c_snowworld), getString(R.string.p_snowworld), getString(R.string.url_snowworld), 17.414591f, 78.480976f));
            other.add(new words(getString(R.string.birlamandir), getString(R.string.abirlamandir), R.drawable.birlamandir, 4.6f, getString(R.string.de_birlamandir), getString(R.string.t_birlamandir), getString(R.string.c_birlamandir), getString(R.string.p_birlamandir), getString(R.string.url_birlamandir), 17.406278f, 78.469049f));
            other.add(new words(getString(R.string.shilparamam), getString(R.string.ashilparamam), R.drawable.shilparamam, 4.2f, getString(R.string.de_shilparamam), getString(R.string.t_shilparamam), getString(R.string.c_shilparamam), getString(R.string.p_shilparamam), getString(R.string.url_shilparamam), 17.452435f, 78.379573f));
            other.add(new words(getString(R.string.necklaceroad), getString(R.string.anecklaceroad), R.drawable.necklace, 4.3f, getString(R.string.de_necklaceroad), getString(R.string.t_necklace), getString(R.string.c_necklace), getString(R.string.p_necklace), getString(R.string.url_necklace), 17.434744f, 78.476405f));
            int n = other.size();
            placePagerAdapter itemsAdapter = new placePagerAdapter(getActivity(), R.layout.words, other, R.color.other);
            ListView listView = (ListView) rootView.findViewById(R.id.places);
            listView.setAdapter(itemsAdapter);
        } catch (Exception e) {
        }
        return rootView;
    }

}
