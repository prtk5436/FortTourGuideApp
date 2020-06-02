package com.example.forttourguideapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.forttourguideapp.R;
import com.example.forttourguideapp.model.TourItem;

import java.util.ArrayList;

public class TourAdaptor extends ArrayAdapter<TourItem> {

    private Context mContext;

    public TourAdaptor(Context context, ArrayList<TourItem> tourItemArrayList) {
        super(context, 0, tourItemArrayList);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TourItem tourItem = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageview_lv);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_textview_lv);
        TextView descTextView = (TextView) listItemView.findViewById(R.id.desc_textview_lv);
        TextView locTextView = (TextView) listItemView.findViewById(R.id.loc_textview_lv);

        imageView.setImageResource(tourItem.getImage());
        titleTextView.setText(tourItem.getTitle());
        descTextView.setText(tourItem.getEventDesc());
        locTextView.setText(tourItem.getLocation());

        return listItemView;
    }
}
