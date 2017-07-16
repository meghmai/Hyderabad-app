package com.example.android.hyderabad;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class pagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public pagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new historicPlaces();
        } else if (position == 1) {
            return new hotels();
        } else if (position == 2) {
            return new parks();
        } else {
            return new others();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.historic);
        } else if (position == 1) {
            return mContext.getString(R.string.hotels);
        } else if (position == 2) {
            return mContext.getString(R.string.parks);
        } else {
            return mContext.getString(R.string.others);
        }
    }
}
