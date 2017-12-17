package com.vivi.music.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.chenyuwei.basematerial.activity.BaseActivity;
import com.vivi.music.R;
import com.vivi.music.network.RequestMaker;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by vivi on 2017/9/20.
 */

public class LoginActivity extends BaseActivity implements TextWatcher {

    private Button btnLogin;
    private EditText etAccount;
    private EditText etPaswd;

    @Override
    protected int onBindView() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(R.id.toolbar);
        setTitle(R.string.ttLogin);
        setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.btnRegister);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        etAccount = (EditText) findViewById(R.id.etAccount);
        etPaswd = (EditText) findViewById(R.id.etPaswd);
        etAccount.addTextChangedListener(this);
        etPaswd.addTextChangedListener(this);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()){
            case R.id.btnLogin:
                final String account = etAccount.getText().toString();
                final String paswd = etPaswd.getText().toString();
                if (account.length() < 6){
                    toast(R.string.tsAccountMin);
                }
                else if (account.length() > 12){
                    toast(R.string.tsAccountMax);
                }
                else if (paswd.length() < 6){
                    toast(R.string.tsPaswdMin);
                }
                else if (paswd.length() > 18){
                    toast(R.string.tsPaswdMax);
                }
                else {
                    new RequestMaker(activity, RequestMaker.Method.GET, "user/login") {
                        @Override
                        protected void onSuccess(String response) throws JSONException {
                            JSONObject json = new JSONObject(response);
                            JSONObject user = json.getJSONObject("user");
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putString("token",user.getString("token"));
                            editor.putString("name",user.getString("name"));
                            editor.putString("avatar",user.getString("avatar"));
                            editor.putString("account",user.getString("account"));
                            editor.putString("netneseId",user.getString("netneseId"));
                            editor.apply();
                            finish();
                        }

                        @Override
                        protected void setParams(HashMap<String, String> map) {
                            map.put("account",account);
                            map.put("paswd",paswd);
                        }
                    };
                }
                break;
            case R.id.btnRegister:
                startActivity(RegisterActivity.class);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_forget_paswd:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if (etAccount.getText().length() == 0 || etPaswd.getText().length() == 0){
            btnLogin.setBackgroundResource(R.drawable.shape_btn_disable);
            btnLogin.setEnabled(false);
        }
        else {
            btnLogin.setBackgroundResource(R.drawable.shape_btn);
            btnLogin.setEnabled(true);
        }
    }
}
