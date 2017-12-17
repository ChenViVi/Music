package com.vivi.music.modle;

/**
 * Created by vivi on 2017/9/10.
 */

public class PlayList {

    private int id;
    private int type;
    public static final int Title_Inspire = 1;
    public static final int PlayList_Inspire = 2;
    public static final int Title_Netnese = 3;
    public static final int PlayList_Netnese = 4;
    public static final int Title_Netnese_Empty = 5;
    private String name;
    private String imgUrl;
    private int num;

    public PlayList(int type){
        this.type = type;
    }

    public PlayList(int id, int type,String name,String imgUrl,int num){
        this.id = id;
        this.type = type;
        this.name = name;
        this.num = num;
        this.imgUrl = imgUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
