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

        //初始化log, 如果不初始化, 将使用 DLog 的默认样式  (无头, 无框)
        DLogUtils.initDLog(this);
    }
}
