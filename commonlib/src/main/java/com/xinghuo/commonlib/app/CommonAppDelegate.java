package com.xinghuo.commonlib.app;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.xinghuo.BuildConfig;
import com.jess.xinghuo.base.delegate.BaseAppDelegate;

/**
 * @author greensun
 * @date 2019/1/9
 * @desc
 */
public abstract class CommonAppDelegate extends BaseAppDelegate {

    public CommonAppDelegate(@NonNull Context context) {
        super(context);
    }

    @Override
    public void onCreate(@NonNull Application application) {
        super.onCreate(application);
        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(application);
    }
}
