package com.vivi.musicbox.model;

import com.vivi.musicbox.model.base.BaseModel;

/**
 * Created by p_yuweichen on 2017/12/21.
 */

public class UserSubCount extends BaseModel {

    /**
     * programCount : 0
     * djRadioCount : 1
     * mvCount : 0
     * artistCount : 1
     * newProgramCount : 0
     * createDjRadioCount : 0
     * createdPlaylistCount : 2
     * subPlaylistCount : 0
     */

    private int programCount;
    private int djRadioCount;
    private int mvCount;
    private int artistCount;
    private int newProgramCount;
    private int createDjRadioCount;
    private int createdPlaylistCount;
    private int subPlaylistCount;

    public int getProgramCount() {
        return programCount;
    }

    public void setProgramCount(int programCount) {
        this.programCount = programCount;
    }

    public int getDjRadioCount() {
        return djRadioCount;
    }

    public void setDjRadioCount(int djRadioCount) {
        this.djRadioCount = djRadioCount;
    }

    public int getMvCount() {
        return mvCount;
    }

    public void setMvCount(int mvCount) {
        this.mvCount = mvCount;
    }

    public int getArtistCount() {
        return artistCount;
    }

    public void setArtistCount(int artistCount) {
        this.artistCount = artistCount;
    }

    public int getNewProgramCount() {
        return newProgramCount;
    }

    public void setNewProgramCount(int newProgramCount) {
        this.newProgramCount = newProgramCount;
    }

    public int getCreateDjRadioCount() {
        return createDjRadioCount;
    }

    public void setCreateDjRadioCount(int createDjRadioCount) {
        this.createDjRadioCount = createDjRadioCount;
    }

    public int getCreatedPlaylistCount() {
        return createdPlaylistCount;
    }

    public void setCreatedPlaylistCount(int createdPlaylistCount) {
        this.createdPlaylistCount = createdPlaylistCount;
    }

    public int getSubPlaylistCount() {
        return subPlaylistCount;
    }

    public void setSubPlaylistCount(int subPlaylistCount) {
        this.subPlaylistCount = subPlaylistCount;
    }
}
