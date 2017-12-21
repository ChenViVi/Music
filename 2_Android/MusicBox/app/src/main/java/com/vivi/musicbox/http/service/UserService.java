package com.vivi.musicbox.http.service;

import com.vivi.musicbox.model.UserEvent;
import com.vivi.musicbox.model.UserFolloweds;
import com.vivi.musicbox.model.UserFollows;
import com.vivi.musicbox.model.UserPlayList;
import com.vivi.musicbox.model.UserRecord;
import com.vivi.musicbox.model.UserSubCount;
import com.vivi.musicbox.model.UserDetail;
import com.vivi.musicbox.model.base.BaseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public interface UserService {
    @GET("user/detail")
    Call<UserDetail> detail(@Query("uid") String uid);

    @GET("user/subcount")
    Call<UserSubCount> subcount(@Query("uid") String uid);

    @GET("user/playlist")
    Call<UserPlayList> playlist(@Query("uid") String uid);

    //测试账号无论怎么倒腾也没有相关参数，暂时无法编程
    @GET("user/dj")
    Call<BaseModel> dj(@Query("uid") String uid);

    @GET("user/follows")
    Call<UserFollows> follows(@Query("uid") String uid, @Query("limit") int limit, @Query("offset") int offset);

    @GET("user/followeds")
    Call<UserFolloweds> followeds(@Query("uid") String uid, @Query("limit") int limit, @Query("offset") int offset);

    @GET("user/event")
    Call<UserEvent> event(@Query("uid") String uid);

    @GET("user/record")
    Call<UserRecord> record(@Query("uid") String uid, @Query("type") int type);
}
