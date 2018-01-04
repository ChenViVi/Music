package com.vivi.musicbox.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;

import com.chenyuwei.basematerial.activity.BaseActivity;
import com.vivi.musicbox.R;

public class WelcomeActivity extends BaseActivity implements View.OnClickListener{

    public static final int REQUEST_DESTROY = 101;
    public static final int RESULT_DESTROY = 101;

    @Override
    protected int onBindView() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getUid() != -1){
            startActivity(MainActivity.class);
            finish();
        }
        findViewById(R.id.btnLogin);
    }

    @Override
    public void onClick(View view) {
        startActivityForResult(LoginActivity.class, REQUEST_DESTROY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_DESTROY && resultCode == RESULT_DESTROY) {
            finish();
        }
    }
}
