package com.vivi.musicbox.http;

import com.vivi.musicbox.http.service.LoginService;
import com.vivi.musicbox.http.service.PlayListService;
import com.vivi.musicbox.http.service.UserService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vivi on 2016/9/17.
 */
public class ServiceFactory {
    private static String baseUrl = "http://116.196.87.226:3000/";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static LoginService getLoginService() {
        return retrofit.create(LoginService.class);
    }

    public static UserService getUserService() {
        return retrofit.create(UserService.class);
    }

    public static PlayListService getPlayListService() {
        return retrofit.create(PlayListService.class);
    }
}
