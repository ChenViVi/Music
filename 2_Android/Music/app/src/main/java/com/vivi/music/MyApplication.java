package com.vivi.music;

import com.chenyuwei.basematerial.BaseApplication;
import com.vivi.music.network.RequestMaker;

/**
 * Created by vivi on 2016/8/31.
 */

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        RequestMaker.init(this);
    }
}