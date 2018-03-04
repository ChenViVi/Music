package com.vivi.musicbox.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.chenyuwei.basematerial.activity.BaseActivity;
import com.chenyuwei.basematerial.activity.BaseRecyclerViewActivity;
import com.chenyuwei.basematerial.util.Tool;
import com.chenyuwei.loadimageview.ImageLoader;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.vivi.musicbox.R;
import com.vivi.musicbox.adapter.PlayListDetailAdapter;
import com.vivi.musicbox.http.RequestMaker;
import com.vivi.musicbox.http.ServiceFactory;
import com.vivi.musicbox.model.playlist.PlayListDetail;
import com.vivi.musicbox.model.user.UserPlayList;

/**
 * Created by vivi on 2018/1/15.
 */

public class PlayListDetailActivity extends BaseRecyclerViewActivity<PlayListDetail.PlaylistBean.TracksBean, PlayListDetailAdapter> {

    private UserPlayList.PlaylistBean playlist;

    @Override
    protected int onBindView() {
        return R.layout.activity_playlist_detail;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(R.id.toolbar);
        setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        playlist = (UserPlayList.PlaylistBean)getIntent().getSerializableExtra("playlist");
        View llCover = findViewById(R.id.llCover);
        ImageLoader.with(activity, llCover, playlist.getCoverImgUrl());
        setTitle(playlist.getName());
        new RequestMaker<PlayListDetail>(activity, ServiceFactory.getPlayListService().detail(playlist.getId())){
            @Override
            protected void onSuccess(PlayListDetail playListDetail) {
                clearItems();
                data.addAll(playListDetail.getPlaylist().getTracks());
                notifyDataSetChanged();
            }
        };
    }

    @Override
    protected RecyclerView.LayoutManager setLayoutManager() {
        return new LinearLayoutManager(activity);
    }

    @Override
    protected PlayListDetailAdapter setAdapter() {
        return new PlayListDetailAdapter(activity, data);
    }

    @Override
    public void onRefresh(RefreshLayout refreshlayout) {

    }

    @Override
    public void onLoadMore(RefreshLayout refreshlayout) {

    }
}
