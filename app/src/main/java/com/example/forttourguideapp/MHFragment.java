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


/**
 *
 */
public class MHFragment extends Fragment {


    public static final String NAME = "MAHARASHTRA";

    public MHFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_m_h, container, false);
        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.MH_Fort1_name), getString(R.string.MH_Fort1_addr), getString(R.string.MH_Fort1_desc), R.drawable.raigad));
        tourItems.add(new TourItem(getString(R.string.MH_Fort2_name), getString(R.string.MH_Fort2_addr), getString(R.string.MH_Fort2_desc), R.drawable.shivneri));
        tourItems.add(new TourItem(getString(R.string.MH_Fort3_name), getString(R.string.MH_Fort3_addr), getString(R.string.MH_Fort3_desc), R.drawable.sinhgad));
        tourItems.add(new TourItem(getString(R.string.MH_Fort4_name), getString(R.string.MH_Fort4_addr), getString(R.string.MH_Fort4_desc), R.drawable.murud_janjira));

        ListView listView = (ListView) rootView.findViewById(R.id.maharashtra_lv);
        TourAdaptor tourAdapter = new TourAdaptor(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }
}
