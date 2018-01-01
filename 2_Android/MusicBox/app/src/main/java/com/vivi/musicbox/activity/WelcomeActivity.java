package com.vivi.musicbox.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chenyuwei.basematerial.activity.BaseActivity;
import com.vivi.musicbox.R;

public class WelcomeActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected int onBindView() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.btnLogin);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
