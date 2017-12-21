package com.vivi.musicbox.http.service;

import com.vivi.musicbox.model.search.SearchMultiMatch;
import com.vivi.musicbox.model.search.SearchResult;
import com.vivi.musicbox.model.search.SearchSuggest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vivi on 2017/12/21.
 */

public interface SearchService {

    public static final int SEARCH_TYPE_SONG = 1;
    public static final int SEARCH_TYPE_ALBUM = 10;
    public static final int SEARCH_TYPE_ARTIST = 100;
    public static final int SEARCH_TYPE_PLAYLIST = 1000;
    public static final int SEARCH_TYPE_USER = 1002;
    public static final int SEARCH_TYPE_MV = 1004;
    public static final int SEARCH_TYPE_LYRIC = 1006;
    public static final int SEARCH_TYPE_FM = 1009;

    @GET("search")
    Call<SearchResult> searchResult(@Query("keywords") String keywords, @Query("type") int type, @Query("limit") int limit, @Query("offset") int offset);

    @GET("search/suggest")
    Call<SearchSuggest> searchSuggest(@Query("keywords") String keywords, @Query("type") int type, @Query("limit") int limit, @Query("offset") int offset);

    @GET("search/multimatch")
    Call<SearchMultiMatch> searchMultiMatch(@Query("keywords") String keywords);
}
