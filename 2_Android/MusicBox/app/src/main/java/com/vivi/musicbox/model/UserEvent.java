package com.vivi.musicbox.model;

import com.vivi.musicbox.model.base.BaseModel;

import java.util.List;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public class UserEvent extends BaseModel {
    /**
     * lasttime : 1513840986866
     * more : false
     * size : 1
     * events : [{"actName":null,"forwardCount":0,"eventTime":1513840986866,"json":"{\"msg\":\"好听\",\"song\":{\"name\":\"Midnight City\",\"id\":29228524,\"position\":9,\"alias\":[],\"status\":0,\"fee\":0,\"copyrightId\":0,\"disc\":\"1\",\"no\":9,\"artists\":[{\"name\":\"Philippe Rombi\",\"id\":41252,\"picId\":0,\"img1v1Id\":0,\"briefDesc\":\"\",\"picUrl\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"img1v1Url\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"albumSize\":0,\"alias\":[],\"trans\":\"\",\"musicSize\":0}],\"album\":{\"name\":\"Jeune et jolie\",\"id\":2997937,\"type\":\"专辑\",\"size\":13,\"picId\":3227066627691471,\"blurPicUrl\":\"http://p1.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg\",\"companyId\":0,\"pic\":3227066627691471,\"picUrl\":\"http://p1.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg\",\"publishTime\":1376841600000,\"description\":\"\",\"tags\":\"\",\"company\":\"Cristal Records\",\"briefDesc\":\"\",\"artist\":{\"name\":\"\",\"id\":0,\"picId\":0,\"img1v1Id\":0,\"briefDesc\":\"\",\"picUrl\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"img1v1Url\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"albumSize\":0,\"alias\":[],\"trans\":\"\",\"musicSize\":0},\"songs\":[],\"alias\":[\"花容月貌\"],\"status\":0,\"copyrightId\":0,\"commentThreadId\":\"R_AL_3_2997937\",\"artists\":[{\"name\":\"Philippe Rombi\",\"id\":41252,\"picId\":0,\"img1v1Id\":0,\"briefDesc\":\"\",\"picUrl\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"img1v1Url\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"albumSize\":0,\"alias\":[],\"trans\":\"\",\"musicSize\":0}],\"img80x80\":\"http://p1.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg?param=80x80x1\"},\"starred\":false,\"popularity\":50.0,\"score\":50,\"starredNum\":0,\"duration\":244009,\"playedNum\":0,\"dayPlays\":0,\"hearTime\":0,\"ringtone\":null,\"crbt\":null,\"audition\":null,\"copyFrom\":\"\",\"commentThreadId\":\"R_SO_4_29228524\",\"rtUrl\":null,\"ftype\":0,\"rtUrls\":[],\"copyright\":2,\"hMusic\":{\"name\":\"Midnight City\",\"id\":52263087,\"size\":9763553,\"extension\":\"mp3\",\"sr\":44100,\"dfsId\":0,\"bitrate\":320000,\"playTime\":244009,\"volumeDelta\":-0.25},\"mMusic\":{\"name\":\"Midnight City\",\"id\":52263088,\"size\":4882313,\"extension\":\"mp3\",\"sr\":44100,\"dfsId\":0,\"bitrate\":160000,\"playTime\":244009,\"volumeDelta\":0.16},\"lMusic\":{\"name\":\"Midnight City\",\"id\":52263089,\"size\":2929817,\"extension\":\"mp3\",\"sr\":44100,\"dfsId\":0,\"bitrate\":96000,\"playTime\":244009,\"volumeDelta\":0.07},\"bMusic\":{\"name\":\"Midnight City\",\"id\":52263089,\"size\":2929817,\"extension\":\"mp3\",\"sr\":44100,\"dfsId\":0,\"bitrate\":96000,\"playTime\":244009,\"volumeDelta\":0.07},\"rtype\":0,\"rurl\":null,\"mvid\":5342095,\"mp3Url\":null}}","pics":[],"rcmdInfo":null,"actId":0,"user":{"defaultAvatar":true,"province":210000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","accountStatus":0,"gender":0,"city":210200,"birthday":-2209017600000,"userId":1317458286,"userType":0,"nickname":"我任何人都不是","signature":"","description":"","detailDescription":"","avatarImgId":18686200114669624,"backgroundImgId":109951162868128400,"backgroundUrl":"http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"backgroundImgIdStr":"109951162868128395","avatarImgIdStr":"18686200114669622","urlAnalyze":false,"avatarImgId_str":"18686200114669622"},"expireTime":0,"uuid":null,"showTime":1513840986866,"tmplId":0,"id":2439921639,"type":18,"topEvent":false,"info":{"commentThread":{"id":"A_EV_2_2439921639_1317458286","resourceInfo":null,"resourceType":2,"commentCount":0,"likedCount":0,"shareCount":0,"hotCount":0,"latestLikedUsers":null,"resourceId":0,"resourceOwnerId":0,"resourceTitle":null},"latestLikedUsers":null,"liked":false,"comments":null,"resourceType":2,"resourceId":2439921639,"commentCount":0,"likedCount":0,"shareCount":0,"threadId":"A_EV_2_2439921639_1317458286"}}]
     */

    private long lasttime;
    private boolean more;
    private int size;
    private List<EventsBean> events;

    public long getLasttime() {
        return lasttime;
    }

    public void setLasttime(long lasttime) {
        this.lasttime = lasttime;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<EventsBean> getEvents() {
        return events;
    }

    public void setEvents(List<EventsBean> events) {
        this.events = events;
    }

    public static class EventsBean {
        /**
         * actName : null
         * forwardCount : 0
         * eventTime : 1513840986866
         * json : {"msg":"好听","song":{"name":"Midnight City","id":29228524,"position":9,"alias":[],"status":0,"fee":0,"copyrightId":0,"disc":"1","no":9,"artists":[{"name":"Philippe Rombi","id":41252,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0}],"album":{"name":"Jeune et jolie","id":2997937,"type":"专辑","size":13,"picId":3227066627691471,"blurPicUrl":"http://p1.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg","companyId":0,"pic":3227066627691471,"picUrl":"http://p1.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg","publishTime":1376841600000,"description":"","tags":"","company":"Cristal Records","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0},"songs":[],"alias":["花容月貌"],"status":0,"copyrightId":0,"commentThreadId":"R_AL_3_2997937","artists":[{"name":"Philippe Rombi","id":41252,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0}],"img80x80":"http://p1.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg?param=80x80x1"},"starred":false,"popularity":50.0,"score":50,"starredNum":0,"duration":244009,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":null,"crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_29228524","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":2,"hMusic":{"name":"Midnight City","id":52263087,"size":9763553,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":244009,"volumeDelta":-0.25},"mMusic":{"name":"Midnight City","id":52263088,"size":4882313,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":160000,"playTime":244009,"volumeDelta":0.16},"lMusic":{"name":"Midnight City","id":52263089,"size":2929817,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":96000,"playTime":244009,"volumeDelta":0.07},"bMusic":{"name":"Midnight City","id":52263089,"size":2929817,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":96000,"playTime":244009,"volumeDelta":0.07},"rtype":0,"rurl":null,"mvid":5342095,"mp3Url":null}}
         * pics : []
         * rcmdInfo : null
         * actId : 0
         * user : {"defaultAvatar":true,"province":210000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","accountStatus":0,"gender":0,"city":210200,"birthday":-2209017600000,"userId":1317458286,"userType":0,"nickname":"我任何人都不是","signature":"","description":"","detailDescription":"","avatarImgId":18686200114669624,"backgroundImgId":109951162868128400,"backgroundUrl":"http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"backgroundImgIdStr":"109951162868128395","avatarImgIdStr":"18686200114669622","urlAnalyze":false,"avatarImgId_str":"18686200114669622"}
         * expireTime : 0
         * uuid : null
         * showTime : 1513840986866
         * tmplId : 0
         * id : 2439921639
         * type : 18
         * topEvent : false
         * info : {"commentThread":{"id":"A_EV_2_2439921639_1317458286","resourceInfo":null,"resourceType":2,"commentCount":0,"likedCount":0,"shareCount":0,"hotCount":0,"latestLikedUsers":null,"resourceId":0,"resourceOwnerId":0,"resourceTitle":null},"latestLikedUsers":null,"liked":false,"comments":null,"resourceType":2,"resourceId":2439921639,"commentCount":0,"likedCount":0,"shareCount":0,"threadId":"A_EV_2_2439921639_1317458286"}
         */

        private Object actName;
        private int forwardCount;
        private long eventTime;
        private String json;
        private Object rcmdInfo;
        private int actId;
        private UserBean user;
        private int expireTime;
        private Object uuid;
        private long showTime;
        private int tmplId;
        private long id;
        private int type;
        private boolean topEvent;
        private InfoBean info;
        private List<?> pics;

        public Object getActName() {
            return actName;
        }

        public void setActName(Object actName) {
            this.actName = actName;
        }

        public int getForwardCount() {
            return forwardCount;
        }

        public void setForwardCount(int forwardCount) {
            this.forwardCount = forwardCount;
        }

        public long getEventTime() {
            return eventTime;
        }

        public void setEventTime(long eventTime) {
            this.eventTime = eventTime;
        }

        public String getJson() {
            return json;
        }

        public void setJson(String json) {
            this.json = json;
        }

        public Object getRcmdInfo() {
            return rcmdInfo;
        }

        public void setRcmdInfo(Object rcmdInfo) {
            this.rcmdInfo = rcmdInfo;
        }

        public int getActId() {
            return actId;
        }

        public void setActId(int actId) {
            this.actId = actId;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public int getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(int expireTime) {
            this.expireTime = expireTime;
        }

        public Object getUuid() {
            return uuid;
        }

        public void setUuid(Object uuid) {
            this.uuid = uuid;
        }

        public long getShowTime() {
            return showTime;
        }

        public void setShowTime(long showTime) {
            this.showTime = showTime;
        }

        public int getTmplId() {
            return tmplId;
        }

        public void setTmplId(int tmplId) {
            this.tmplId = tmplId;
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

        public boolean isTopEvent() {
            return topEvent;
        }

        public void setTopEvent(boolean topEvent) {
            this.topEvent = topEvent;
        }

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public List<?> getPics() {
            return pics;
        }

        public void setPics(List<?> pics) {
            this.pics = pics;
        }

        public static class UserBean {
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
             * backgroundImgIdStr : 109951162868128395
             * avatarImgIdStr : 18686200114669622
             * urlAnalyze : false
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
            private String backgroundImgIdStr;
            private String avatarImgIdStr;
            private boolean urlAnalyze;
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

            public String getBackgroundImgIdStr() {
                return backgroundImgIdStr;
            }

            public void setBackgroundImgIdStr(String backgroundImgIdStr) {
                this.backgroundImgIdStr = backgroundImgIdStr;
            }

            public String getAvatarImgIdStr() {
                return avatarImgIdStr;
            }

            public void setAvatarImgIdStr(String avatarImgIdStr) {
                this.avatarImgIdStr = avatarImgIdStr;
            }

            public boolean isUrlAnalyze() {
                return urlAnalyze;
            }

            public void setUrlAnalyze(boolean urlAnalyze) {
                this.urlAnalyze = urlAnalyze;
            }

            public String getAvatarImgId_str() {
                return avatarImgId_str;
            }

            public void setAvatarImgId_str(String avatarImgId_str) {
                this.avatarImgId_str = avatarImgId_str;
            }
        }

        public static class InfoBean {
            /**
             * commentThread : {"id":"A_EV_2_2439921639_1317458286","resourceInfo":null,"resourceType":2,"commentCount":0,"likedCount":0,"shareCount":0,"hotCount":0,"latestLikedUsers":null,"resourceId":0,"resourceOwnerId":0,"resourceTitle":null}
             * latestLikedUsers : null
             * liked : false
             * comments : null
             * resourceType : 2
             * resourceId : 2439921639
             * commentCount : 0
             * likedCount : 0
             * shareCount : 0
             * threadId : A_EV_2_2439921639_1317458286
             */

            private CommentThreadBean commentThread;
            private Object latestLikedUsers;
            private boolean liked;
            private Object comments;
            private int resourceType;
            private long resourceId;
            private int commentCount;
            private int likedCount;
            private int shareCount;
            private String threadId;

            public CommentThreadBean getCommentThread() {
                return commentThread;
            }

            public void setCommentThread(CommentThreadBean commentThread) {
                this.commentThread = commentThread;
            }

            public Object getLatestLikedUsers() {
                return latestLikedUsers;
            }

            public void setLatestLikedUsers(Object latestLikedUsers) {
                this.latestLikedUsers = latestLikedUsers;
            }

            public boolean isLiked() {
                return liked;
            }

            public void setLiked(boolean liked) {
                this.liked = liked;
            }

            public Object getComments() {
                return comments;
            }

            public void setComments(Object comments) {
                this.comments = comments;
            }

            public int getResourceType() {
                return resourceType;
            }

            public void setResourceType(int resourceType) {
                this.resourceType = resourceType;
            }

            public long getResourceId() {
                return resourceId;
            }

            public void setResourceId(long resourceId) {
                this.resourceId = resourceId;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public int getLikedCount() {
                return likedCount;
            }

            public void setLikedCount(int likedCount) {
                this.likedCount = likedCount;
            }

            public int getShareCount() {
                return shareCount;
            }

            public void setShareCount(int shareCount) {
                this.shareCount = shareCount;
            }

            public String getThreadId() {
                return threadId;
            }

            public void setThreadId(String threadId) {
                this.threadId = threadId;
            }

            public static class CommentThreadBean {
                /**
                 * id : A_EV_2_2439921639_1317458286
                 * resourceInfo : null
                 * resourceType : 2
                 * commentCount : 0
                 * likedCount : 0
                 * shareCount : 0
                 * hotCount : 0
                 * latestLikedUsers : null
                 * resourceId : 0
                 * resourceOwnerId : 0
                 * resourceTitle : null
                 */

                private String id;
                private Object resourceInfo;
                private int resourceType;
                private int commentCount;
                private int likedCount;
                private int shareCount;
                private int hotCount;
                private Object latestLikedUsers;
                private int resourceId;
                private int resourceOwnerId;
                private Object resourceTitle;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public Object getResourceInfo() {
                    return resourceInfo;
                }

                public void setResourceInfo(Object resourceInfo) {
                    this.resourceInfo = resourceInfo;
                }

                public int getResourceType() {
                    return resourceType;
                }

                public void setResourceType(int resourceType) {
                    this.resourceType = resourceType;
                }

                public int getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(int commentCount) {
                    this.commentCount = commentCount;
                }

                public int getLikedCount() {
                    return likedCount;
                }

                public void setLikedCount(int likedCount) {
                    this.likedCount = likedCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getHotCount() {
                    return hotCount;
                }

                public void setHotCount(int hotCount) {
                    this.hotCount = hotCount;
                }

                public Object getLatestLikedUsers() {
                    return latestLikedUsers;
                }

                public void setLatestLikedUsers(Object latestLikedUsers) {
                    this.latestLikedUsers = latestLikedUsers;
                }

                public int getResourceId() {
                    return resourceId;
                }

                public void setResourceId(int resourceId) {
                    this.resourceId = resourceId;
                }

                public int getResourceOwnerId() {
                    return resourceOwnerId;
                }

                public void setResourceOwnerId(int resourceOwnerId) {
                    this.resourceOwnerId = resourceOwnerId;
                }

                public Object getResourceTitle() {
                    return resourceTitle;
                }

                public void setResourceTitle(Object resourceTitle) {
                    this.resourceTitle = resourceTitle;
                }
            }
        }
    }
}
