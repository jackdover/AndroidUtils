package com.dover.androidutils;

import android.app.Application;

import com.dover.androidutils.dlog.DLogUtils;

/**
 * Created by d on 2017/9/8.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        //初始化log
        DLogUtils.initDLog(this);
    }
}
