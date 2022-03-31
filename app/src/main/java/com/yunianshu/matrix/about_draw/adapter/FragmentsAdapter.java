package com.yunianshu.matrix.about_draw.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Droidroid on 2016/1/29.
 */
public class FragmentsAdapter extends FragmentPagerAdapter {

    private List<Fragment> mList;

    public FragmentsAdapter(FragmentManager fm) {
        super(fm);
    }



    public FragmentsAdapter(FragmentManager fragmentManager, List<Fragment> fragments) {
        super(fragmentManager);
        mList = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
