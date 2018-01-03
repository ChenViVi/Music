package com.vivi.musicbox.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chenyuwei.basematerial.fragment.BaseRecyclerViewFragment;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.vivi.musicbox.adapter.PlayListAdapter;
import com.vivi.musicbox.http.RequestMaker;
import com.vivi.musicbox.http.ServiceFactory;
import com.vivi.musicbox.model.user.UserPlayList;

/**
 * Created by vivi on 2016/7/18.
 */
public class PlayListFragment extends BaseRecyclerViewFragment<UserPlayList.PlaylistBean,PlayListAdapter> {

    @Override
    protected void onCreateView() {
        super.onCreateView();
        setPullRefreshEnable(true);
        new RequestMaker<UserPlayList>(activity, ServiceFactory.getUserService().playlist(getUid())){
            @Override
            protected void onSuccess(UserPlayList userPlayList) {
                clearItems();
                data.addAll(userPlayList.getPlaylist());
                notifyDataSetChanged();
            }
        };
    }

    @Override
    protected void onItemClick(View view, int position, UserPlayList.PlaylistBean playList) {
        super.onItemClick(view, position, playList);
    }

    @Override
    public void onRefresh(RefreshLayout refreshlayout) {
        super.onRefresh(refreshlayout);
        new RequestMaker<UserPlayList>(activity, ServiceFactory.getUserService().playlist(getUid())){
            @Override
            protected void onSuccess(UserPlayList userPlayList) {
                clearItems();
                data.addAll(userPlayList.getPlaylist());
                notifyDataSetChanged();
                stopRefresh();
            }
        };
    }

    @Override
    protected RecyclerView.LayoutManager setLayoutManager() {
        return new GridLayoutManager(activity,2);
    }

    @Override
    protected PlayListAdapter setAdapter() {
        return new PlayListAdapter(activity, data);
    }
}
