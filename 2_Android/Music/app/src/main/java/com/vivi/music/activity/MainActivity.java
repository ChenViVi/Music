package com.vivi.music.activity;

import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;

import com.chenyuwei.basematerial.activity.BaseTabTopActivity;
import com.vivi.music.R;
import com.vivi.music.fragment.PlayListFragment;
import com.chenyuwei.basematerial.fragment.BaseDrawerFragment;

public class MainActivity extends BaseTabTopActivity {

    private BaseDrawerFragment drawerFragment;

    @Override
    protected int onBindView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawerFragment = (BaseDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
        addFragment(new PlayListFragment(),getString(R.string.tab_home));
        addFragment(new PlayListFragment(),getString(R.string.tab_recommend));
    }
}