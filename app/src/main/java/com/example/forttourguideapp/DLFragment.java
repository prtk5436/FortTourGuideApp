package com.example.forttourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.forttourguideapp.adapter.TourAdaptor;
import com.example.forttourguideapp.model.TourItem;

import java.util.ArrayList;


public class DLFragment extends Fragment {

    public static final String NAME = "DELHI";

    public DLFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_d_l, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.DL_Fort1_name), getString(R.string.DL_Fort1_addr), getString(R.string.DL_Fort1_desc), R.drawable.d1));
        tourItems.add(new TourItem(getString(R.string.DL_Fort2_name), getString(R.string.DL_Fort2_addr), getString(R.string.DL_Fort2_desc), R.drawable.d2));
        ListView listView = (ListView) rootView.findViewById(R.id.delhi_lv);
        TourAdaptor tourAdapter = new TourAdaptor(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
