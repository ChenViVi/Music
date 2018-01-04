package com.vivi.musicbox.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import com.chenyuwei.basematerial.adapter.BaseAdapter;
import com.chenyuwei.basematerial.adapter.BaseViewHolder;
import com.chenyuwei.basematerial.util.Tool;
import com.chenyuwei.loadimageview.LoadImageView;

import com.vivi.musicbox.R;
import com.vivi.musicbox.model.user.UserPlayList;

import java.util.List;

/**
 * Created by vivi on 2017/9/26.
 */

public class PlayListAdapter extends BaseAdapter<UserPlayList.PlaylistBean> {

    public PlayListAdapter(Activity activity, List<UserPlayList.PlaylistBean> data) {
        super(activity, data);
    }

    @Override
    protected void convert(final BaseViewHolder holder, UserPlayList.PlaylistBean item, final int position) {
        View itemView = holder.getItemView();
        LoadImageView ivCover = itemView.findViewById(R.id.ivCover);
        ViewGroup.LayoutParams lp = ivCover.getLayoutParams();
        lp.height = Tool.getScreenWidth(activity) / 2;
        lp.width = Tool.getScreenWidth(activity) / 2;
        ivCover.setLayoutParams(lp);
        int padding = Tool.dp2px(activity, 4);
        if (position % 2 == 0){
            itemView.setPadding(0, padding, padding,0);
        }
        else {
            itemView.setPadding(0, padding, 0, 0);
        }
        holder.setImageURI(R.id.ivCover, item.getCoverImgUrl());
        holder.setImageURI(R.id.ivCover, item.getCoverImgUrl(), R.drawable.bg_music);
        holder.setText(R.id.tvName, item.getName());
    }

    @Override
    protected int getItemViewLayoutId(int viewType) {
        return R.layout.item_playlist;
    }
}
