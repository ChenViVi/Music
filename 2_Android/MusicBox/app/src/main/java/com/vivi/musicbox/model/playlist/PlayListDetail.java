package com.vivi.musicbox.model.playlist;

import com.vivi.musicbox.model.base.BaseModel;

import java.util.List;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public class PlayListDetail extends BaseModel {
    /**
     * playlist : {"subscribers":[],"subscribed":false,"creator":{"defaultAvatar":true,"province":210000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","accountStatus":0,"gender":0,"city":210200,"birthday":-2209017600000,"userId":1317458286,"userType":0,"nickname":"我任何人都不是","signature":"","description":"","detailDescription":"","avatarImgId":18686200114669624,"backgroundImgId":109951162868128400,"backgroundUrl":"http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"18686200114669622","backgroundImgIdStr":"109951162868128395","avatarImgId_str":"18686200114669622"},"tracks":[{"name":"恋爱循环 - 左右声道音乐娘制作","id":34341540,"pst":0,"t":0,"ar":[{"id":16456,"name":"花澤香菜","tns":[],"alias":[]},{"id":16690,"name":"釘宮理恵","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":465,"crbt":null,"cf":"","al":{"id":3271560,"name":"最新热歌慢摇110","picUrl":"http://p1.music.126.net/qUliwrBDR_QBjNIyipbIRQ==/3296335861579907.jpg","tns":[],"pic":3296335861579907},"dt":254720,"h":null,"m":null,"l":{"br":96000,"fid":0,"size":3057310,"vd":-0.53},"a":null,"cd":"","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"cp":0,"mv":0,"rtype":0,"rurl":null,"mst":9,"publishTime":1388505600004},{"name":"Anywhere","id":514055280,"pst":0,"t":0,"ar":[{"id":74575,"name":"Rita Ora","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":23,"crbt":null,"cf":"","al":{"id":36632041,"name":"Anywhere","picUrl":"http://p1.music.126.net/6m8cyoQrTvqaplZGx4iuxA==/109951163046410809.jpg","tns":[],"pic_str":"109951163046410809","pic":109951163046410820},"dt":214332,"h":{"br":320000,"fid":0,"size":8575521,"vd":-3},"m":{"br":192000,"fid":0,"size":5145330,"vd":-2},"l":{"br":128000,"fid":0,"size":3430235,"vd":-2},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"cp":7001,"mv":5687027,"rtype":0,"rurl":null,"mst":9,"publishTime":1508457600000}],"trackIds":[{"id":34341540,"v":466},{"id":514055280,"v":24}],"ordered":false,"tags":[],"status":0,"subscribedCount":0,"cloudTrackCount":1,"updateTime":1513839634576,"privacy":0,"newImported":false,"specialType":5,"coverImgId":3422779698817209,"createTime":1513839151074,"coverImgUrl":"http://p1.music.126.net/JpBJUNOXqGtVxRUxF5Y0eg==/3422779698817209.jpg","trackUpdateTime":1513843970028,"trackCount":2,"highQuality":false,"commentThreadId":"A_PL_0_2023423393","userId":1317458286,"playCount":0,"adType":0,"description":null,"trackNumberUpdateTime":1513839634576,"name":"我任何人都不是喜欢的音乐","id":2023423393,"shareCount":0,"commentCount":0}
     * privileges : [{"id":34341540,"fee":0,"payed":0,"st":0,"pl":96000,"dl":96000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":96000,"fl":320000,"toast":false,"flag":0},{"id":514055280,"fee":8,"payed":1,"st":0,"pl":999000,"dl":999000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0}]
     */

    private PlaylistBean playlist;
    private List<PrivilegesBean> privileges;

    public PlaylistBean getPlaylist() {
        return playlist;
    }

    public void setPlaylist(PlaylistBean playlist) {
        this.playlist = playlist;
    }

    public List<PrivilegesBean> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<PrivilegesBean> privileges) {
        this.privileges = privileges;
    }

    public static class PlaylistBean {
        /**
         * subscribers : []
         * subscribed : false
         * creator : {"defaultAvatar":true,"province":210000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","accountStatus":0,"gender":0,"city":210200,"birthday":-2209017600000,"userId":1317458286,"userType":0,"nickname":"我任何人都不是","signature":"","description":"","detailDescription":"","avatarImgId":18686200114669624,"backgroundImgId":109951162868128400,"backgroundUrl":"http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"18686200114669622","backgroundImgIdStr":"109951162868128395","avatarImgId_str":"18686200114669622"}
         * tracks : [{"name":"恋爱循环 - 左右声道音乐娘制作","id":34341540,"pst":0,"t":0,"ar":[{"id":16456,"name":"花澤香菜","tns":[],"alias":[]},{"id":16690,"name":"釘宮理恵","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":465,"crbt":null,"cf":"","al":{"id":3271560,"name":"最新热歌慢摇110","picUrl":"http://p1.music.126.net/qUliwrBDR_QBjNIyipbIRQ==/3296335861579907.jpg","tns":[],"pic":3296335861579907},"dt":254720,"h":null,"m":null,"l":{"br":96000,"fid":0,"size":3057310,"vd":-0.53},"a":null,"cd":"","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"cp":0,"mv":0,"rtype":0,"rurl":null,"mst":9,"publishTime":1388505600004},{"name":"Anywhere","id":514055280,"pst":0,"t":0,"ar":[{"id":74575,"name":"Rita Ora","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":23,"crbt":null,"cf":"","al":{"id":36632041,"name":"Anywhere","picUrl":"http://p1.music.126.net/6m8cyoQrTvqaplZGx4iuxA==/109951163046410809.jpg","tns":[],"pic_str":"109951163046410809","pic":109951163046410820},"dt":214332,"h":{"br":320000,"fid":0,"size":8575521,"vd":-3},"m":{"br":192000,"fid":0,"size":5145330,"vd":-2},"l":{"br":128000,"fid":0,"size":3430235,"vd":-2},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"cp":7001,"mv":5687027,"rtype":0,"rurl":null,"mst":9,"publishTime":1508457600000}]
         * trackIds : [{"id":34341540,"v":466},{"id":514055280,"v":24}]
         * ordered : false
         * tags : []
         * status : 0
         * subscribedCount : 0
         * cloudTrackCount : 1
         * updateTime : 1513839634576
         * privacy : 0
         * newImported : false
         * specialType : 5
         * coverImgId : 3422779698817209
         * createTime : 1513839151074
         * coverImgUrl : http://p1.music.126.net/JpBJUNOXqGtVxRUxF5Y0eg==/3422779698817209.jpg
         * trackUpdateTime : 1513843970028
         * trackCount : 2
         * highQuality : false
         * commentThreadId : A_PL_0_2023423393
         * userId : 1317458286
         * playCount : 0
         * adType : 0
         * description : null
         * trackNumberUpdateTime : 1513839634576
         * name : 我任何人都不是喜欢的音乐
         * id : 2023423393
         * shareCount : 0
         * commentCount : 0
         */

        private boolean subscribed;
        private CreatorBean creator;
        private boolean ordered;
        private int status;
        private int subscribedCount;
        private int cloudTrackCount;
        private long updateTime;
        private int privacy;
        private boolean newImported;
        private int specialType;
        private long coverImgId;
        private long createTime;
        private String coverImgUrl;
        private long trackUpdateTime;
        private int trackCount;
        private boolean highQuality;
        private String commentThreadId;
        private int userId;
        private int playCount;
        private int adType;
        private Object description;
        private long trackNumberUpdateTime;
        private String name;
        private int id;
        private int shareCount;
        private int commentCount;
        private List<?> subscribers;
        private List<TracksBean> tracks;
        private List<TrackIdsBean> trackIds;
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

        public boolean isOrdered() {
            return ordered;
        }

        public void setOrdered(boolean ordered) {
            this.ordered = ordered;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
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

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
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

        public int getSpecialType() {
            return specialType;
        }

        public void setSpecialType(int specialType) {
            this.specialType = specialType;
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

        public int getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(int trackCount) {
            this.trackCount = trackCount;
        }

        public boolean isHighQuality() {
            return highQuality;
        }

        public void setHighQuality(boolean highQuality) {
            this.highQuality = highQuality;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public int getAdType() {
            return adType;
        }

        public void setAdType(int adType) {
            this.adType = adType;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public long getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(long trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
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

        public int getShareCount() {
            return shareCount;
        }

        public void setShareCount(int shareCount) {
            this.shareCount = shareCount;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public List<?> getSubscribers() {
            return subscribers;
        }

        public void setSubscribers(List<?> subscribers) {
            this.subscribers = subscribers;
        }

        public List<TracksBean> getTracks() {
            return tracks;
        }

        public void setTracks(List<TracksBean> tracks) {
            this.tracks = tracks;
        }

        public List<TrackIdsBean> getTrackIds() {
            return trackIds;
        }

        public void setTrackIds(List<TrackIdsBean> trackIds) {
            this.trackIds = trackIds;
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

        public static class TracksBean {
            /**
             * name : 恋爱循环 - 左右声道音乐娘制作
             * id : 34341540
             * pst : 0
             * t : 0
             * ar : [{"id":16456,"name":"花澤香菜","tns":[],"alias":[]},{"id":16690,"name":"釘宮理恵","tns":[],"alias":[]}]
             * alia : []
             * pop : 100
             * st : 0
             * rt : null
             * fee : 0
             * v : 465
             * crbt : null
             * cf :
             * al : {"id":3271560,"name":"最新热歌慢摇110","picUrl":"http://p1.music.126.net/qUliwrBDR_QBjNIyipbIRQ==/3296335861579907.jpg","tns":[],"pic":3296335861579907}
             * dt : 254720
             * h : null
             * m : null
             * l : {"br":96000,"fid":0,"size":3057310,"vd":-0.53}
             * a : null
             * cd :
             * no : 1
             * rtUrl : null
             * ftype : 0
             * rtUrls : []
             * djId : 0
             * copyright : 2
             * s_id : 0
             * cp : 0
             * mv : 0
             * rtype : 0
             * rurl : null
             * mst : 9
             * publishTime : 1388505600004
             */

            private String name;
            private int id;
            private int pst;
            private int t;
            private int pop;
            private int st;
            private Object rt;
            private int fee;
            private int v;
            private Object crbt;
            private String cf;
            private AlBean al;
            private int dt;
            private Object h;
            private Object m;
            private LBean l;
            private Object a;
            private String cd;
            private int no;
            private Object rtUrl;
            private int ftype;
            private int djId;
            private int copyright;
            private int s_id;
            private int cp;
            private int mv;
            private int rtype;
            private Object rurl;
            private int mst;
            private long publishTime;
            private List<ArBean> ar;
            private List<?> alia;
            private List<?> rtUrls;

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

            public int getPst() {
                return pst;
            }

            public void setPst(int pst) {
                this.pst = pst;
            }

            public int getT() {
                return t;
            }

            public void setT(int t) {
                this.t = t;
            }

            public int getPop() {
                return pop;
            }

            public void setPop(int pop) {
                this.pop = pop;
            }

            public int getSt() {
                return st;
            }

            public void setSt(int st) {
                this.st = st;
            }

            public Object getRt() {
                return rt;
            }

            public void setRt(Object rt) {
                this.rt = rt;
            }

            public int getFee() {
                return fee;
            }

            public void setFee(int fee) {
                this.fee = fee;
            }

            public int getV() {
                return v;
            }

            public void setV(int v) {
                this.v = v;
            }

            public Object getCrbt() {
                return crbt;
            }

            public void setCrbt(Object crbt) {
                this.crbt = crbt;
            }

            public String getCf() {
                return cf;
            }

            public void setCf(String cf) {
                this.cf = cf;
            }

            public AlBean getAl() {
                return al;
            }

            public void setAl(AlBean al) {
                this.al = al;
            }

            public int getDt() {
                return dt;
            }

            public void setDt(int dt) {
                this.dt = dt;
            }

            public Object getH() {
                return h;
            }

            public void setH(Object h) {
                this.h = h;
            }

            public Object getM() {
                return m;
            }

            public void setM(Object m) {
                this.m = m;
            }

            public LBean getL() {
                return l;
            }

            public void setL(LBean l) {
                this.l = l;
            }

            public Object getA() {
                return a;
            }

            public void setA(Object a) {
                this.a = a;
            }

            public String getCd() {
                return cd;
            }

            public void setCd(String cd) {
                this.cd = cd;
            }

            public int getNo() {
                return no;
            }

            public void setNo(int no) {
                this.no = no;
            }

            public Object getRtUrl() {
                return rtUrl;
            }

            public void setRtUrl(Object rtUrl) {
                this.rtUrl = rtUrl;
            }

            public int getFtype() {
                return ftype;
            }

            public void setFtype(int ftype) {
                this.ftype = ftype;
            }

            public int getDjId() {
                return djId;
            }

            public void setDjId(int djId) {
                this.djId = djId;
            }

            public int getCopyright() {
                return copyright;
            }

            public void setCopyright(int copyright) {
                this.copyright = copyright;
            }

            public int getS_id() {
                return s_id;
            }

            public void setS_id(int s_id) {
                this.s_id = s_id;
            }

            public int getCp() {
                return cp;
            }

            public void setCp(int cp) {
                this.cp = cp;
            }

            public int getMv() {
                return mv;
            }

            public void setMv(int mv) {
                this.mv = mv;
            }

            public int getRtype() {
                return rtype;
            }

            public void setRtype(int rtype) {
                this.rtype = rtype;
            }

            public Object getRurl() {
                return rurl;
            }

            public void setRurl(Object rurl) {
                this.rurl = rurl;
            }

            public int getMst() {
                return mst;
            }

            public void setMst(int mst) {
                this.mst = mst;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public List<ArBean> getAr() {
                return ar;
            }

            public void setAr(List<ArBean> ar) {
                this.ar = ar;
            }

            public List<?> getAlia() {
                return alia;
            }

            public void setAlia(List<?> alia) {
                this.alia = alia;
            }

            public List<?> getRtUrls() {
                return rtUrls;
            }

            public void setRtUrls(List<?> rtUrls) {
                this.rtUrls = rtUrls;
            }

            public static class AlBean {
                /**
                 * id : 3271560
                 * name : 最新热歌慢摇110
                 * picUrl : http://p1.music.126.net/qUliwrBDR_QBjNIyipbIRQ==/3296335861579907.jpg
                 * tns : []
                 * pic : 3296335861579907
                 */

                private int id;
                private String name;
                private String picUrl;
                private long pic;
                private List<?> tns;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public long getPic() {
                    return pic;
                }

                public void setPic(long pic) {
                    this.pic = pic;
                }

                public List<?> getTns() {
                    return tns;
                }

                public void setTns(List<?> tns) {
                    this.tns = tns;
                }
            }

            public static class LBean {
                /**
                 * br : 96000
                 * fid : 0
                 * size : 3057310
                 * vd : -0.53
                 */

                private int br;
                private int fid;
                private int size;
                private double vd;

                public int getBr() {
                    return br;
                }

                public void setBr(int br) {
                    this.br = br;
                }

                public int getFid() {
                    return fid;
                }

                public void setFid(int fid) {
                    this.fid = fid;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public double getVd() {
                    return vd;
                }

                public void setVd(double vd) {
                    this.vd = vd;
                }
            }

            public static class ArBean {
                /**
                 * id : 16456
                 * name : 花澤香菜
                 * tns : []
                 * alias : []
                 */

                private int id;
                private String name;
                private List<?> tns;
                private List<?> alias;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<?> getTns() {
                    return tns;
                }

                public void setTns(List<?> tns) {
                    this.tns = tns;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }
            }
        }

        public static class TrackIdsBean {
            /**
             * id : 34341540
             * v : 466
             */

            private int id;
            private int v;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getV() {
                return v;
            }

            public void setV(int v) {
                this.v = v;
            }
        }
    }

    public static class PrivilegesBean {
        /**
         * id : 34341540
         * fee : 0
         * payed : 0
         * st : 0
         * pl : 96000
         * dl : 96000
         * sp : 7
         * cp : 1
         * subp : 1
         * cs : false
         * maxbr : 96000
         * fl : 320000
         * toast : false
         * flag : 0
         */

        private int id;
        private int fee;
        private int payed;
        private int st;
        private int pl;
        private int dl;
        private int sp;
        private int cp;
        private int subp;
        private boolean cs;
        private int maxbr;
        private int fl;
        private boolean toast;
        private int flag;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getFee() {
            return fee;
        }

        public void setFee(int fee) {
            this.fee = fee;
        }

        public int getPayed() {
            return payed;
        }

        public void setPayed(int payed) {
            this.payed = payed;
        }

        public int getSt() {
            return st;
        }

        public void setSt(int st) {
            this.st = st;
        }

        public int getPl() {
            return pl;
        }

        public void setPl(int pl) {
            this.pl = pl;
        }

        public int getDl() {
            return dl;
        }

        public void setDl(int dl) {
            this.dl = dl;
        }

        public int getSp() {
            return sp;
        }

        public void setSp(int sp) {
            this.sp = sp;
        }

        public int getCp() {
            return cp;
        }

        public void setCp(int cp) {
            this.cp = cp;
        }

        public int getSubp() {
            return subp;
        }

        public void setSubp(int subp) {
            this.subp = subp;
        }

        public boolean isCs() {
            return cs;
        }

        public void setCs(boolean cs) {
            this.cs = cs;
        }

        public int getMaxbr() {
            return maxbr;
        }

        public void setMaxbr(int maxbr) {
            this.maxbr = maxbr;
        }

        public int getFl() {
            return fl;
        }

        public void setFl(int fl) {
            this.fl = fl;
        }

        public boolean isToast() {
            return toast;
        }

        public void setToast(boolean toast) {
            this.toast = toast;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }
    }
}
