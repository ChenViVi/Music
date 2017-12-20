package com.vivi.musicbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.vivi.musicbox.http.RequestMaker;
import com.vivi.musicbox.http.ServiceFactory;
import com.vivi.musicbox.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new RequestMaker<User>(this, ServiceFactory.getUserService().login("15004112829","qpb110120")){

            @Override
            protected void onSuccess(User response) {
                Log.e("test","uid="+response.getAccount().getId());
            }

            @Override
            protected void onFail(int code, String msg) {
                super.onFail(code, msg);
                Log.e("test","onFail");
            }
        };
    }
}
