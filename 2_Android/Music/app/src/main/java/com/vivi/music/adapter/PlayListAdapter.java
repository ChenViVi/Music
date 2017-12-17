package com.vivi.music.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.superrecycleview.superlibrary.adapter.BaseViewHolder;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;
import com.vivi.music.R;
import com.vivi.music.activity.BindNetneseActivity;
import com.vivi.music.modle.PlayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vivi on 2017/9/26.
 */

public class PlayListAdapter extends SuperBaseAdapter<PlayList>{

    private Listener listener;

    public PlayListAdapter(Activity activity, List<PlayList> data,Listener listener) {
        super(activity, data);
        this.listener = listener;
    }

    public interface Listener{
         public void  onclick(int position);
    }

    @Override
    protected void convert(final BaseViewHolder holder, PlayList item, final int position) {
        if(item.getType() == PlayList.Title_Inspire){
            holder.setText(R.id.tvName,"我的歌单");
        }
        else if (item.getType() == PlayList.Title_Netnese){
            holder.setText(R.id.tvName,"网易云歌单");
        }
        else if (item.getType() == PlayList.Title_Netnese_Empty){
            holder.setOnClickListener(R.id.ivClose, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onclick(position);
                }
            });
            holder.setOnClickListener(R.id.btnBindNetnese, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(BindNetneseActivity.class);
                }
            });
        }
        else if(item.getType() == PlayList.PlayList_Inspire || item.getType() == PlayList.PlayList_Netnese){
            holder.setText(R.id.tvName,item.getName());
            holder.setText(R.id.tvNum,item.getNum() + "首");
            holder.setImageURI(R.id.ivImg,item.getImgUrl());
        }
    }

    @Override
    protected int getItemViewLayoutId(int position, PlayList item) {
        if(item.getType() == PlayList.PlayList_Inspire || item.getType() == PlayList.PlayList_Netnese){
            return R.layout.item_playlist;
        }
        else if (item.getType() == PlayList.Title_Netnese_Empty){
            return R.layout.item_playlist_netnese_empty;
        }
        else {
            return R.layout.item_playlist_title;
        }
    }
}
