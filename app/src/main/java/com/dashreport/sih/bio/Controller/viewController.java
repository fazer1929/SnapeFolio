package com.dashreport.sih.bio.Controller;

import com.dashreport.sih.bio.views.fragment_about;
import com.dashreport.sih.bio.views.fragment_contact;
import com.dashreport.sih.bio.views.fragment_occupation;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewController extends FragmentPagerAdapter {
    public viewController(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new fragment_about();
            case 1 : return new fragment_occupation();
            case 2 : return new fragment_contact();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 : return "ABOUT";
            case 1 : return "OCCUPATION";
            case 2 : return "CONTACT";
        }
        return null;
    }
}
