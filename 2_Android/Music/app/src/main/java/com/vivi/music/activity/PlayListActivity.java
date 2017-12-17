package com.vivi.music.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chenyuwei.basematerial.activity.BaseRecyclerViewActivity;
import com.vivi.music.R;
import com.vivi.music.adapter.MusicAdapter;
import com.vivi.music.modle.Artist;
import com.vivi.music.modle.Music;
import com.vivi.music.network.RequestMaker;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vivi on 2017/9/29.
 */

public class PlayListActivity extends BaseRecyclerViewActivity<Music,MusicAdapter> {

    private int id;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(R.id.toolbar);
        setTitle(getIntent().getStringExtra("name"));
        setDisplayHomeAsUpEnabled(true);
        id = getIntent().getIntExtra("id",0);
        new RequestMaker(activity, "http://music.163.com/api/playlist/detail", RequestMaker.Mode.STRING) {
            @Override
            protected void onSuccess(String response) throws JSONException {
                JSONArray tracks = new JSONObject(response).getJSONObject("result").getJSONArray("tracks");
                for (int i = 0; i < tracks.length(); i++){
                    JSONObject track = tracks.getJSONObject(i);
                    Music music = new Music();
                    music.setId(track.getInt("id"));
                    music.setPosition(track.getInt("position"));
                    music.setName(track.getString("name"));
                    JSONArray artists = track.getJSONArray("artists");
                    ArrayList<Artist> artistsList = new ArrayList<>();
                    for (int j = 0; j < artists.length(); j++){
                        JSONObject artist = artists.getJSONObject(j);
                        artistsList.add(new Artist(artist.getInt("id"), artist.getString("name")));
                    }
                    music.setArtists(artistsList);
                    data.add(music);
                }
                notifyDataSetChanged();
            }

            @Override
            protected void setParams(HashMap<String, String> map) {
                map.put("id", String.valueOf(id));
            }
        };
    }

    @Override
    protected RecyclerView.LayoutManager setLayoutManager() {
        return new LinearLayoutManager(activity);
    }

    @Override
    protected MusicAdapter setAdapter() {
        return new MusicAdapter(activity, data);
    }
}
