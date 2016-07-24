package com.lijizhou.slidinglayoutsample.drawerlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.lijizhou.slidinglayoutsample.R;

/**
 * Created by www.lijizhou.com on 2016/7/23.
 * DrawerLayout Sample
 */
public class DrawerLayoutActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawerlayout);
        setSupportActionBar(toolbar=(Toolbar) findViewById(R.id.toolbar));
        drawerLayout=(DrawerLayout)findViewById(R.id.dl_left);
        //ActionBarDrawerToggle是DrawerLayout.DrawerListener的实现，可以方便的将drawlayout和actionbar结合起来
        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

            }
        };

        actionBarDrawerToggle.syncState();

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
    }
}
