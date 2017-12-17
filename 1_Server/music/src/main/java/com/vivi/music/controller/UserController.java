package com.vivi.music.controller;

import com.vivi.music.model.BaseEntity;
import com.vivi.music.model.PlayListEntity;
import com.vivi.music.model.PlayListNetneseEntity;
import com.vivi.music.model.UserEntity;
import com.vivi.music.repository.MsgRepository;
import com.vivi.music.repository.PlayListNetneseRepository;
import com.vivi.music.repository.PlayListRepository;
import com.vivi.music.repository.UserRepository;
import com.vivi.music.utils.Default;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;


/**
 * Created by vivi on 2017/9/10.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private MsgRepository msgRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PlayListNetneseRepository playListNetneseRepository;

    @Autowired
    private PlayListRepository playListRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @ResponseBody
    public BaseEntity register(@RequestParam(value="account") String account, @RequestParam(value="paswd") String paswd, @RequestParam(value="name") String name) {
        BaseEntity entity = new BaseEntity();
        //code=101
        List<UserEntity> users = userRepository.findByAccount(account);
        if(users.size() != 0){
            entity.setCode(101);
            entity.setMsg(msgRepository.findOne(entity.getCode()).getMsg());
        }
        //code=200
        else{
            UserEntity user = new UserEntity();
            user.setAccount(account);
            user.setPaswd(paswd);
            user.setName(name);
            user.setNetneseId(-1);
            user.setToken(UUID.randomUUID().toString());
            user.setAvatar(Default.def_avatar);
            userRepository.save(user);
            user = userRepository.findByAccount(account).get(0);
            PlayListEntity playList = new PlayListEntity();
            playList.setCreatorId(user.getId());
            playList.setName(user.getName() + "喜欢的音乐");
            playList.setUserId(user.getId());
            playList.setCoverImgUrl(Default.def_playlist);
            playListRepository.save(playList);
            Map<String,Object> dataMap = new HashMap<>();
            dataMap.put("user", user);
            dataMap.put("playLists", playListRepository.findByUserId(user.getId()));
            dataMap.put("playListNetneses", playListNetneseRepository.findByNetneseId(user.getNetneseId()));
            entity.setState(1);
            entity.setCode(200);
            entity.setData(dataMap);
        }
        return entity;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public BaseEntity login(@RequestParam(value="account") String account,@RequestParam(value="paswd") String paswd) {
        BaseEntity entity = new BaseEntity();
        //code=102
        List<UserEntity> users = userRepository.findByAccount(account);
        if (users.size() == 0){
            entity.setCode(102);
            entity.setMsg(msgRepository.findOne(entity.getCode()).getMsg());
        }
        //code=200
        else {
            UserEntity user = users.get(0);
            if (user.getPaswd().equals(paswd)){
                entity.setState(1);
                entity.setCode(200);
                Map<String,Object> dataMap = new HashMap<>();
                dataMap.put("user", user);
                dataMap.put("playLists", playListRepository.findByUserId(user.getId()));
                dataMap.put("playListNetneses", playListNetneseRepository.findByNetneseId(user.getNetneseId()));
                entity.setData(dataMap);
            }
        }
        return entity;
    }

    @RequestMapping(value = "/playlist", method = RequestMethod.GET)
    @ResponseBody
    public BaseEntity playlist(@RequestParam(value="token") String token) throws JSONException {
        BaseEntity entity = new BaseEntity();
        //code=102
        List<UserEntity> users = userRepository.findByToken(token);
        if (users.size() == 0){
            entity.setCode(102);
            entity.setMsg(msgRepository.findOne(entity.getCode()).getMsg());
        }
        //code=103
        else {
            UserEntity user = users.get(0);
            List<PlayListEntity> playLists = playListRepository.findByUserId(user.getId());
            List<PlayListNetneseEntity> playListNetneses = playListNetneseRepository.findByNetneseId(user.getNetneseId());
            Map<String,Object> dataMap = new HashMap<>();
            dataMap.put("playLists", playLists);
            dataMap.put("playListNetneses", playListNetneses);
            entity.setState(1);
            entity.setCode(200);
            entity.setData(dataMap);
        }
        return entity;
    }
}
