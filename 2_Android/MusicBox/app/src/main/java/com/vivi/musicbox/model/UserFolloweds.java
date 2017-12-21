package com.vivi.musicbox.model;

import com.vivi.musicbox.model.base.BaseModel;

import java.util.List;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public class UserFolloweds extends BaseModel {

    /**
     * more : false
     * followeds : [{"py":"cgctgctgctg","time":1513840834854,"userId":1315274973,"vipType":0,"accountStatus":0,"nickname":"cgctgctgctg","follows":5,"mutual":false,"remarkName":null,"avatarUrl":"http://p1.music.126.net/Za0nWZTmwTw2Eb7X6A8eRQ==/19237055440070821.jpg","gender":2,"userType":0,"experts":null,"followeds":0,"expertTags":null,"authStatus":0,"followed":false,"signature":null,"eventCount":0,"playlistCount":1}]
     */

    private boolean more;
    private List<FollowedsBean> followeds;

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public List<FollowedsBean> getFolloweds() {
        return followeds;
    }

    public void setFolloweds(List<FollowedsBean> followeds) {
        this.followeds = followeds;
    }

    public static class FollowedsBean {
        /**
         * py : cgctgctgctg
         * time : 1513840834854
         * userId : 1315274973
         * vipType : 0
         * accountStatus : 0
         * nickname : cgctgctgctg
         * follows : 5
         * mutual : false
         * remarkName : null
         * avatarUrl : http://p1.music.126.net/Za0nWZTmwTw2Eb7X6A8eRQ==/19237055440070821.jpg
         * gender : 2
         * userType : 0
         * experts : null
         * followeds : 0
         * expertTags : null
         * authStatus : 0
         * followed : false
         * signature : null
         * eventCount : 0
         * playlistCount : 1
         */

        private String py;
        private long time;
        private int userId;
        private int vipType;
        private int accountStatus;
        private String nickname;
        private int follows;
        private boolean mutual;
        private Object remarkName;
        private String avatarUrl;
        private int gender;
        private int userType;
        private Object experts;
        private int followeds;
        private Object expertTags;
        private int authStatus;
        private boolean followed;
        private Object signature;
        private int eventCount;
        private int playlistCount;

        public String getPy() {
            return py;
        }

        public void setPy(String py) {
            this.py = py;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getFollows() {
            return follows;
        }

        public void setFollows(int follows) {
            this.follows = follows;
        }

        public boolean isMutual() {
            return mutual;
        }

        public void setMutual(boolean mutual) {
            this.mutual = mutual;
        }

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public Object getExperts() {
            return experts;
        }

        public void setExperts(Object experts) {
            this.experts = experts;
        }

        public int getFolloweds() {
            return followeds;
        }

        public void setFolloweds(int followeds) {
            this.followeds = followeds;
        }

        public Object getExpertTags() {
            return expertTags;
        }

        public void setExpertTags(Object expertTags) {
            this.expertTags = expertTags;
        }

        public int getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(int authStatus) {
            this.authStatus = authStatus;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public Object getSignature() {
            return signature;
        }

        public void setSignature(Object signature) {
            this.signature = signature;
        }

        public int getEventCount() {
            return eventCount;
        }

        public void setEventCount(int eventCount) {
            this.eventCount = eventCount;
        }

        public int getPlaylistCount() {
            return playlistCount;
        }

        public void setPlaylistCount(int playlistCount) {
            this.playlistCount = playlistCount;
        }
    }
}
