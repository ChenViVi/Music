package com.vivi.music.model;

import javax.persistence.*;

/**
 * Created by vivi on 2017/9/12.
 */
@Entity
@Table(name = "playlist_netnese", schema = "music", catalog = "")
public class PlayListNetneseEntity {
    private int id;
    private String name;
    private int trackCount;
    private int playCount;
    private String coverImgUrl;
    private String description;
    private int netneseId;
    private int creatorId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "trackCount", nullable = false)
    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    @Basic
    @Column(name = "playCount", nullable = false)
    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    @Basic
    @Column(name = "coverImgUrl", nullable = false, length = -1)
    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "netneseId", nullable = false)
    public int getNetneseId() {
        return netneseId;
    }

    public void setNetneseId(int netneseId) {
        this.netneseId = netneseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayListNetneseEntity that = (PlayListNetneseEntity) o;

        if (id != that.id) return false;
        if (trackCount != that.trackCount) return false;
        if (playCount != that.playCount) return false;
        if (netneseId != that.netneseId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (coverImgUrl != null ? !coverImgUrl.equals(that.coverImgUrl) : that.coverImgUrl != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + trackCount;
        result = 31 * result + playCount;
        result = 31 * result + (coverImgUrl != null ? coverImgUrl.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + netneseId;
        return result;
    }

    @Basic
    @Column(name = "creatorId", nullable = false)
    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }
}
