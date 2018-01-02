package com.vivi.musicbox.fragment;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.chenyuwei.basematerial.fragment.BaseDrawerFragment;
import com.chenyuwei.basematerial.util.Tool;
import com.chenyuwei.loadimageview.ImageLoader;
import com.chenyuwei.loadimageview.LoadImageView;
import com.vivi.musicbox.R;
import com.vivi.musicbox.activity.LoginActivity;


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
        ivAvatar.load(preferences.getString("avatar",""));
        ImageLoader.with(activity, llHeader, preferences.getString("background", ""), Tool.dp2px(activity,360), Tool.dp2px(activity, 160));
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.llLogout:
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("uid", -1);
                editor.apply();
                startActivity(LoginActivity.class);
                activity.finish();
                break;
        }
    }
}
