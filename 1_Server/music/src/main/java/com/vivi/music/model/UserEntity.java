package com.vivi.music.model;

import javax.persistence.*;

/**
 * Created by vivi on 2017/9/11.
 */
@Entity
@Table(name = "user", schema = "music", catalog = "")
public class UserEntity {
    private int id;
    private String account;
    private String name;
    private String paswd;
    private int netneseId;
    private String token;
    private String avatar;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account", nullable = false, length = 20)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "paswd", nullable = false, length = 20)
    public String getPaswd() {
        return paswd;
    }

    public void setPaswd(String paswd) {
        this.paswd = paswd;
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

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (netneseId != that.netneseId) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (paswd != null ? !paswd.equals(that.paswd) : that.paswd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (paswd != null ? paswd.hashCode() : 0);
        result = 31 * result + netneseId;
        return result;
    }

    @Basic
    @Column(name = "token", nullable = false, length = -1)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "avatar", nullable = false, length = 200)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
