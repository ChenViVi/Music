package com.vivi.musicbox.http.service;

import com.vivi.musicbox.model.user.UserAccount;
import com.vivi.musicbox.model.base.BaseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vivi on 2017/12/20.
 */
public interface LoginService {

    /**
     * 作用：手机登录
     */
    @GET("login/cellphone")
    Call<UserAccount> login(@Query("phone") String phone, @Query("password") String password);

    /**
     * 作用：刷新登录
     */
    @GET("login/refresh")
    Call<BaseModel> refresh(@Query("uid") String uid);
}
