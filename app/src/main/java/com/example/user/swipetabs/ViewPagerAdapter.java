package com.example.user.swipetabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 13-01-2017.
 */

public class ViewPagerAdapter  extends FragmentPagerAdapter {
    private final List<Fragment> mFragment_list = new ArrayList<>();
    private final List<String> mFragment_title_list = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragment_list.get(position);
    }

    @Override
    public int getCount() {
        return mFragment_list.size();
    }

    public void addFragment(Fragment fragment, String title) {
        mFragment_list.add(fragment);
        mFragment_title_list.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragment_title_list.get(position);
    }
}
