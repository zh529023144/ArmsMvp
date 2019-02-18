package com.xinghuo.commonlib.app.base.mvp;


import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

import com.google.gson.Gson;
import com.jess.xinghuo.integration.RepositoryManager;
import com.jess.xinghuo.mvp.IModel;
import com.xinghuo.commonlib.app.network.ApiServiceHelper;
import com.xinghuo.commonlib.app.rx.SchedulerTransformer;

import javax.inject.Inject;

import okhttp3.RequestBody;

/**
 * @author greensun
 *
 * @date 2018/8/31
 *
 * @desc
 */
public class BaseModel implements IModel, LifecycleObserver {
    @Inject
    protected RepositoryManager mManager;

    protected <T> SchedulerTransformer<T> applyScheduler() {
        return new SchedulerTransformer<>();
    }


    @Override
    public void onDestroy() {
        mManager = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(LifecycleOwner owner) {
        owner.getLifecycle().removeObserver(this);
    }
}
