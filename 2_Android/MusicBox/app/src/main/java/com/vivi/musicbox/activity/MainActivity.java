package com.vivi.musicbox.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;

import com.chenyuwei.basematerial.activity.BaseTabTopActivity;
import com.chenyuwei.basematerial.fragment.BaseDrawerFragment;
import com.vivi.musicbox.R;
import com.vivi.musicbox.fragment.PlayListFragment;

public class MainActivity extends BaseTabTopActivity {

    private BaseDrawerFragment drawerFragment;

    @Override
    protected int onBindView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawerFragment = (BaseDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
        addFragment(new PlayListFragment(),getString(R.string.tabPlaylist));
        addFragment(new PlayListFragment(),getString(R.string.tabPlaylist));
    }
}
