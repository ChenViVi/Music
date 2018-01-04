package com.vivi.musicbox.fragment;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chenyuwei.basematerial.fragment.BaseDrawerFragment;
import com.chenyuwei.loadimageview.ImageLoader;
import com.chenyuwei.loadimageview.LoadImageView;
import com.vivi.musicbox.R;
import com.vivi.musicbox.activity.WelcomeActivity;


/**
 * Created by vivi on 2016/9/2.
 */
public class DrawFragment extends BaseDrawerFragment {

    private LoadImageView ivAvatar;
    private TextView tvName;
    private RelativeLayout llHeader;

    @Override
    protected int onBindView() {
        return R.layout.fragment_drawer;
    }

    @Override
    protected void onCreateView() {
        super.onCreateView();
        findViewById(R.id.llLogout);
        tvName = (TextView) findViewById(R.id.tvName);
        ivAvatar = (LoadImageView) findViewById(R.id.ivAvatar);
        llHeader = (RelativeLayout) findViewById(R.id.llHeader);
        tvName.setText(preferences.getString("name",""));
        ivAvatar.setDefaultSrc(R.drawable.bg_avatar).load(preferences.getString("avatar",""));
        ImageLoader.with(activity, llHeader, preferences.getString("background", ""));
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.llLogout:
                SharedPreferences.Editor editor = preferences.edit();
                editor.putLong("uid", -1);
                editor.apply();
                startActivity(WelcomeActivity.class);
                activity.finish();
                break;
        }
    }
}
