package com.demofragment.demoapp.tabdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by obvyah on 16/12/5.
 */
public class TabFragmentPagerAdapter extends FragmentPagerAdapter{

    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return tabTitles.length; }

    @Override
    public Fragment getItem(int position) {
        return TabDemoFragment.newInstance(position + 1, tabTitles[position]);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}