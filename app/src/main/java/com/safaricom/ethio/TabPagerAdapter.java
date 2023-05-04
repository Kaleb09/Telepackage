package com.kaleb.ethio;

import android.content.SharedPreferences;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
public class TabPagerAdapter extends FragmentPagerAdapter  {
    int tabCount;confirmlistner cl;SharedPreferences sharedPreferences;
    public TabPagerAdapter(FragmentManager fm, int numberOfTabs, SharedPreferences share) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.tabCount = numberOfTabs;
sharedPreferences=share;
    }
    @Override
    public Fragment getItem(int position) {
        if(sharedPreferences.getBoolean("holiday",false)) {
            switch (position) {
                case 0:
                        return new holiday();
                case 1:
                        return new internet();
                case 2:
                        return new voice();
                case 3:
                        return new sms();
                case 4:
                        return new internetandvoice();
                case 5:
                        return new flexi();
                case 6:
                        return new internationalvoice();
                case 7:
                        return new morning();
                case 8:
                        return new longterm();
                case 9:
                        return new unlimitedpremium();
                case 10:
                        return new onebirrpackage();
                case 11:
                    return new Convertpackage();
                    case 12:
                        return new transferpackage();

                default:
                    return null;
            }

        }else {
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
                return new Convertpackage();
                case 11:
                    return new transferpackage();
                default:
                    return null;
            }
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }

}