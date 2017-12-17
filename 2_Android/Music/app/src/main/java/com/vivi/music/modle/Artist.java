package com.vivi.music.modle;

/**
 * Created by vivi on 2017/9/30.
 */

public class Artist {
    private int id;
    private String name;

    public Artist(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
