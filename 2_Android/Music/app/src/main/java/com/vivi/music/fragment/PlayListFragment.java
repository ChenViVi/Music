package com.vivi.music.fragment;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;
import com.vivi.music.activity.PlayListActivity;
import com.vivi.music.adapter.PlayListAdapter;
import com.vivi.music.modle.PlayList;
import com.chenyuwei.basematerial.fragment.BaseRecyclerViewFragment;
import com.vivi.music.network.RequestMaker;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by vivi on 2016/7/18.
 */
public class PlayListFragment extends BaseRecyclerViewFragment<PlayList,SuperBaseAdapter> {

    @Override
    protected void onCreateView() {
        super.onCreateView();
        setPullRefreshEnable(true);
        if (getToken() != null){
            new RequestMaker(activity, RequestMaker.Method.GET, "user/playlist", "user/playlist") {
                @Override
                protected void onSuccess(String response) throws JSONException {
                    JSONObject json = new JSONObject(response);
                    JSONArray playLists = json.getJSONArray("playLists");
                    clearItems();
                    data.add(new PlayList(PlayList.Title_Inspire));
                    for (int i = 0; i < playLists.length(); i++) {
                        JSONObject playlist = playLists.getJSONObject(i);
                        data.add(new PlayList(playlist.getInt("id"), PlayList.PlayList_Inspire,playlist.getString("name"), playlist.getString("coverImgUrl"), playlist.getInt("trackCount")));
                    }
                    data.add(new PlayList(PlayList.Title_Netnese));
                    JSONArray playListNetneses = json.getJSONArray("playListNetneses");
                    if (playListNetneses.length() == 0){
                        data.add(new PlayList(PlayList.Title_Netnese_Empty));
                    }
                    else {
                        for (int i = 0; i < playListNetneses.length(); i++) {
                            JSONObject playlist = playListNetneses.getJSONObject(i);
                            data.add(new PlayList(playlist.getInt("id"), PlayList.PlayList_Netnese,playlist.getString("name"), playlist.getString("coverImgUrl"), playlist.getInt("trackCount")));
                        }
                    }
                    notifyDataSetChanged();
                }

                @Override
                protected void setParams(HashMap<String, String> map) {
                    map.put("token",getToken());
                }
            };
        }
    }

    @Override
    protected void onItemClick(View view, int position, PlayList playList) {
        super.onItemClick(view, position, playList);
        Intent intent = new Intent(activity, PlayListActivity.class);
        if (playList.getType() == PlayList.PlayList_Netnese) {
            intent.putExtra("id", playList.getId());
            intent.putExtra("name", playList.getName());
            startActivity(intent);
        }
    }

    @Override
    public void onRefresh() {
        super.onRefresh();
        if (getToken() != null){
            new RequestMaker(activity, RequestMaker.Method.GET, "user/playlist", "user/playlist") {
                @Override
                protected void onSuccess(String response) throws JSONException {
                    JSONObject json = new JSONObject(response);
                    JSONArray playLists = json.getJSONArray("playLists");
                    clearItems();
                    data.add(new PlayList(PlayList.Title_Inspire));
                    for (int i = 0; i < playLists.length(); i++) {
                        JSONObject playlist = playLists.getJSONObject(i);
                        data.add(new PlayList(playlist.getInt("id"), PlayList.PlayList_Inspire,playlist.getString("name"), playlist.getString("coverImgUrl"), playlist.getInt("trackCount")));
                    }
                    data.add(new PlayList(PlayList.Title_Netnese));
                    JSONArray playListNetneses = json.getJSONArray("playListNetneses");
                    if (playListNetneses.length() == 0){
                        data.add(new PlayList(PlayList.Title_Netnese_Empty));
                    }
                    else {
                        for (int i = 0; i < playListNetneses.length(); i++) {
                            JSONObject playlist = playListNetneses.getJSONObject(i);
                                data.add(new PlayList(playlist.getInt("id"), PlayList.PlayList_Netnese,playlist.getString("name"), playlist.getString("coverImgUrl"), playlist.getInt("trackCount")));
                        }
                    }
                    notifyDataSetChanged();
                    stopRefresh();
                }

                @Override
                protected void setParams(HashMap<String, String> map) {
                    map.put("token",getToken());
                }
            };
        }
    }


    @Override
    protected RecyclerView.LayoutManager setLayoutManager() {
        return new LinearLayoutManager(activity);
    }

    @Override
    protected PlayListAdapter setAdapter() {
        return new PlayListAdapter(activity, data, new PlayListAdapter.Listener() {
            @Override
            public void onclick(int position) {
                data.remove(position);
                notifyDataSetChanged();
            }
        });
    }
}
