package com.example.android.hyderabad;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class hotels extends Fragment {


    public hotels() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_historic_places, container, false);
        try {
            ArrayList<words> hotel = new ArrayList<words>();
            hotel.add(new words(getString(R.string.tajkrishna), getString(R.string.atajkrishna), R.drawable.tajkrishna, 4.4f, getString(R.string.de_tajkrishna), getString(R.string.t_tajkrishna), getString(R.string.c_tajkrishna), getString(R.string.p_tajkrishna), getString(R.string.url_tajkrishna), 17.416456f, 78.449026f));
            hotel.add(new words(getString(R.string.radisson), getString(R.string.aradisson), R.drawable.radissonblu, 4.3f, getString(R.string.de_radisson), getString(R.string.t_radisson), getString(R.string.c_radisson), getString(R.string.p_radisson), getString(R.string.url_radisson), 17.422264f, 78.441555f));
            hotel.add(new words(getString(R.string.tajfalaknuma), getString(R.string.atajfalaknuma), R.drawable.tajfalaknuma, 4.3f, getString(R.string.de_tajfalaknuma), getString(R.string.t_tajfalknuma), getString(R.string.c_tajfalknuma), getString(R.string.p_tajfalaknuma), getString(R.string.url_tajfalaknuma), 17.331350f, 78.466171f));
            hotel.add(new words(getString(R.string.novotel), getString(R.string.anovotel), R.drawable.novotel, 4.4f, getString(R.string.de_novotel), getString(R.string.t_novotel), getString(R.string.c_novotel), getString(R.string.p_novotel), getString(R.string.url_novotel), 17.472856f, 78.372788f));
            hotel.add(new words(getString(R.string.vivanta), getString(R.string.avivanta), R.drawable.vivanta, 4.3f, getString(R.string.de_vivanta), getString(R.string.t_vivanta), getString(R.string.c_vivanta), getString(R.string.p_vivanta), getString(R.string.url_vivanta), 17.443205f, 78.460519f));
            int n = hotel.size();
            placePagerAdapter itemsAdapter = new placePagerAdapter(getActivity(), R.layout.words, hotel, R.color.hotels);
            ListView listView = (ListView) rootView.findViewById(R.id.places);
            listView.setAdapter(itemsAdapter);
        } catch (Exception e) {
        }
        return rootView;
    }

}
