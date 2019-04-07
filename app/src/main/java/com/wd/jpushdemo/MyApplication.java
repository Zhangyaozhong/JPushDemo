package com.wd.jpushdemo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * @author Lenovo
 * @name JPushDemo
 * @class name：com.wd.jpushdemo
 * @class describe
 * @time 2019/4/7 14:32
 * @change
 * @chang time
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化sdk
        JPushInterface.setDebugMode(true);//正式版的时候设置false，关闭调试
        JPushInterface.init(this);
        JPushInterface.setAlias(getApplicationContext(), 1, "xlj");
        //添加tag标签，发送消息的之后就可以指定tag标签来发送了
        //Set<String> set = new HashSet<>();
        //set.add("andfixdemo");//名字任意，可多添加几个
        //JPushInterface.setTags(this, set, null);//设置标签
    }
}
