package com.vivi.music.controller;

import com.vivi.music.model.*;
import com.vivi.music.repository.*;
import com.vivi.music.utils.HttpRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by vivi on 2017/9/10.
 */
@Controller
@RequestMapping(value = "/netnease")
public class NetneaseController {

    @Autowired
    private MsgRepository msgRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserNetneseRepository userNetneseRepository;

    @Autowired
    private PlayListNetneseRepository playListNetneseRepository;

    @RequestMapping(value = "/bind", method = RequestMethod.GET)
    @ResponseBody
    public BaseEntity boundNetnease(@RequestParam(value = "token") String token, @RequestParam(value = "name") String name) throws JSONException {
        BaseEntity entity = new BaseEntity();
        List<UserEntity> users = userRepository.findByToken(token);
        //code=201
        if (users.size() == 0) {
            entity.setCode(201);
            entity.setMsg(msgRepository.findOne(entity.getCode()).getMsg());
        } else {
            UserEntity user = users.get(0);
            JSONObject result = new JSONObject(HttpRequest.sendPost("http://music.163.com/api/search/get", "type=1002&s=" + name)).getJSONObject("result");
            //code=202
            if (result.getInt("userprofileCount") == 0) {
                entity.setCode(202);
                entity.setMsg(msgRepository.findOne(entity.getCode()).getMsg());
            }
            //code=200
            else {
                if (user.getNetneseId() != -1)
                    playListNetneseRepository.deleteByNetneseId(user.getNetneseId());
                JSONObject userInfo = result.getJSONArray("userprofiles").getJSONObject(0);
                List<UserNetneseEntity> userNetneses = userNetneseRepository.findByUserId(user.getId());
                UserNetneseEntity userNetnese;
                if (userNetneses.size() == 0)
                    userNetnese = new UserNetneseEntity();
                else
                    userNetnese = userNetneses.get(0);
                userNetnese.setUserId(user.getId());
                userNetnese.setId(userInfo.getInt("userId"));
                userNetnese.setNickname(userInfo.getString("nickname"));
                userNetnese.setSignature(userInfo.getString("signature"));
                userNetnese.setAvatarUrl(userInfo.getString("avatarUrl"));
                userNetnese.setBackgroundUrl(userInfo.getString("backgroundUrl"));
                user.setNetneseId(userInfo.getInt("userId"));
                userNetneseRepository.save(userNetnese);
                userRepository.save(user);
                JSONArray playlists = new JSONObject(HttpRequest.sendGet("http://music.163.com/api/user/playlist", "offset=0&limit=100&uid=" + userInfo.getInt("userId"))).getJSONArray("playlist");
                List<PlayListNetneseEntity> playLists = new ArrayList<>();
                for (int i = 0; i < playlists.length(); i++) {
                    JSONObject json = playlists.getJSONObject(i);
                    PlayListNetneseEntity playlist = new PlayListNetneseEntity();
                    playlist.setId(json.getInt("id"));
                    playlist.setName(json.getString("name"));
                    playlist.setTrackCount(json.getInt("trackCount"));
                    playlist.setPlayCount(json.getInt("playCount"));
                    playlist.setCoverImgUrl(json.getString("coverImgUrl"));
                    playlist.setDescription(json.getString("description"));
                    playlist.setNetneseId(userInfo.getInt("userId"));
                    playlist.setCreatorId(json.getJSONObject("creator").getInt("userId"));
                    playLists.add(playlist);
                }
                playListNetneseRepository.save(playLists);
                entity.setState(1);
                entity.setCode(200);
                entity.setData(user.getNetneseId());
            }
        }
        return entity;
    }
}


