package com.vivi.musicbox.http.service;

import com.vivi.musicbox.model.PlayListDetail;
import com.vivi.musicbox.model.PlayListHighQuality;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public interface PlayListService {
    @GET("top/playlist/highquality")
    Call<PlayListHighQuality> highQuality(@Query("limit") int limit, @Query("cat") String cat);

    @GET("playlist/detail")
    Call<PlayListDetail> detail(@Query("id") String id);
}
