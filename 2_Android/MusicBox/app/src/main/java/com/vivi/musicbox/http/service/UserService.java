package com.vivi.musicbox.http.service;

import com.vivi.musicbox.model.user.UserEvent;
import com.vivi.musicbox.model.user.UserFolloweds;
import com.vivi.musicbox.model.user.UserFollows;
import com.vivi.musicbox.model.user.UserPlayList;
import com.vivi.musicbox.model.user.UserRecord;
import com.vivi.musicbox.model.user.UserSubCount;
import com.vivi.musicbox.model.user.UserDetail;
import com.vivi.musicbox.model.base.BaseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public interface UserService {

    /**
     * 作用：获取用户详情
     */
    @GET("user/detail")
    Call<UserDetail> detail(@Query("uid") String uid);

    /**
     * 作用：获取用户信息,歌单，收藏，mv, dj 数量
     */
    @GET("user/subcount")
    Call<UserSubCount> subcount(@Query("uid") String uid);

    /**
     * 作用：获取用户歌单
     */
    @GET("user/playlist")
    Call<UserPlayList> playlist(@Query("uid") String uid);

    /**
     * 作用：获取用户电台
     * 测试账号无论怎么倒腾也没有相关参数，暂时无法编程
     */
    @GET("user/dj")
    Call<BaseModel> dj(@Query("uid") String uid);

    /**
     * 作用：获取用户关注列表
     */
    @GET("user/follows")
    Call<UserFollows> follows(@Query("uid") String uid, @Query("limit") int limit, @Query("offset") int offset);

    /**
     * 作用：获取用户关注列表
     */
    @GET("user/followeds")
    Call<UserFolloweds> followeds(@Query("uid") String uid, @Query("limit") int limit, @Query("offset") int offset);

    /**
     * 作用：获取用户粉丝列表
     */
    @GET("user/event")
    Call<UserEvent> event(@Query("uid") String uid);

    /**
     * 作用：获取用户播放记录
     * type：type=1时只返回weekData, type=0时返回allData
     */
    @GET("user/record")
    Call<UserRecord> record(@Query("uid") String uid, @Query("type") int type);
}
