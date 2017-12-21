package com.vivi.musicbox.model.user;

import com.vivi.musicbox.model.base.BaseModel;

import java.util.List;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public class UserRecord extends BaseModel {
    private List<AllDataBean> allData;

    public List<AllDataBean> getAllData() {
        return allData;
    }

    public void setAllData(List<AllDataBean> allData) {
        this.allData = allData;
    }

    public static class AllDataBean {
        /**
         * playCount : 0
         * score : 100
         * song : {"rtUrls":[],"ar":[{"id":17479,"name":"小野リサ"}],"al":{"id":60582,"name":"Romance Latino, Vol. 3","picUrl":"http://p3.music.126.net/pJA8Qpv5PyIrCDQjOXr1_g==/918092209193123.jpg","pic_str":"918092209193123","pic":918092209193123},"st":1,"cd":"1","no":2,"pst":0,"alia":[],"pop":95,"rt":"","mst":9,"cp":5003,"crbt":null,"mv":0,"cf":"","dt":201091,"h":{"br":320000,"fid":5681176580724254,"size":8073841,"vd":-2.65076E-4},"l":{"br":96000,"fid":5711962906302340,"size":2446962,"vd":-2.65076E-4},"rtUrl":null,"ftype":0,"rtype":0,"rurl":null,"t":0,"djId":0,"fee":0,"v":6,"a":null,"m":{"br":160000,"fid":5506354231927824,"size":4054642,"vd":0.0545122},"name":"Quién Será","id":632889,"privilege":{"id":632889,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":320000,"toast":false,"flag":0,"preSell":false}}
         */

        private int playCount;
        private int score;
        private SongBean song;

        public int getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public SongBean getSong() {
            return song;
        }

        public void setSong(SongBean song) {
            this.song = song;
        }

        public static class SongBean {
            /**
             * rtUrls : []
             * ar : [{"id":17479,"name":"小野リサ"}]
             * al : {"id":60582,"name":"Romance Latino, Vol. 3","picUrl":"http://p3.music.126.net/pJA8Qpv5PyIrCDQjOXr1_g==/918092209193123.jpg","pic_str":"918092209193123","pic":918092209193123}
             * st : 1
             * cd : 1
             * no : 2
             * pst : 0
             * alia : []
             * pop : 95.0
             * rt :
             * mst : 9
             * cp : 5003
             * crbt : null
             * mv : 0
             * cf :
             * dt : 201091
             * h : {"br":320000,"fid":5681176580724254,"size":8073841,"vd":-2.65076E-4}
             * l : {"br":96000,"fid":5711962906302340,"size":2446962,"vd":-2.65076E-4}
             * rtUrl : null
             * ftype : 0
             * rtype : 0
             * rurl : null
             * t : 0
             * djId : 0
             * fee : 0
             * v : 6
             * a : null
             * m : {"br":160000,"fid":5506354231927824,"size":4054642,"vd":0.0545122}
             * name : Quién Será
             * id : 632889
             * privilege : {"id":632889,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":320000,"toast":false,"flag":0,"preSell":false}
             */

            private AlBean al;
            private int st;
            private String cd;
            private int no;
            private int pst;
            private double pop;
            private String rt;
            private int mst;
            private int cp;
            private Object crbt;
            private int mv;
            private String cf;
            private int dt;
            private HBean h;
            private LBean l;
            private Object rtUrl;
            private int ftype;
            private int rtype;
            private Object rurl;
            private int t;
            private int djId;
            private int fee;
            private int v;
            private Object a;
            private MBean m;
            private String name;
            private int id;
            private PrivilegeBean privilege;
            private List<?> rtUrls;
            private List<ArBean> ar;
            private List<?> alia;

            public AlBean getAl() {
                return al;
            }

            public void setAl(AlBean al) {
                this.al = al;
            }

            public int getSt() {
                return st;
            }

            public void setSt(int st) {
                this.st = st;
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

            public int getPst() {
                return pst;
            }

            public void setPst(int pst) {
                this.pst = pst;
            }

            public double getPop() {
                return pop;
            }

            public void setPop(double pop) {
                this.pop = pop;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public int getMst() {
                return mst;
            }

            public void setMst(int mst) {
                this.mst = mst;
            }

            public int getCp() {
                return cp;
            }

            public void setCp(int cp) {
                this.cp = cp;
            }

            public Object getCrbt() {
                return crbt;
            }

            public void setCrbt(Object crbt) {
                this.crbt = crbt;
            }

            public int getMv() {
                return mv;
            }

            public void setMv(int mv) {
                this.mv = mv;
            }

            public String getCf() {
                return cf;
            }

            public void setCf(String cf) {
                this.cf = cf;
            }

            public int getDt() {
                return dt;
            }

            public void setDt(int dt) {
                this.dt = dt;
            }

            public HBean getH() {
                return h;
            }

            public void setH(HBean h) {
                this.h = h;
            }

            public LBean getL() {
                return l;
            }

            public void setL(LBean l) {
                this.l = l;
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

            public int getT() {
                return t;
            }

            public void setT(int t) {
                this.t = t;
            }

            public int getDjId() {
                return djId;
            }

            public void setDjId(int djId) {
                this.djId = djId;
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

            public Object getA() {
                return a;
            }

            public void setA(Object a) {
                this.a = a;
            }

            public MBean getM() {
                return m;
            }

            public void setM(MBean m) {
                this.m = m;
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

            public PrivilegeBean getPrivilege() {
                return privilege;
            }

            public void setPrivilege(PrivilegeBean privilege) {
                this.privilege = privilege;
            }

            public List<?> getRtUrls() {
                return rtUrls;
            }

            public void setRtUrls(List<?> rtUrls) {
                this.rtUrls = rtUrls;
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

            public static class AlBean {
                /**
                 * id : 60582
                 * name : Romance Latino, Vol. 3
                 * picUrl : http://p3.music.126.net/pJA8Qpv5PyIrCDQjOXr1_g==/918092209193123.jpg
                 * pic_str : 918092209193123
                 * pic : 918092209193123
                 */

                private int id;
                private String name;
                private String picUrl;
                private String pic_str;
                private long pic;

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

                public String getPic_str() {
                    return pic_str;
                }

                public void setPic_str(String pic_str) {
                    this.pic_str = pic_str;
                }

                public long getPic() {
                    return pic;
                }

                public void setPic(long pic) {
                    this.pic = pic;
                }
            }

            public static class HBean {
                /**
                 * br : 320000
                 * fid : 5681176580724254
                 * size : 8073841
                 * vd : -2.65076E-4
                 */

                private int br;
                private long fid;
                private int size;
                private double vd;

                public int getBr() {
                    return br;
                }

                public void setBr(int br) {
                    this.br = br;
                }

                public long getFid() {
                    return fid;
                }

                public void setFid(long fid) {
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

            public static class LBean {
                /**
                 * br : 96000
                 * fid : 5711962906302340
                 * size : 2446962
                 * vd : -2.65076E-4
                 */

                private int br;
                private long fid;
                private int size;
                private double vd;

                public int getBr() {
                    return br;
                }

                public void setBr(int br) {
                    this.br = br;
                }

                public long getFid() {
                    return fid;
                }

                public void setFid(long fid) {
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

            public static class MBean {
                /**
                 * br : 160000
                 * fid : 5506354231927824
                 * size : 4054642
                 * vd : 0.0545122
                 */

                private int br;
                private long fid;
                private int size;
                private double vd;

                public int getBr() {
                    return br;
                }

                public void setBr(int br) {
                    this.br = br;
                }

                public long getFid() {
                    return fid;
                }

                public void setFid(long fid) {
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

            public static class PrivilegeBean {
                /**
                 * id : 632889
                 * fee : 0
                 * payed : 0
                 * st : 0
                 * pl : 320000
                 * dl : 320000
                 * sp : 7
                 * cp : 1
                 * subp : 1
                 * cs : false
                 * maxbr : 320000
                 * fl : 320000
                 * toast : false
                 * flag : 0
                 * preSell : false
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
                private boolean preSell;

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

                public boolean isPreSell() {
                    return preSell;
                }

                public void setPreSell(boolean preSell) {
                    this.preSell = preSell;
                }
            }

            public static class ArBean {
                /**
                 * id : 17479
                 * name : 小野リサ
                 */

                private int id;
                private String name;

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
            }
        }
    }
}
