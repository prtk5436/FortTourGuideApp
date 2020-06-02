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

public class GJFragment extends Fragment {
    public static final String NAME = "GUJARAT";

    public GJFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_g_j, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.GJ_Fort1_name), getString(R.string.GJ_Fort1_addr), R.drawable.ashima));
        tourItems.add(new TourItem(getString(R.string.GJ_Fort2_name), getString(R.string.GJ_Fort2_addr), R.drawable.c21));
        ListView listView = (ListView) rootView.findViewById(R.id.gujarat_lv);
        TourAdaptor tourAdapter = new TourAdaptor(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}