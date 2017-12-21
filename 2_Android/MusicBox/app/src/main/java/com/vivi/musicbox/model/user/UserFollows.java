package com.vivi.musicbox.model.user;

import com.vivi.musicbox.model.base.BaseModel;

import java.util.List;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public class UserFollows extends BaseModel {

    /**
     * follow : [{"py":"wyxw","time":0,"userId":1316351656,"followed":false,"experts":null,"followeds":31067,"userType":3,"expertTags":null,"authStatus":1,"follows":8,"mutual":false,"gender":1,"avatarUrl":"http://p1.music.126.net/yRELewNVfQnmTnoNiNRvUw==/18730180581314249.jpg","vipType":0,"accountStatus":0,"nickname":"网易新闻","remarkName":null,"signature":"我们为你提供丰富的资讯，也包容你天马行空的想法，愿与每个年轻态度一起逆生长，相遇、相知、相伴，各凭态度乘风浪。未知的世界，在新鲜有趣的短视频里，在海量的新闻事实里，在犀利的跟贴里，在独到的原创里，在最热的直播里，在\u201c网易号\u201d的自媒体平台里，和网易新闻一起去探索未知的世界吧！","blacklist":false,"eventCount":5,"playlistCount":1},{"py":"wyUFOdl","time":0,"userId":48353,"followed":false,"experts":null,"followeds":99999,"userType":0,"expertTags":null,"authStatus":1,"follows":64,"mutual":false,"gender":1,"avatarUrl":"http://p1.music.126.net/93GM3dF-epgkpmn7xdjseQ==/109951162797195316.jpg","vipType":11,"accountStatus":0,"nickname":"网易UFO丁磊","remarkName":null,"signature":"做音乐是为了灵魂的对话与沟通〜","blacklist":false,"eventCount":826,"playlistCount":28},{"py":"yylxms","time":0,"userId":9003,"followed":true,"experts":null,"followeds":99999,"userType":0,"expertTags":null,"authStatus":1,"follows":396,"mutual":false,"gender":0,"avatarUrl":"http://p1.music.126.net/3izpdkVvIPM0s3YZ2pnlaw==/109951163068642813.jpg","vipType":11,"accountStatus":0,"nickname":"云音乐小秘书","remarkName":null,"signature":"欢迎使用网易云音乐！独立音乐人和独立厂牌相关问题请私信@原创君 ，电台主播相关问题请联系@潇洒小编，如您需要其他帮助请私信@云音乐客服 解决。","blacklist":false,"eventCount":4359,"playlistCount":62},{"py":"wyyyl","time":0,"userId":1,"followed":true,"experts":null,"followeds":99999,"userType":2,"expertTags":null,"authStatus":1,"follows":383,"mutual":false,"gender":1,"avatarUrl":"http://p1.music.126.net/QWMV-Ru_6149AKe0mCBXKg==/1420569024374784.jpg","vipType":11,"accountStatus":0,"nickname":"网易云音乐","remarkName":null,"signature":"欢迎使用网易云音乐，有任何问题可以联系@云音乐客服， 我们会尽快答复。有关独立音乐人和独立厂牌请站内私信@原创君，DJ入驻联系邮箱： yunmusic@163.com","blacklist":false,"eventCount":8818,"playlistCount":126}]
     * touchCount : 0
     * more : false
     */

    private int touchCount;
    private boolean more;
    private List<FollowBean> follow;

    public int getTouchCount() {
        return touchCount;
    }

    public void setTouchCount(int touchCount) {
        this.touchCount = touchCount;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public List<FollowBean> getFollow() {
        return follow;
    }

    public void setFollow(List<FollowBean> follow) {
        this.follow = follow;
    }

    public static class FollowBean {
        /**
         * py : wyxw
         * time : 0
         * userId : 1316351656
         * followed : false
         * experts : null
         * followeds : 31067
         * userType : 3
         * expertTags : null
         * authStatus : 1
         * follows : 8
         * mutual : false
         * gender : 1
         * avatarUrl : http://p1.music.126.net/yRELewNVfQnmTnoNiNRvUw==/18730180581314249.jpg
         * vipType : 0
         * accountStatus : 0
         * nickname : 网易新闻
         * remarkName : null
         * signature : 我们为你提供丰富的资讯，也包容你天马行空的想法，愿与每个年轻态度一起逆生长，相遇、相知、相伴，各凭态度乘风浪。未知的世界，在新鲜有趣的短视频里，在海量的新闻事实里，在犀利的跟贴里，在独到的原创里，在最热的直播里，在“网易号”的自媒体平台里，和网易新闻一起去探索未知的世界吧！
         * blacklist : false
         * eventCount : 5
         * playlistCount : 1
         */

        private String py;
        private int time;
        private int userId;
        private boolean followed;
        private Object experts;
        private int followeds;
        private int userType;
        private Object expertTags;
        private int authStatus;
        private int follows;
        private boolean mutual;
        private int gender;
        private String avatarUrl;
        private int vipType;
        private int accountStatus;
        private String nickname;
        private Object remarkName;
        private String signature;
        private boolean blacklist;
        private int eventCount;
        private int playlistCount;

        public String getPy() {
            return py;
        }

        public void setPy(String py) {
            this.py = py;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
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

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
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

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
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

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public boolean isBlacklist() {
            return blacklist;
        }

        public void setBlacklist(boolean blacklist) {
            this.blacklist = blacklist;
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
