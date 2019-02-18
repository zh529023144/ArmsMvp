package com.xinghuo.module_list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xinghuo.commonlib.app.Constants.ARouterConfig;
import com.xinghuo.commonlib.app.base.BaseActivity;
import com.xinghuo.module_list.module.main.ListMainFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;


@Route(path = ARouterConfig.LIST_MAIN_ACTIVITY)
public class ListMainActivity extends BaseActivity implements HasSupportFragmentInjector {
    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Override
    public int bindLayout() {
        return R.layout.activity_list_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(R.id.frameLayout, ListMainFragment.newInstance());
        transaction.commit();
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }

    @Override
    public boolean useFragment() {
        return true;
    }
}
