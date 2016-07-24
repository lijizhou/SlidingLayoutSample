package com.lijizhou.slidinglayoutsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.lijizhou.slidinglayoutsample.drawerlayout.DrawerLayoutActivity;
import com.lijizhou.slidinglayoutsample.navigationview.NavigationViewActivity;
import com.lijizhou.slidinglayoutsample.slidingpanelayout.SlidingPaneLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }


    public void SlidingPaneLayout(View v){
        startActivity(new Intent(MainActivity.this,SlidingPaneLayoutActivity.class));
    }

    public void DrawerLayout(View v){
        startActivity(new Intent(MainActivity.this,DrawerLayoutActivity.class));
    }

    public void NavigationView(View v){
        startActivity(new Intent(MainActivity.this,NavigationViewActivity.class));
    }


}
