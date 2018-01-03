package com.vivi.musicbox.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.chenyuwei.basematerial.activity.BaseActivity;
import com.chenyuwei.basematerial.view.dialog.WaitDialog;
import com.vivi.musicbox.R;
import com.vivi.musicbox.http.RequestMaker;
import com.vivi.musicbox.http.ServiceFactory;
import com.vivi.musicbox.model.user.UserAccount;

public class LoginActivity extends BaseActivity implements TextWatcher {

    protected Toolbar toolbar;
    private Button btnLogin;
    private EditText etPhone;
    private EditText etPassword;

    @Override
    protected int onBindView() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(R.id.toolbar);
        setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        etPhone = (EditText) findViewById(R.id.etPhone);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPhone.addTextChangedListener(this);
        etPassword.addTextChangedListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogin:
                final String phone = etPhone.getText().toString();
                final String password = etPassword.getText().toString();
                if (phone.length() < 11){
                    toast(R.string.tsPhoneMin);
                }
                else if (password.length() < 6){
                    toast(R.string.tsPasswordMin);
                }
                else {
                    btnLogin.setEnabled(false);
                    final WaitDialog dialog = new WaitDialog(activity);
                    dialog.show();
                    new RequestMaker<UserAccount>(activity, ServiceFactory.getLoginService().login(phone, password)){

                        @Override
                        protected void onSuccess(UserAccount userAccount) {
                            dialog.dismiss();
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putLong("uid",userAccount.getAccount().getId());
                            editor.putString("name",userAccount.getProfile().getNickname());
                            editor.putString("avatar",userAccount.getProfile().getAvatarUrl());
                            editor.putString("background",userAccount.getProfile().getBackgroundUrl());
                            editor.apply();
                            startActivity(MainActivity.class);
                            if (WelcomeActivity.instance != null){
                                WelcomeActivity.instance.finish();
                            }
                            finish();
                        }

                        @Override
                        protected void onFail(int code, String msg) {
                            super.onFail(code, msg);
                            dialog.dismiss();
                            btnLogin.setEnabled(true);
                        }
                    };
                }
                break;
        }
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if (etPhone.getText().length() < 11 || etPassword.getText().length() < 6){
            btnLogin.setBackgroundResource(R.drawable.btn_black_disable);
        }
        else {
            btnLogin.setBackgroundResource(R.drawable.btn_black);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (WelcomeActivity.instance == null){
            startActivity(WelcomeActivity.class);
        }
    }
}

