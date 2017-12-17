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

public class RegisterActivity extends BaseActivity implements TextWatcher{

    private Button btnRegister;
    private EditText etAccount;
    private EditText etPaswd;
    private EditText etRePaswd;

    @Override
    protected int onBindView() {
        return R.layout.activity_register;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(R.id.toolbar);
        setTitle(R.string.ttRegister);
        setDisplayHomeAsUpEnabled(true);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        etAccount = (EditText) findViewById(R.id.etAccount);
        etPaswd = (EditText) findViewById(R.id.etPaswd);
        etRePaswd = (EditText) findViewById(R.id.etRePaswd);
        etAccount.addTextChangedListener(this);
        etPaswd.addTextChangedListener(this);
        etRePaswd.addTextChangedListener(this);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()){
            case R.id.btnRegister:
                final String account = etAccount.getText().toString();
                final String paswd = etPaswd.getText().toString();
                final String repaswd = etRePaswd.getText().toString();
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
                else  if (!repaswd.equals(paswd)){
                    toast(R.string.tsPaswdEqual);
                }
                else {
                    new RequestMaker(activity, RequestMaker.Method.GET, "user/register") {
                        @Override
                        protected void onSuccess(String response) throws JSONException {
                            JSONObject json = new JSONObject(response);
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putString("token",json.getString("token"));
                            editor.putString("name",json.getString("name"));
                            editor.putString("avatar",json.getString("avatar"));
                            editor.putString("account",json.getString("account"));
                            editor.putString("netneseId",json.getString("netneseId"));
                            editor.apply();
                            finish();
                        }

                        @Override
                        protected void setParams(HashMap<String, String> map) {
                            map.put("account",account);
                            map.put("paswd",paswd);
                            map.put("name",account);
                        }
                    };
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_register, menu);
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
        if (etAccount.getText().length() == 0 || etPaswd.getText().length() == 0 || etRePaswd.getText().length() == 0){
            btnRegister.setBackgroundResource(R.drawable.shape_btn_disable);
            btnRegister.setEnabled(false);
        }
        else {
            btnRegister.setBackgroundResource(R.drawable.shape_btn);
            btnRegister.setEnabled(true);
        }
    }
}
