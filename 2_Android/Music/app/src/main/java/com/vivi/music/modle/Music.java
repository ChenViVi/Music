package com.vivi.music.modle;

import com.superrecycleview.superlibrary.recycleview.progressindicator.indicator.SemiCircleSpinIndicator;

import java.util.ArrayList;

/**
 * Created by vivi on 2017/9/29.
 */

public class Music {
    private int id;
    private int position;
    private String name;
    private ArrayList<Artist> artists;

    public Music(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtists(ArrayList<Artist> artists) {
        this.artists = artists;
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }
}
