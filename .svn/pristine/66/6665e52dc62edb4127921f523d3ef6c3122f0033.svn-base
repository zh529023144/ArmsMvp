package com.xinghuo.commonlib.app;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.xinghuo.BuildConfig;
import com.jess.xinghuo.base.BaseApplication;

/**
 * 创建日期：2019/1/4 on 16:37
 * 描述:
 * 作者:张伦欢
 */
public abstract class ArmsApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
    }

    private void initARouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
