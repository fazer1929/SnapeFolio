package com.dashreport.sih.bio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.dashreport.sih.bio.R;
import com.dashreport.sih.bio.Controller.viewController;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.mainPager);
        viewPager.setAdapter(new viewController(getSupportFragmentManager()));
        TabLayout tabLayout = findViewById(R.id.tabMover);
        tabLayout.setupWithViewPager(viewPager);
    }

}
