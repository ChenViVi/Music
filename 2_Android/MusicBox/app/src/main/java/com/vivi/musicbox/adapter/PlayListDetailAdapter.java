package com.vivi.musicbox.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import com.chenyuwei.basematerial.adapter.BaseAdapter;
import com.chenyuwei.basematerial.adapter.BaseViewHolder;

import com.vivi.musicbox.R;
import com.vivi.musicbox.model.playlist.PlayListDetail;

import java.util.List;

/**
 * Created by vivi on 2017/9/26.
 */

public class PlayListDetailAdapter extends BaseAdapter<PlayListDetail.PlaylistBean.TracksBean> {

    public PlayListDetailAdapter(Activity activity, List<PlayListDetail.PlaylistBean.TracksBean> data) {
        super(activity, data);
    }

    @Override
    protected void convert(final BaseViewHolder holder, PlayListDetail.PlaylistBean.TracksBean item, final int position) {
        holder.setImageURI(R.id.ivCover, item.getAl().getPicUrl(), R.drawable.bg_music);
        holder.setText(R.id.tvName, item.getName());
        StringBuilder sb = new StringBuilder();
        for (PlayListDetail.PlaylistBean.TracksBean.ArBean artist : item.getAr()){
            sb.append(artist.getName());
            sb.append("/");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("  |  ");
        sb.append(item.getAl().getName());
        holder.setText(R.id.tvFrom, sb.toString());
    }

    @Override
    protected int getItemViewLayoutId(int viewType) {
        return R.layout.item_playlist_detail;
    }
}
