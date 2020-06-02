package com.example.forttourguideapp.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.forttourguideapp.DLFragment;
import com.example.forttourguideapp.GJFragment;
import com.example.forttourguideapp.MHFragment;
import com.example.forttourguideapp.RJFragment;

public class TGuidePagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;

    private String tabTitles[] = new String[]{
            MHFragment.NAME,
            DLFragment.NAME,
            RJFragment.NAME,
            GJFragment.NAME
    };

    private Context mContext;

    public TGuidePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, MHFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, DLFragment.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, RJFragment.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, GJFragment.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
