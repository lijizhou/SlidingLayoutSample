package com.lijizhou.slidinglayoutsample.slidingpanelayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.lijizhou.slidinglayoutsample.R;

/**
 * Created by www.lijizhou.com on 2016/7/23.
 * SlidingPaneLayout Sample
 */
public class SlidingPaneLayoutActivity extends AppCompatActivity {


    private SlidingPaneLayout mSlidingPane;
    private LinearLayout ll_menu,ll_main;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slidingpane);
        mSlidingPane= (SlidingPaneLayout) findViewById(R.id.SlidingPane);
        ll_menu=(LinearLayout)findViewById(R.id.ll_menu);
        ll_main=(LinearLayout)findViewById(R.id.ll_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        //设置滑动视差 可选
        mSlidingPane.setParallaxDistance(200);
        //菜单滑动的颜色渐变设置 可选
        //mSlidingPane.setCoveredFadeColor(getResources().getColor(R.color.colorAccent));
        //主视图滑动的颜色渐变设置 可选
        mSlidingPane.setSliderFadeColor(0);
        //滑动监听 可选
        mSlidingPane.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                Log.i("mylog","slide --- "+slideOffset);

                // slideOffset这个参数 是跟随滑动0-1变化的 通过这个数值变化我们可以做出一些不一样的滑动效果
//                ll_menu.setScaleY(slideOffset / 2 + 0.5F);
//                ll_menu.setScaleX(slideOffset/ 2 +  0.5F);
//                ll_main.setScaleY(1 - slideOffset / 5);

            }
            @Override
            public void onPanelOpened(View panel) {
                Log.i("mylog","slide --- open");
            }

            @Override
            public void onPanelClosed(View panel) {
                Log.i("mylog","slide --- close");
            }
        });


    }


}
