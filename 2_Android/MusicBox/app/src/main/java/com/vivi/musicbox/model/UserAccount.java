package com.vivi.musicbox.model;

import com.vivi.musicbox.model.base.BaseModel;

import java.util.List;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public class UserAccount extends BaseModel {

    /**
     * loginType : 1
     * account : {"id":1317458286,"userName":"1_15926099436","type":1,"status":0,"whitelistAuthority":0,"createTime":1513839036003,"salt":"[B@284f9da3","tokenVersion":0,"ban":0,"baoyueVersion":0,"donateVersion":0,"vipType":0,"viptypeVersion":0,"anonimousUser":false}
     * profile : {"backgroundUrl":"http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg","defaultAvatar":true,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","gender":0,"birthday":-2209017600000,"city":210200,"userId":1317458286,"vipType":0,"accountStatus":0,"avatarImgId":18686200114669624,"experts":{},"nickname":"我任何人都不是","remarkName":null,"mutual":false,"province":210000,"expertTags":null,"authStatus":0,"backgroundImgId":109951162868128400,"userType":0,"description":"","avatarImgIdStr":"18686200114669622","backgroundImgIdStr":"109951162868128395","detailDescription":"","djStatus":0,"followed":false,"signature":"","authority":0,"avatarImgId_str":"18686200114669622"}
     * bindings : [{"userId":1317458286,"url":"","tokenJsonStr":"{\"countrycode\":\"\",\"cellphone\":\"15926099436\",\"hasPassword\":true}","expired":false,"expiresIn":2147483647,"refreshTime":1513839036,"id":6508347690,"type":1}]
     */

    private int loginType;
    private AccountBean account;
    private ProfileBean profile;
    private List<BindingsBean> bindings;

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
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
         * id : 1317458286
         * userName : 1_15926099436
         * type : 1
         * status : 0
         * whitelistAuthority : 0
         * createTime : 1513839036003
         * salt : [B@284f9da3
         * tokenVersion : 0
         * ban : 0
         * baoyueVersion : 0
         * donateVersion : 0
         * vipType : 0
         * viptypeVersion : 0
         * anonimousUser : false
         */

        private int id;
        private String userName;
        private int type;
        private int status;
        private int whitelistAuthority;
        private long createTime;
        private String salt;
        private int tokenVersion;
        private int ban;
        private int baoyueVersion;
        private int donateVersion;
        private int vipType;
        private int viptypeVersion;
        private boolean anonimousUser;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getWhitelistAuthority() {
            return whitelistAuthority;
        }

        public void setWhitelistAuthority(int whitelistAuthority) {
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

        public int getTokenVersion() {
            return tokenVersion;
        }

        public void setTokenVersion(int tokenVersion) {
            this.tokenVersion = tokenVersion;
        }

        public int getBan() {
            return ban;
        }

        public void setBan(int ban) {
            this.ban = ban;
        }

        public int getBaoyueVersion() {
            return baoyueVersion;
        }

        public void setBaoyueVersion(int baoyueVersion) {
            this.baoyueVersion = baoyueVersion;
        }

        public int getDonateVersion() {
            return donateVersion;
        }

        public void setDonateVersion(int donateVersion) {
            this.donateVersion = donateVersion;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getViptypeVersion() {
            return viptypeVersion;
        }

        public void setViptypeVersion(int viptypeVersion) {
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
         * backgroundUrl : http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg
         * defaultAvatar : true
         * avatarUrl : http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg
         * gender : 0
         * birthday : -2209017600000
         * city : 210200
         * userId : 1317458286
         * vipType : 0
         * accountStatus : 0
         * avatarImgId : 18686200114669624
         * experts : {}
         * nickname : 我任何人都不是
         * remarkName : null
         * mutual : false
         * province : 210000
         * expertTags : null
         * authStatus : 0
         * backgroundImgId : 109951162868128400
         * userType : 0
         * description :
         * avatarImgIdStr : 18686200114669622
         * backgroundImgIdStr : 109951162868128395
         * detailDescription :
         * djStatus : 0
         * followed : false
         * signature :
         * authority : 0
         * avatarImgId_str : 18686200114669622
         */

        private String backgroundUrl;
        private boolean defaultAvatar;
        private String avatarUrl;
        private int gender;
        private long birthday;
        private int city;
        private int userId;
        private int vipType;
        private int accountStatus;
        private long avatarImgId;
        private ExpertsBean experts;
        private String nickname;
        private Object remarkName;
        private boolean mutual;
        private int province;
        private Object expertTags;
        private int authStatus;
        private long backgroundImgId;
        private int userType;
        private String description;
        private String avatarImgIdStr;
        private String backgroundImgIdStr;
        private String detailDescription;
        private int djStatus;
        private boolean followed;
        private String signature;
        private int authority;
        private String avatarImgId_str;

        public String getBackgroundUrl() {
            return backgroundUrl;
        }

        public void setBackgroundUrl(String backgroundUrl) {
            this.backgroundUrl = backgroundUrl;
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

        public ExpertsBean getExperts() {
            return experts;
        }

        public void setExperts(ExpertsBean experts) {
            this.experts = experts;
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

        public boolean isMutual() {
            return mutual;
        }

        public void setMutual(boolean mutual) {
            this.mutual = mutual;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

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

        public static class ExpertsBean {
        }
    }

    public static class BindingsBean {
        /**
         * userId : 1317458286
         * url :
         * tokenJsonStr : {"countrycode":"","cellphone":"15926099436","hasPassword":true}
         * expired : false
         * expiresIn : 2147483647
         * refreshTime : 1513839036
         * id : 6508347690
         * type : 1
         */

        private int userId;
        private String url;
        private String tokenJsonStr;
        private boolean expired;
        private int expiresIn;
        private int refreshTime;
        private long id;
        private int type;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
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

        public boolean isExpired() {
            return expired;
        }

        public void setExpired(boolean expired) {
            this.expired = expired;
        }

        public int getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
        }

        public int getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(int refreshTime) {
            this.refreshTime = refreshTime;
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
