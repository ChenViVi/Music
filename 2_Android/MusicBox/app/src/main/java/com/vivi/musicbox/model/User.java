package com.vivi.musicbox.model;

import com.vivi.musicbox.model.base.BaseModel;

/**
 * Created by vivi on 2017/12/20.
 */

public class User extends BaseModel {
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
