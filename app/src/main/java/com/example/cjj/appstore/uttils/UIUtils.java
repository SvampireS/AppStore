package com.example.cjj.appstore.uttils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;

import com.example.cjj.appstore.R;
import com.example.cjj.appstore.global.MyApplication;

/**
 * Created by admin on 2016/7/18.
 */
public class UIUtils {
    public static Context getContext() {
        return MyApplication.getContext();
    }

    public static Handler getHandler() {
        return MyApplication.getHandler();
    }

    public static int getMainThreadId() {
        return MyApplication.getMainTreadId();
    }

    ///////////////////加载资源文件////////////////////////

    //获取字符串
    public static String getString(int id){
        return getContext().getResources().getString(id);
    }

    //获取字符串数组
    public static String[] getStringArray(int id){
        return getContext().getResources().getStringArray(id);
    }

    //加载图片
    public static Drawable getDrawable(int id){
        return getContext().getResources().getDrawable(id);
    }

    //获取颜色
    public static int getColor(int id){
        return getContext().getResources().getColor(id);
    }

    //返回像素值
    public static int getDimen(int id){
        return  getContext().getResources().getDimensionPixelSize(id);
    }


    /////////////////////////////////

    public static int dip2px(float dp){
        float density=  getContext().getResources().getDisplayMetrics().density;//得到设备密度
        return (int) (dp*density+0.5f);
    }
    public static int px2dip(float px){
        float density=  getContext().getResources().getDisplayMetrics().density;//得到设备密度
        return (int) (px/density);
    }

    ////////////加载布局文件/////////////
    public static View inflate(int id){
        return View.inflate(getContext(), id,null);
    }

    ////////////判断是否在主线程//////////
    public static boolean isRunOnUIThread(){
        int mid=android.os.Process.myTid();
        if (mid==MyApplication.getMainTreadId()){
            return true;
        }else {
            return false;
        }
    }

    public static void runOnUIThread(Runnable r){
        if (isRunOnUIThread()){
            r.run();
        }else {
            getHandler().post(r);
        }
    }


    public static ColorStateList getColorStateList(int id) {
        return getContext().getResources().getColorStateList(id);
    }
}
