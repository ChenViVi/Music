package com.vivi.music.adapter;

import android.app.Activity;

import com.superrecycleview.superlibrary.adapter.BaseViewHolder;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;
import com.vivi.music.R;
import com.vivi.music.modle.Artist;
import com.vivi.music.modle.Music;

import java.util.List;

/**
 * Created by vivi on 2017/9/26.
 */

public class MusicAdapter extends SuperBaseAdapter<Music> {


    public MusicAdapter(Activity activity, List<Music> data) {
        super(activity, data);
    }

    @Override
    protected void convert(final BaseViewHolder holder, Music item, final int position) {
        holder.setText(R.id.tvPos, String.valueOf(position + 1));
        holder.setText(R.id.tvName, item.getName());
        StringBuffer sb = new StringBuffer();
        for (Artist artist : item.getArtists()){
            sb.append(artist.getName());
            sb.append("/");
        }
        holder.setText(R.id.tvArtist,sb.toString());
    }

    @Override
    protected int getItemViewLayoutId(int position, Music item) {
        return R.layout.item_music;
    }
}
