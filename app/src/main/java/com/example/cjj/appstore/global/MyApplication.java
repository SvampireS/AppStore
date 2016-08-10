package com.example.cjj.appstore.global;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * 初始化全局变量
 * Created by admin on 2016/7/18.
 */
public class MyApplication extends Application {
    private static Context context;
    private static Handler handler;
    private static int mainTreadId;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
        handler=new Handler();
        mainTreadId =android.os.Process.myTid();
    }

    public static Context getContext() {
        return context;
    }

    public static Handler getHandler() {
        return handler;
    }

    public static int getMainTreadId() {
        return mainTreadId;
    }
}
