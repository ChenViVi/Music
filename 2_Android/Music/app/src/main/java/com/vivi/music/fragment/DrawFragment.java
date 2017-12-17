package com.vivi.music.fragment;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chenyuwei.basematerial.fragment.BaseDrawerFragment;
import com.chenyuwei.loadimageview.LoadImageView;
import com.vivi.music.R;
import com.vivi.music.activity.BindNetneseActivity;
import com.vivi.music.activity.LoginActivity;


/**
 * Created by vivi on 2016/9/2.
 */
public class DrawFragment extends BaseDrawerFragment {

    private RelativeLayout llUser;
    private RelativeLayout llLogin;
    private TextView tvName;
    private LoadImageView ivAvatar;

    @Override
    protected int onBindView() {
        return R.layout.fragment_drawer;
    }

    @Override
    protected void onCreateView() {
        super.onCreateView();
        findViewById(R.id.btnLogin);
        findViewById(R.id.tvLogout);
        findViewById(R.id.tvBindNetnese);
        llUser = (RelativeLayout) findViewById(R.id.llUser);
        llLogin = (RelativeLayout) findViewById(R.id.llLogin);
        tvName = (TextView) findViewById(R.id.tvName);
        ivAvatar = (LoadImageView) findViewById(R.id.ivAvatar);
        if (getToken() == null){
            llUser.setVisibility(View.GONE);
            llLogin.setVisibility(View.VISIBLE);
        }
        else {
            llLogin.setVisibility(View.GONE);
            llUser.setVisibility(View.VISIBLE);
            tvName.setText(preferences.getString("name",""));
            ivAvatar.load(preferences.getString("avatar",""));
        }
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.btnLogin:
                startActivity(LoginActivity.class);
                break;
            case R.id.tvBindNetnese:
                startActivity(BindNetneseActivity.class);
                break;
            case R.id.tvLogout:
                preferences.edit().putString("token",null).apply();
                llUser.setVisibility(View.GONE);
                llLogin.setVisibility(View.VISIBLE);
                break;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getToken() == null){
            llUser.setVisibility(View.GONE);
            llLogin.setVisibility(View.VISIBLE);
        }
        else {
            llLogin.setVisibility(View.GONE);
            llUser.setVisibility(View.VISIBLE);
            tvName.setText(preferences.getString("name",""));
            ivAvatar.load(preferences.getString("avatar",""));
        }
    }
}
