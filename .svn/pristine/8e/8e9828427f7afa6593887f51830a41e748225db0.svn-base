package com.xinghuo.module_case.app;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;

import com.jess.xinghuo.di.component.BaseComponent;
import com.xinghuo.commonlib.app.CommonAppDelegate;
import com.xinghuo.module_case.di.CaseComponent;
import com.xinghuo.module_case.di.DaggerCaseComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasServiceInjector;


/**
 * @author greensun
 *
 * @date 2018/8/21
 *
 * @desc 实现HasActivityInjector接口用于管理activity
 */
public class AppDelegate extends CommonAppDelegate implements HasActivityInjector, HasServiceInjector {
    @Inject
    DispatchingAndroidInjector<Activity> mActivityInjector;
    @Inject
    DispatchingAndroidInjector<Service> mServiceInjector;

    private CaseComponent appComponent;

    public AppDelegate(@NonNull Context context) {
        super(context);
    }


    @Override
    public void bindSubComponent(BaseComponent baseComponent) {
        appComponent = DaggerCaseComponent.builder()
                .baseComponent(baseComponent)
                .build();
        appComponent.inject(this);
    }


    public CaseComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mActivityInjector;
    }

    @Override
    public AndroidInjector<Service> serviceInjector() {
        return mServiceInjector;
    }
}
