package com.example.mttv.tvapp;

import android.app.Application;

/**
 * @ author: lkw
 * created on:2020/4/24 15:49
 * description:
 * email:lkw@mantoo.com.cn
 */
public class TVApplication extends Application {
    private static volatile TVApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }

    public static TVApplication getInstance() {
        return instance;
    }
}
