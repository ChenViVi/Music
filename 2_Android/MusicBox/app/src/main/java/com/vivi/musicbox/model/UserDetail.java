package com.vivi.musicbox.model;

import com.vivi.musicbox.model.base.BaseModel;

import java.util.List;

/**
 * Created by vivi on 2017/12/20.
 */

public class UserDetail extends BaseModel {

    /**
     * profile : {"avatarImgIdStr":"18686200114669622","backgroundImgIdStr":"109951162868128395","detailDescription":"","djStatus":0,"followed":false,"province":210000,"defaultAvatar":true,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","gender":0,"birthday":-2209017600000,"city":210200,"userId":1317458286,"remarkName":null,"mutual":false,"nickname":"我任何人都不是","vipType":0,"accountStatus":0,"avatarImgId":18686200114669624,"backgroundUrl":"http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg","description":"","experts":{},"expertTags":null,"authStatus":0,"backgroundImgId":109951162868128400,"userType":0,"signature":"","authority":0,"avatarImgId_str":"18686200114669622","followeds":0,"follows":4,"blacklist":false,"eventCount":0,"playlistCount":1,"playlistBeSubscribedCount":0}
     * level : 0
     * listenSongs : 0
     * userPoint : {"userId":1317458286,"balance":0,"updateTime":1513839151108,"version":0,"status":0,"blockBalance":0}
     * mobileSign : false
     * pcSign : false
     * peopleCanSeeMyPlayRecord : true
     * bindings : [{"refreshTime":1513839036,"expiresIn":2147483647,"userId":1317458286,"tokenJsonStr":"{\"countrycode\":\"\",\"cellphone\":\"15926099436\",\"hasPassword\":true}","url":"","expired":false,"id":6508347690,"type":1}]
     * adValid : true
     * createTime : 1513839036003
     * createDays : 1
     */

    private Profile profile;
    private int level;
    private int listenSongs;
    private UserPoint userPoint;
    private boolean mobileSign;
    private boolean pcSign;
    private boolean peopleCanSeeMyPlayRecord;
    private boolean adValid;
    private long createTime;
    private int createDays;
    private List<Binding> bindings;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getListenSongs() {
        return listenSongs;
    }

    public void setListenSongs(int listenSongs) {
        this.listenSongs = listenSongs;
    }

    public UserPoint getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(UserPoint userPoint) {
        this.userPoint = userPoint;
    }

    public boolean isMobileSign() {
        return mobileSign;
    }

    public void setMobileSign(boolean mobileSign) {
        this.mobileSign = mobileSign;
    }

    public boolean isPcSign() {
        return pcSign;
    }

    public void setPcSign(boolean pcSign) {
        this.pcSign = pcSign;
    }

    public boolean isPeopleCanSeeMyPlayRecord() {
        return peopleCanSeeMyPlayRecord;
    }

    public void setPeopleCanSeeMyPlayRecord(boolean peopleCanSeeMyPlayRecord) {
        this.peopleCanSeeMyPlayRecord = peopleCanSeeMyPlayRecord;
    }

    public boolean isAdValid() {
        return adValid;
    }

    public void setAdValid(boolean adValid) {
        this.adValid = adValid;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getCreateDays() {
        return createDays;
    }

    public void setCreateDays(int createDays) {
        this.createDays = createDays;
    }

    public List<Binding> getBindings() {
        return bindings;
    }

    public void setBindings(List<Binding> bindings) {
        this.bindings = bindings;
    }

    public static class Profile {
        /**
         * avatarImgIdStr : 18686200114669622
         * backgroundImgIdStr : 109951162868128395
         * detailDescription :
         * djStatus : 0
         * followed : false
         * province : 210000
         * defaultAvatar : true
         * avatarUrl : http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg
         * gender : 0
         * birthday : -2209017600000
         * city : 210200
         * userId : 1317458286
         * remarkName : null
         * mutual : false
         * nickname : 我任何人都不是
         * vipType : 0
         * accountStatus : 0
         * avatarImgId : 18686200114669624
         * backgroundUrl : http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg
         * description :
         * experts : {}
         * expertTags : null
         * authStatus : 0
         * backgroundImgId : 109951162868128400
         * userType : 0
         * signature :
         * authority : 0
         * avatarImgId_str : 18686200114669622
         * followeds : 0
         * follows : 4
         * blacklist : false
         * eventCount : 0
         * playlistCount : 1
         * playlistBeSubscribedCount : 0
         */

        private String avatarImgIdStr;
        private String backgroundImgIdStr;
        private String detailDescription;
        private int djStatus;
        private boolean followed;
        private int province;
        private boolean defaultAvatar;
        private String avatarUrl;
        private int gender;
        private long birthday;
        private int city;
        private int userId;
        private Object remarkName;
        private boolean mutual;
        private String nickname;
        private int vipType;
        private int accountStatus;
        private long avatarImgId;
        private String backgroundUrl;
        private String description;
        private ExpertsBean experts;
        private Object expertTags;
        private int authStatus;
        private long backgroundImgId;
        private int userType;
        private String signature;
        private int authority;
        private String avatarImgId_str;
        private int followeds;
        private int follows;
        private boolean blacklist;
        private int eventCount;
        private int playlistCount;
        private int playlistBeSubscribedCount;

        public String getAvatarImgIdStr() {
            return avatarImgIdStr;
        }

        public void setAvatarImgIdStr(String avatarImgIdStr) {
            this.avatarImgIdStr = avatarImgIdStr;
        }

        public String getBackgroundImgIdStr() {
            return backgroundImgIdStr;
        }

        public void setBackgroundImgIdStr(String backgroundImgIdStr) {
            this.backgroundImgIdStr = backgroundImgIdStr;
        }

        public String getDetailDescription() {
            return detailDescription;
        }

        public void setDetailDescription(String detailDescription) {
            this.detailDescription = detailDescription;
        }

        public int getDjStatus() {
            return djStatus;
        }

        public void setDjStatus(int djStatus) {
            this.djStatus = djStatus;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public boolean isDefaultAvatar() {
            return defaultAvatar;
        }

        public void setDefaultAvatar(boolean defaultAvatar) {
            this.defaultAvatar = defaultAvatar;
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

        public long getBirthday() {
            return birthday;
        }

        public void setBirthday(long birthday) {
            this.birthday = birthday;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public boolean isMutual() {
            return mutual;
        }

        public void setMutual(boolean mutual) {
            this.mutual = mutual;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
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

        public long getAvatarImgId() {
            return avatarImgId;
        }

        public void setAvatarImgId(long avatarImgId) {
            this.avatarImgId = avatarImgId;
        }

        public String getBackgroundUrl() {
            return backgroundUrl;
        }

        public void setBackgroundUrl(String backgroundUrl) {
            this.backgroundUrl = backgroundUrl;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public ExpertsBean getExperts() {
            return experts;
        }

        public void setExperts(ExpertsBean experts) {
            this.experts = experts;
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

        public long getBackgroundImgId() {
            return backgroundImgId;
        }

        public void setBackgroundImgId(long backgroundImgId) {
            this.backgroundImgId = backgroundImgId;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public int getAuthority() {
            return authority;
        }

        public void setAuthority(int authority) {
            this.authority = authority;
        }

        public String getAvatarImgId_str() {
            return avatarImgId_str;
        }

        public void setAvatarImgId_str(String avatarImgId_str) {
            this.avatarImgId_str = avatarImgId_str;
        }

        public int getFolloweds() {
            return followeds;
        }

        public void setFolloweds(int followeds) {
            this.followeds = followeds;
        }

        public int getFollows() {
            return follows;
        }

        public void setFollows(int follows) {
            this.follows = follows;
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

        public int getPlaylistBeSubscribedCount() {
            return playlistBeSubscribedCount;
        }

        public void setPlaylistBeSubscribedCount(int playlistBeSubscribedCount) {
            this.playlistBeSubscribedCount = playlistBeSubscribedCount;
        }

        public static class ExpertsBean {
        }
    }

    public static class UserPoint {
        /**
         * userId : 1317458286
         * balance : 0
         * updateTime : 1513839151108
         * version : 0
         * status : 0
         * blockBalance : 0
         */

        private int userId;
        private int balance;
        private long updateTime;
        private int version;
        private int status;
        private int blockBalance;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getBlockBalance() {
            return blockBalance;
        }

        public void setBlockBalance(int blockBalance) {
            this.blockBalance = blockBalance;
        }
    }

    public static class Binding {
        /**
         * refreshTime : 1513839036
         * expiresIn : 2147483647
         * userId : 1317458286
         * tokenJsonStr : {"countrycode":"","cellphone":"15926099436","hasPassword":true}
         * url :
         * expired : false
         * id : 6508347690
         * type : 1
         */

        private int refreshTime;
        private int expiresIn;
        private int userId;
        private String tokenJsonStr;
        private String url;
        private boolean expired;
        private long id;
        private int type;

        public int getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(int refreshTime) {
            this.refreshTime = refreshTime;
        }

        public int getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getTokenJsonStr() {
            return tokenJsonStr;
        }

        public void setTokenJsonStr(String tokenJsonStr) {
            this.tokenJsonStr = tokenJsonStr;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isExpired() {
            return expired;
        }

        public void setExpired(boolean expired) {
            this.expired = expired;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
