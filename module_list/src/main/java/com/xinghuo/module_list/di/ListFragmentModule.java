package com.xinghuo.module_list.di;

import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.module_list.module.main.ListMainContract;
import com.xinghuo.module_list.module.main.ListMainFragment;
import com.xinghuo.module_list.module.main.ListMainModel;
import com.xinghuo.module_list.module.main.ListMainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * 创建日期：2019/1/15 on 15:17
 * 描述:
 * 作者:张伦欢
 */
@Module
public abstract class ListFragmentModule {
    @ContributesAndroidInjector(modules = ListMainModule.class)
    @FragmentScope
    abstract ListMainFragment provideListMainFragment();
}
