package com.vivi.music;

import com.vivi.music.utils.HttpRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by vivi on 2017/9/11.
 */
public class Test {
    public static void main(String[] args) throws JSONException, IOException {
        /*String sr= HttpRequest.sendPost("http://music.163.com/api/search/get", "type=1002&s=3f543t5vytnjhtc");
        JSONObject json = new JSONObject(HttpRequest.sendPost("http://music.163.com/api/search/get", "type=1002&s=ViVi虚拟机"));
        JSONObject userInfo = json.getJSONObject("result").getJSONArray("userprofiles").getJSONObject(0);
        System.out.println(userInfo);
        System.out.println(userInfo.getString(sr));
        JSONObject json = new JSONObject(HttpRequest.sendPost("http://music.163.com/api/user/playlist", "offset=0&limit=2&uid=44404168"))
                .getJSONArray("playlist").getJSONObject(0);
        System.out.println(json.getInt("id"));*/
        JSONArray playlists = new JSONObject(HttpRequest.sendGet("http://music.163.com/api/user/playlist", "offset=0&limit=100&uid=44404168")).getJSONArray("playlist");
        for (int i = 0; i < playlists.length(); i++){
            JSONObject json = playlists.getJSONObject(i);
            System.out.println(json.getString("name"));
        }
    }
}
