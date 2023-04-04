package com.kaleb.Telepackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
public class TabPagerAdapter extends FragmentPagerAdapter {
    int tabCount;
    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.tabCount = numberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new internet();
            case 1:
                return new voice();
            case 2:
                return new sms();
            case 3:
                return new internetandvoice();
            case 4:
                return new flexi();
            case 5:
                return new internationalvoice();
            case 6:
                return new morning();
            case 7:
                return new longterm();
            case 8:
                return new unlimitedpremium();
            case 9:
                return new onebirrpackage();
            case 10:
                return new transferpackage();
            case 11:
                return new Convertpackage();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return tabCount;
    }

}