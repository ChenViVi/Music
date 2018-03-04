package com.vivi.musicbox.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.chenyuwei.basematerial.activity.BaseActivity;
import com.chenyuwei.basematerial.util.Tool;
import com.chenyuwei.loadimageview.ImageLoader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.vivi.musicbox.R;
import com.vivi.musicbox.model.user.UserPlayList;

/**
 * Created by vivi on 2018/1/15.
 */

public class PlayListActivity extends BaseActivity {

    private UserPlayList.PlaylistBean playlist;

    @Override
    protected int onBindView() {
        return R.layout.activity_playlist;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(R.id.toolbar);
        setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        playlist = (UserPlayList.PlaylistBean)getIntent().getSerializableExtra("playlist");
        View appbar = findViewById(R.id.appbar);
        ViewGroup.LayoutParams lp = appbar.getLayoutParams();
        lp.height = Tool.getScreenWidth(activity);
        appbar.setLayoutParams(lp);
        View llCover = findViewById(R.id.llCover);
        ImageLoader.with(activity, llCover, playlist.getCoverImgUrl());
    }
}
