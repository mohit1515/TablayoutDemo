package com.example.mohit.toolbartablayoutdemo17;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
    private int count;

    public MyAdapter(FragmentManager fm, int count) {
        super(fm);
        this.count = count;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                FragmentOne fone = new FragmentOne();
                return fone;
            case 1:
                FragmentTwo ftwo = new FragmentTwo();
                return ftwo;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
