package com.vivi.musicbox.http.service;

import com.vivi.musicbox.model.playlist.PlayListDetail;
import com.vivi.musicbox.model.playlist.PlayListHighQuality;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public interface PlayListService {

    /**
     * 作用：获取精品歌单
     * cat: 标签, 比如 “华语”、”古风” 、”欧美”、”流行”,默认为”全部”
     */
    @GET("top/playlist/highquality")
    Call<PlayListHighQuality> highQuality(@Query("limit") int limit, @Query("cat") String cat);

    /**
     * 作用：获取歌单详情
     */
    @GET("playlist/detail")
    Call<PlayListDetail> detail(@Query("id") String id);

    /**
     * 作用：添加或删除歌单歌曲
     * op: 从歌单增加单曲为add,删除为 del
     * pid: 歌单id
     * tracks: 歌曲id
     */
    @GET("playlist/tracks")
    Call<PlayListDetail> tracks(@Query("op") String op, @Query("pid") String pid, @Query("tracks") String tracks);
}
