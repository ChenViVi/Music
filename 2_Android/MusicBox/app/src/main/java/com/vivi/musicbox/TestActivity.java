package com.vivi.musicbox;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.vivi.musicbox.http.RequestMaker;
import com.vivi.musicbox.http.ServiceFactory;
import com.vivi.musicbox.model.playlist.PlayListDetail;
import com.vivi.musicbox.model.playlist.PlayListHighQuality;
import com.vivi.musicbox.model.user.UserAccount;
import com.vivi.musicbox.model.user.UserDetail;
import com.vivi.musicbox.model.user.UserEvent;
import com.vivi.musicbox.model.user.UserFolloweds;
import com.vivi.musicbox.model.user.UserFollows;
import com.vivi.musicbox.model.user.UserPlayList;
import com.vivi.musicbox.model.user.UserRecord;
import com.vivi.musicbox.model.user.UserSubCount;

public class TestActivity extends AppCompatActivity {

    private String uid = "1317458286";
    private String phone = "15926099436";
    private String password = "qpb110120";
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        new RequestMaker<UserAccount>(context, ServiceFactory.getLoginService().login(phone, password)){

            @Override
            protected void onSuccess(UserAccount userAccount) {
                String uid = String.valueOf(userAccount.getAccount().getId());
                /*userDetail(uid);
                userSubCount(uid);
                userPlayList(userAccount.getAccount().getId());
                userFollows(uid, 2 ,0);
                userFolloweds(uid, 2 ,0);
                userEvent(uid);
                userRecord(uid, 0);
                playListHighQuality(2, "日语");
                playListDetail("2023423393");*/
            }
        };
    }

    private void userDetail(String uid){
        new RequestMaker<UserDetail>(context, ServiceFactory.getUserService().detail(uid)){
            @Override
            protected void onSuccess(UserDetail userDetail) {

            }
        };
    }

    private void userSubCount(String uid){
        new RequestMaker<UserSubCount>(context, ServiceFactory.getUserService().subcount(uid)){
            @Override
            protected void onSuccess(UserSubCount userSubCount) {

            }
        };
    }

    private void userPlayList(int uid){
        new RequestMaker<UserPlayList>(context, ServiceFactory.getUserService().playlist(uid)){
            @Override
            protected void onSuccess(UserPlayList userPlayList) {

            }
        };
    }

    private void userFollows(String uid, int limit, int offset){
        new RequestMaker<UserFollows>(context, ServiceFactory.getUserService().follows(uid, limit, offset)){
            @Override
            protected void onSuccess(UserFollows userFollows) {

            }
        };
    }

    private void userFolloweds(String uid, int limit, int offset){
        new RequestMaker<UserFolloweds>(context, ServiceFactory.getUserService().followeds(uid, limit, offset)){
            @Override
            protected void onSuccess(UserFolloweds userFolloweds) {

            }
        };
    }

    private void userEvent(String uid){
        new RequestMaker<UserEvent>(context, ServiceFactory.getUserService().event(uid)){
            @Override
            protected void onSuccess(UserEvent userEvent) {

            }
        };
    }

    private void userRecord(String uid, int type){
        new RequestMaker<UserRecord>(context, ServiceFactory.getUserService().record(uid, type)){
            @Override
            protected void onSuccess(UserRecord userRecord) {

            }
        };
    }

    private void playListHighQuality(int limit, String cat){
        new RequestMaker<PlayListHighQuality>(context, ServiceFactory.getPlayListService().highQuality(limit, cat)){
            @Override
            protected void onSuccess(PlayListHighQuality playListHighQuality) {

            }
        };
    }

    private void playListDetail(long id){
        new RequestMaker<PlayListDetail>(context, ServiceFactory.getPlayListService().detail(id)){
            @Override
            protected void onSuccess(PlayListDetail playListDetail) {

            }
        };
    }

    private void fuck(){
        Toast.makeText(TestActivity.this, "fuck", Toast.LENGTH_SHORT).show();
        Log.e("fuck","fuck");
    }
}
