package com.vivi.musicbox.model.user;

import com.vivi.musicbox.model.base.BaseModel;

import java.util.List;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public class UserAccount extends BaseModel {


    /**
     * loglongype : 1
     * account : {"id":44404168,"userName":"1_15004112829","type":1,"status":0,"whitelistAuthority":0,"createTime":0,"salt":"[B@58b7e652","tokenVersion":2,"ban":0,"baoyueVersion":1,"donateVersion":0,"vipType":11,"viptypeVersion":1507705884398,"anonimousUser":false}
     * profile : {"avatarImgIdStr":"18623527953017203","backgroundImgIdStr":"3427177766293890","avatarImgId":18623527953017203,"experts":{},"expertTags":null,"authStatus":0,"backgroundImgId":3427177766293890,"userType":0,"backgroundUrl":"http://p1.music.126.net/cIJ5k63TUqPMjaslla0-uQ==/3427177766293890.jpg","detailDescription":"","djStatus":10,"followed":false,"vipType":11,"remarkName":null,"accountStatus":0,"nickname":"ViVi虚拟机","province":210000,"mutual":false,"userId":44404168,"description":"","defaultAvatar":false,"avatarUrl":"http://p1.music.126.net/ZnM8_KOrY5RgoPHN1bicfw==/18623527953017203.jpg","gender":0,"birthday":-2209017600000,"city":210200,"signature":"歌荒？不存在的","authority":0,"avatarImgId_str":"18623527953017203"}
     * bindings : [{"expired":false,"refreshTime":1417073076,"expiresIn":2147483647,"url":"","tokenJsonStr":"{\"countrycode\":\"\",\"cellphone\":\"15004112829\",\"hasPassword\":true}","userId":44404168,"id":23222101,"type":1}]
     */

    private long loglongype;
    private AccountBean account;
    private ProfileBean profile;
    private List<BindingsBean> bindings;

    public long getLoglongype() {
        return loglongype;
    }

    public void setLoglongype(long loglongype) {
        this.loglongype = loglongype;
    }

    public AccountBean getAccount() {
        return account;
    }

    public void setAccount(AccountBean account) {
        this.account = account;
    }

    public ProfileBean getProfile() {
        return profile;
    }

    public void setProfile(ProfileBean profile) {
        this.profile = profile;
    }

    public List<BindingsBean> getBindings() {
        return bindings;
    }

    public void setBindings(List<BindingsBean> bindings) {
        this.bindings = bindings;
    }

    public static class AccountBean {
        /**
         * id : 44404168
         * userName : 1_15004112829
         * type : 1
         * status : 0
         * whitelistAuthority : 0
         * createTime : 0
         * salt : [B@58b7e652
         * tokenVersion : 2
         * ban : 0
         * baoyueVersion : 1
         * donateVersion : 0
         * vipType : 11
         * viptypeVersion : 1507705884398
         * anonimousUser : false
         */

        private long id;
        private String userName;
        private long type;
        private long status;
        private long whitelistAuthority;
        private long createTime;
        private String salt;
        private long tokenVersion;
        private long ban;
        private long baoyueVersion;
        private long donateVersion;
        private long vipType;
        private long viptypeVersion;
        private boolean anonimousUser;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public long getType() {
            return type;
        }

        public void setType(long type) {
            this.type = type;
        }

        public long getStatus() {
            return status;
        }

        public void setStatus(long status) {
            this.status = status;
        }

        public long getWhitelistAuthority() {
            return whitelistAuthority;
        }

        public void setWhitelistAuthority(long whitelistAuthority) {
            this.whitelistAuthority = whitelistAuthority;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public long getTokenVersion() {
            return tokenVersion;
        }

        public void setTokenVersion(long tokenVersion) {
            this.tokenVersion = tokenVersion;
        }

        public long getBan() {
            return ban;
        }

        public void setBan(long ban) {
            this.ban = ban;
        }

        public long getBaoyueVersion() {
            return baoyueVersion;
        }

        public void setBaoyueVersion(long baoyueVersion) {
            this.baoyueVersion = baoyueVersion;
        }

        public long getDonateVersion() {
            return donateVersion;
        }

        public void setDonateVersion(long donateVersion) {
            this.donateVersion = donateVersion;
        }

        public long getVipType() {
            return vipType;
        }

        public void setVipType(long vipType) {
            this.vipType = vipType;
        }

        public long getViptypeVersion() {
            return viptypeVersion;
        }

        public void setViptypeVersion(long viptypeVersion) {
            this.viptypeVersion = viptypeVersion;
        }

        public boolean isAnonimousUser() {
            return anonimousUser;
        }

        public void setAnonimousUser(boolean anonimousUser) {
            this.anonimousUser = anonimousUser;
        }
    }

    public static class ProfileBean {
        /**
         * avatarImgIdStr : 18623527953017203
         * backgroundImgIdStr : 3427177766293890
         * avatarImgId : 18623527953017203
         * experts : {}
         * expertTags : null
         * authStatus : 0
         * backgroundImgId : 3427177766293890
         * userType : 0
         * backgroundUrl : http://p1.music.126.net/cIJ5k63TUqPMjaslla0-uQ==/3427177766293890.jpg
         * detailDescription :
         * djStatus : 10
         * followed : false
         * vipType : 11
         * remarkName : null
         * accountStatus : 0
         * nickname : ViVi虚拟机
         * province : 210000
         * mutual : false
         * userId : 44404168
         * description :
         * defaultAvatar : false
         * avatarUrl : http://p1.music.126.net/ZnM8_KOrY5RgoPHN1bicfw==/18623527953017203.jpg
         * gender : 0
         * birthday : -2209017600000
         * city : 210200
         * signature : 歌荒？不存在的
         * authority : 0
         * avatarImgId_str : 18623527953017203
         */

        private String avatarImgIdStr;
        private String backgroundImgIdStr;
        private long avatarImgId;
        private ExpertsBean experts;
        private Object expertTags;
        private long authStatus;
        private long backgroundImgId;
        private long userType;
        private String backgroundUrl;
        private String detailDescription;
        private long djStatus;
        private boolean followed;
        private long vipType;
        private Object remarkName;
        private long accountStatus;
        private String nickname;
        private long province;
        private boolean mutual;
        private long userId;
        private String description;
        private boolean defaultAvatar;
        private String avatarUrl;
        private long gender;
        private long birthday;
        private long city;
        private String signature;
        private long authority;
        private String avatarImgId_str;

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

        public long getAvatarImgId() {
            return avatarImgId;
        }

        public void setAvatarImgId(long avatarImgId) {
            this.avatarImgId = avatarImgId;
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

        public long getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(long authStatus) {
            this.authStatus = authStatus;
        }

        public long getBackgroundImgId() {
            return backgroundImgId;
        }

        public void setBackgroundImgId(long backgroundImgId) {
            this.backgroundImgId = backgroundImgId;
        }

        public long getUserType() {
            return userType;
        }

        public void setUserType(long userType) {
            this.userType = userType;
        }

        public String getBackgroundUrl() {
            return backgroundUrl;
        }

        public void setBackgroundUrl(String backgroundUrl) {
            this.backgroundUrl = backgroundUrl;
        }

        public String getDetailDescription() {
            return detailDescription;
        }

        public void setDetailDescription(String detailDescription) {
            this.detailDescription = detailDescription;
        }

        public long getDjStatus() {
            return djStatus;
        }

        public void setDjStatus(long djStatus) {
            this.djStatus = djStatus;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public long getVipType() {
            return vipType;
        }

        public void setVipType(long vipType) {
            this.vipType = vipType;
        }

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public long getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(long accountStatus) {
            this.accountStatus = accountStatus;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public long getProvince() {
            return province;
        }

        public void setProvince(long province) {
            this.province = province;
        }

        public boolean isMutual() {
            return mutual;
        }

        public void setMutual(boolean mutual) {
            this.mutual = mutual;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
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

        public long getGender() {
            return gender;
        }

        public void setGender(long gender) {
            this.gender = gender;
        }

        public long getBirthday() {
            return birthday;
        }

        public void setBirthday(long birthday) {
            this.birthday = birthday;
        }

        public long getCity() {
            return city;
        }

        public void setCity(long city) {
            this.city = city;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public long getAuthority() {
            return authority;
        }

        public void setAuthority(long authority) {
            this.authority = authority;
        }

        public String getAvatarImgId_str() {
            return avatarImgId_str;
        }

        public void setAvatarImgId_str(String avatarImgId_str) {
            this.avatarImgId_str = avatarImgId_str;
        }

        public static class ExpertsBean {
        }
    }

    public static class BindingsBean {
        /**
         * expired : false
         * refreshTime : 1417073076
         * expiresIn : 2147483647
         * url :
         * tokenJsonStr : {"countrycode":"","cellphone":"15004112829","hasPassword":true}
         * userId : 44404168
         * id : 23222101
         * type : 1
         */

        private boolean expired;
        private long refreshTime;
        private long expiresIn;
        private String url;
        private String tokenJsonStr;
        private long userId;
        private long id;
        private long type;

        public boolean isExpired() {
            return expired;
        }

        public void setExpired(boolean expired) {
            this.expired = expired;
        }

        public long getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(long refreshTime) {
            this.refreshTime = refreshTime;
        }

        public long getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(long expiresIn) {
            this.expiresIn = expiresIn;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTokenJsonStr() {
            return tokenJsonStr;
        }

        public void setTokenJsonStr(String tokenJsonStr) {
            this.tokenJsonStr = tokenJsonStr;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getType() {
            return type;
        }

        public void setType(long type) {
            this.type = type;
        }
    }
}
