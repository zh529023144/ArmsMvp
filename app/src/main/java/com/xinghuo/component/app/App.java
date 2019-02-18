package com.xinghuo.component.app;

import android.app.Activity;
import android.app.Service;
import android.content.Context;

import com.jess.xinghuo.base.BaseApplication;
import com.jess.xinghuo.base.delegate.BaseAppDelegate;

import dagger.android.AndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasServiceInjector;

/**
 * 创建日期：2019/1/4 on 16:09
 * 描述:
 * 作者:张伦欢
 */
public class App extends BaseApplication implements HasActivityInjector, HasServiceInjector {


    private Context mContext;
    private AppDelegate appDelegate;

    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        super.onCreate();
    }

    @Override
    public BaseAppDelegate attachAppDelegate() {
        appDelegate = new AppDelegate(getBaseContext());
        return appDelegate;
    }

    public AppComponent getAppComponent() {
        return appDelegate.getAppComponent();
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return appDelegate.activityInjector();
    }

    @Override
    public AndroidInjector<Service> serviceInjector() {
        return appDelegate.serviceInjector();
    }

}
