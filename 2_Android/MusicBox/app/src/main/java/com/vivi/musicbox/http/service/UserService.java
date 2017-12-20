package com.vivi.musicbox.http.service;

import com.vivi.musicbox.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vivi on 2017/12/20.
 */
public interface UserService {
    @GET("login/cellphone")
    Call<User> login(@Query("phone") String phone, @Query("password") String password);
}
