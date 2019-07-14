package com.example.mohit.toolbartablayoutdemo17;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar mytool;
    private TabLayout mytab;
    private ViewPager mypager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytool = findViewById(R.id.tbar);
        mytab = findViewById(R.id.tablay);
        mypager = findViewById(R.id.viewpage);

        setSupportActionBar(mytool);


        //Adding tabs in the Tablayout
        mytab.addTab(mytab.newTab().setText("Tab_1"));
        mytab.addTab(mytab.newTab().setText("Tab_2"));

        MyAdapter adp = new MyAdapter(getSupportFragmentManager(), mytab.getTabCount());
        mypager.setAdapter(adp);

        mypager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mytab));

        mytab.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mypager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}
