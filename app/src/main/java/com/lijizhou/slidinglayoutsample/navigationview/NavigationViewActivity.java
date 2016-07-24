package com.lijizhou.slidinglayoutsample.navigationview;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.lijizhou.slidinglayoutsample.R;

/**
 * Created by www.lijizhou.com on 2016/7/23.
 * NavigationView Sample
 */
public class NavigationViewActivity extends AppCompatActivity {


    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private NavigationView navigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationview);
        if(Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        setSupportActionBar(toolbar=(Toolbar)findViewById(R.id.toolbar));
        drawerLayout=(DrawerLayout)findViewById(R.id.drawerlayout);
        navigationView = (NavigationView) findViewById(R.id.navigationView);

        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        // navigationView menu点击监听
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                selectDrawerItem(menuItem);
                return true;
            }
        });

    }



    public void  selectDrawerItem(MenuItem menuItem){
        switch (menuItem.getItemId()) {
            // ...
           default:
               Toast.makeText(NavigationViewActivity.this,"menu click",Toast.LENGTH_SHORT).show();
               break;
        }
        menuItem.setChecked(true);
        drawerLayout.closeDrawers();

    }
}
