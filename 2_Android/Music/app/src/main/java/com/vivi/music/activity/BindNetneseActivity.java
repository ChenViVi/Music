package com.vivi.music.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
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

public class BindNetneseActivity extends BaseActivity implements TextWatcher {

    private Button btnBindNetnese;
    private EditText etName;

    @Override
    protected int onBindView() {
        return R.layout.activity_bind_netnese;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(R.id.toolbar);
        setTitle(R.string.ttBindNetnese);
        setDisplayHomeAsUpEnabled(true);
        btnBindNetnese = (Button) findViewById(R.id.btnBindNetnese);
        etName = (EditText) findViewById(R.id.etName);
        etName.addTextChangedListener(this);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()){
            case R.id.btnBindNetnese:
                final String name = etName.getText().toString();
                if (name.length() < 2){
                    toast(R.string.tsNetneseMin);
                }
                else if (name.length() > 30){
                    toast(R.string.tsNetneseMax);
                }
                else {
                    new RequestMaker(activity, RequestMaker.Method.GET, "netnease/bind", "netnease/bind") {
                        @Override
                        protected void onSuccess(String response) throws JSONException {
                            finish();
                        }

                        @Override
                        protected void setParams(HashMap<String, String> map) {
                            map.put("token",getToken());
                            map.put("name",name);
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
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if (etName.getText().length() == 0){
            btnBindNetnese.setBackgroundResource(R.drawable.shape_btn_disable);
            btnBindNetnese.setEnabled(false);
        }
        else {
            btnBindNetnese.setBackgroundResource(R.drawable.shape_btn);
            btnBindNetnese.setEnabled(true);
        }
    }
}
