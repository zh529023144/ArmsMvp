package com.xinghuo.module_map.module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xinghuo.commonlib.app.Constants.ARouterConfig;
import com.xinghuo.commonlib.app.base.BaseActivity;
import com.xinghuo.module_map.R;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

@Route(path = ARouterConfig.MAP_MAIN_ACTIVITY)
public class MapMainActivity extends BaseActivity implements HasSupportFragmentInjector {
    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Override
    public int bindLayout() {
        return R.layout.activity_map_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {

    }


    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }
}
