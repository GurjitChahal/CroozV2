package com.example.gurjitc96.menucrooze;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Malachi on 2/20/2017.
 */


public class MainTabsAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MainTabsAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SocialFragment();
        } else if (position == 1) {
            return new RoutesFragment();
        } else {
            return new WeatherFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.social_tab);
        } else if (position == 1) {
            return mContext.getString(R.string.routes_tab);
        } else {
            return mContext.getString(R.string.weather_tab);
        }
    }
}
