package com.vivi.musicbox.adapter;

import android.app.Activity;

import com.superrecycleview.superlibrary.adapter.BaseViewHolder;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;

import com.vivi.musicbox.R;
import com.vivi.musicbox.model.user.UserPlayList;

import java.util.List;

/**
 * Created by vivi on 2017/9/26.
 */

public class PlayListAdapter extends SuperBaseAdapter<UserPlayList.PlaylistBean> {

    private Listener listener;

    public PlayListAdapter(Activity activity, List<UserPlayList.PlaylistBean> data, Listener listener) {
        super(activity, data);
        this.listener = listener;
    }

    public interface Listener{
         public void  onclick(int position);
    }

    @Override
    protected void convert(final BaseViewHolder holder, UserPlayList.PlaylistBean item, final int position) {

    }

    @Override
    protected int getItemViewLayoutId(int position, UserPlayList.PlaylistBean item) {
        return R.layout.item_playlist;
    }
}
