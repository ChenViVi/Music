package com.vivi.musicbox.model.user;

import com.vivi.musicbox.model.base.BaseModel;

import java.util.List;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public class UserPlayList extends BaseModel {
    /**
     * more : false
     * playlist : [{"subscribers":[],"subscribed":false,"creator":{"defaultAvatar":true,"province":210000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","accountStatus":0,"gender":0,"city":210200,"birthday":-2209017600000,"userId":1317458286,"userType":0,"nickname":"我任何人都不是","signature":"","description":"","detailDescription":"","avatarImgId":18686200114669624,"backgroundImgId":109951162868128400,"backgroundUrl":"http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"18686200114669622","backgroundImgIdStr":"109951162868128395","avatarImgId_str":"18686200114669622"},"artists":null,"tracks":null,"ordered":false,"tags":[],"adType":0,"trackNumberUpdateTime":1513839634576,"subscribedCount":0,"cloudTrackCount":1,"description":null,"status":0,"userId":1317458286,"privacy":0,"newImported":false,"trackCount":2,"playCount":0,"coverImgUrl":"http://p1.music.126.net/JpBJUNOXqGtVxRUxF5Y0eg==/3422779698817209.jpg","trackUpdateTime":1513839634576,"coverImgId":3422779698817209,"createTime":1513839151074,"updateTime":1513839634576,"specialType":5,"anonimous":false,"commentThreadId":"A_PL_0_2023423393","totalDuration":0,"highQuality":false,"name":"我任何人都不是喜欢的音乐","id":2023423393},{"subscribers":[],"subscribed":false,"creator":{"defaultAvatar":true,"province":210000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","accountStatus":0,"gender":0,"city":210200,"birthday":-2209017600000,"userId":1317458286,"userType":0,"nickname":"我任何人都不是","signature":"","description":"","detailDescription":"","avatarImgId":18686200114669624,"backgroundImgId":109951162868128400,"backgroundUrl":"http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"18686200114669622","backgroundImgIdStr":"109951162868128395","avatarImgId_str":"18686200114669622"},"artists":null,"tracks":null,"ordered":false,"tags":[],"adType":0,"trackNumberUpdateTime":1513839587071,"subscribedCount":0,"cloudTrackCount":0,"description":null,"status":0,"userId":1317458286,"privacy":0,"newImported":false,"trackCount":1,"playCount":0,"coverImgUrl":"http://p1.music.126.net/EOJK7dx4E9CkYxgrdSuuLw==/17756013277390221.jpg","trackUpdateTime":1513839587135,"coverImgId":17756013277390220,"createTime":1513839543318,"updateTime":1513839587071,"specialType":0,"anonimous":false,"commentThreadId":"A_PL_0_2023422484","totalDuration":0,"highQuality":false,"name":"歌单","id":2023422484,"coverImgId_str":"17756013277390221"}]
     */

    private boolean more;
    private List<PlaylistBean> playlist;

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public List<PlaylistBean> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<PlaylistBean> playlist) {
        this.playlist = playlist;
    }

    public static class PlaylistBean {
        /**
         * subscribers : []
         * subscribed : false
         * creator : {"defaultAvatar":true,"province":210000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","accountStatus":0,"gender":0,"city":210200,"birthday":-2209017600000,"userId":1317458286,"userType":0,"nickname":"我任何人都不是","signature":"","description":"","detailDescription":"","avatarImgId":18686200114669624,"backgroundImgId":109951162868128400,"backgroundUrl":"http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"18686200114669622","backgroundImgIdStr":"109951162868128395","avatarImgId_str":"18686200114669622"}
         * artists : null
         * tracks : null
         * ordered : false
         * tags : []
         * adType : 0
         * trackNumberUpdateTime : 1513839634576
         * subscribedCount : 0
         * cloudTrackCount : 1
         * description : null
         * status : 0
         * userId : 1317458286
         * privacy : 0
         * newImported : false
         * trackCount : 2
         * playCount : 0
         * coverImgUrl : http://p1.music.126.net/JpBJUNOXqGtVxRUxF5Y0eg==/3422779698817209.jpg
         * trackUpdateTime : 1513839634576
         * coverImgId : 3422779698817209
         * createTime : 1513839151074
         * updateTime : 1513839634576
         * specialType : 5
         * anonimous : false
         * commentThreadId : A_PL_0_2023423393
         * totalDuration : 0
         * highQuality : false
         * name : 我任何人都不是喜欢的音乐
         * id : 2023423393
         * coverImgId_str : 17756013277390221
         */

        private boolean subscribed;
        private CreatorBean creator;
        private Object artists;
        private Object tracks;
        private boolean ordered;
        private int adType;
        private long trackNumberUpdateTime;
        private int subscribedCount;
        private int cloudTrackCount;
        private Object description;
        private int status;
        private int userId;
        private int privacy;
        private boolean newImported;
        private int trackCount;
        private int playCount;
        private String coverImgUrl;
        private long trackUpdateTime;
        private long coverImgId;
        private long createTime;
        private long updateTime;
        private int specialType;
        private boolean anonimous;
        private String commentThreadId;
        private int totalDuration;
        private boolean highQuality;
        private String name;
        private int id;
        private String coverImgId_str;
        private List<?> subscribers;
        private List<?> tags;

        public boolean isSubscribed() {
            return subscribed;
        }

        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }

        public CreatorBean getCreator() {
            return creator;
        }

        public void setCreator(CreatorBean creator) {
            this.creator = creator;
        }

        public Object getArtists() {
            return artists;
        }

        public void setArtists(Object artists) {
            this.artists = artists;
        }

        public Object getTracks() {
            return tracks;
        }

        public void setTracks(Object tracks) {
            this.tracks = tracks;
        }

        public boolean isOrdered() {
            return ordered;
        }

        public void setOrdered(boolean ordered) {
            this.ordered = ordered;
        }

        public int getAdType() {
            return adType;
        }

        public void setAdType(int adType) {
            this.adType = adType;
        }

        public long getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(long trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
        }

        public int getSubscribedCount() {
            return subscribedCount;
        }

        public void setSubscribedCount(int subscribedCount) {
            this.subscribedCount = subscribedCount;
        }

        public int getCloudTrackCount() {
            return cloudTrackCount;
        }

        public void setCloudTrackCount(int cloudTrackCount) {
            this.cloudTrackCount = cloudTrackCount;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getPrivacy() {
            return privacy;
        }

        public void setPrivacy(int privacy) {
            this.privacy = privacy;
        }

        public boolean isNewImported() {
            return newImported;
        }

        public void setNewImported(boolean newImported) {
            this.newImported = newImported;
        }

        public int getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(int trackCount) {
            this.trackCount = trackCount;
        }

        public int getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public String getCoverImgUrl() {
            return coverImgUrl;
        }

        public void setCoverImgUrl(String coverImgUrl) {
            this.coverImgUrl = coverImgUrl;
        }

        public long getTrackUpdateTime() {
            return trackUpdateTime;
        }

        public void setTrackUpdateTime(long trackUpdateTime) {
            this.trackUpdateTime = trackUpdateTime;
        }

        public long getCoverImgId() {
            return coverImgId;
        }

        public void setCoverImgId(long coverImgId) {
            this.coverImgId = coverImgId;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public int getSpecialType() {
            return specialType;
        }

        public void setSpecialType(int specialType) {
            this.specialType = specialType;
        }

        public boolean isAnonimous() {
            return anonimous;
        }

        public void setAnonimous(boolean anonimous) {
            this.anonimous = anonimous;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public int getTotalDuration() {
            return totalDuration;
        }

        public void setTotalDuration(int totalDuration) {
            this.totalDuration = totalDuration;
        }

        public boolean isHighQuality() {
            return highQuality;
        }

        public void setHighQuality(boolean highQuality) {
            this.highQuality = highQuality;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCoverImgId_str() {
            return coverImgId_str;
        }

        public void setCoverImgId_str(String coverImgId_str) {
            this.coverImgId_str = coverImgId_str;
        }

        public List<?> getSubscribers() {
            return subscribers;
        }

        public void setSubscribers(List<?> subscribers) {
            this.subscribers = subscribers;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }

        public static class CreatorBean {
            /**
             * defaultAvatar : true
             * province : 210000
             * authStatus : 0
             * followed : false
             * avatarUrl : http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg
             * accountStatus : 0
             * gender : 0
             * city : 210200
             * birthday : -2209017600000
             * userId : 1317458286
             * userType : 0
             * nickname : 我任何人都不是
             * signature :
             * description :
             * detailDescription :
             * avatarImgId : 18686200114669624
             * backgroundImgId : 109951162868128400
             * backgroundUrl : http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg
             * authority : 0
             * mutual : false
             * expertTags : null
             * experts : null
             * djStatus : 0
             * vipType : 0
             * remarkName : null
             * avatarImgIdStr : 18686200114669622
             * backgroundImgIdStr : 109951162868128395
             * avatarImgId_str : 18686200114669622
             */

            private boolean defaultAvatar;
            private int province;
            private int authStatus;
            private boolean followed;
            private String avatarUrl;
            private int accountStatus;
            private int gender;
            private int city;
            private long birthday;
            private int userId;
            private int userType;
            private String nickname;
            private String signature;
            private String description;
            private String detailDescription;
            private long avatarImgId;
            private long backgroundImgId;
            private String backgroundUrl;
            private int authority;
            private boolean mutual;
            private Object expertTags;
            private Object experts;
            private int djStatus;
            private int vipType;
            private Object remarkName;
            private String avatarImgIdStr;
            private String backgroundImgIdStr;
            private String avatarImgId_str;

            public boolean isDefaultAvatar() {
                return defaultAvatar;
            }

            public void setDefaultAvatar(boolean defaultAvatar) {
                this.defaultAvatar = defaultAvatar;
            }

            public int getProvince() {
                return province;
            }

            public void setProvince(int province) {
                this.province = province;
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

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public int getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(int accountStatus) {
                this.accountStatus = accountStatus;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public int getCity() {
                return city;
            }

            public void setCity(int city) {
                this.city = city;
            }

            public long getBirthday() {
                return birthday;
            }

            public void setBirthday(long birthday) {
                this.birthday = birthday;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getUserType() {
                return userType;
            }

            public void setUserType(int userType) {
                this.userType = userType;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDetailDescription() {
                return detailDescription;
            }

            public void setDetailDescription(String detailDescription) {
                this.detailDescription = detailDescription;
            }

            public long getAvatarImgId() {
                return avatarImgId;
            }

            public void setAvatarImgId(long avatarImgId) {
                this.avatarImgId = avatarImgId;
            }

            public long getBackgroundImgId() {
                return backgroundImgId;
            }

            public void setBackgroundImgId(long backgroundImgId) {
                this.backgroundImgId = backgroundImgId;
            }

            public String getBackgroundUrl() {
                return backgroundUrl;
            }

            public void setBackgroundUrl(String backgroundUrl) {
                this.backgroundUrl = backgroundUrl;
            }

            public int getAuthority() {
                return authority;
            }

            public void setAuthority(int authority) {
                this.authority = authority;
            }

            public boolean isMutual() {
                return mutual;
            }

            public void setMutual(boolean mutual) {
                this.mutual = mutual;
            }

            public Object getExpertTags() {
                return expertTags;
            }

            public void setExpertTags(Object expertTags) {
                this.expertTags = expertTags;
            }

            public Object getExperts() {
                return experts;
            }

            public void setExperts(Object experts) {
                this.experts = experts;
            }

            public int getDjStatus() {
                return djStatus;
            }

            public void setDjStatus(int djStatus) {
                this.djStatus = djStatus;
            }

            public int getVipType() {
                return vipType;
            }

            public void setVipType(int vipType) {
                this.vipType = vipType;
            }

            public Object getRemarkName() {
                return remarkName;
            }

            public void setRemarkName(Object remarkName) {
                this.remarkName = remarkName;
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

            public String getAvatarImgId_str() {
                return avatarImgId_str;
            }

            public void setAvatarImgId_str(String avatarImgId_str) {
                this.avatarImgId_str = avatarImgId_str;
            }
        }
    }
}
