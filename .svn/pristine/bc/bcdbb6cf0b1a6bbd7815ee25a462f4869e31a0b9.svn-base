package com.xinghuo.module_list.di;


import com.jess.xinghuo.di.scope.ActivityScope;
import com.xinghuo.module_list.ListMainActivity;
import com.xinghuo.module_list.module.main.ListMainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author greensun
 * @date 2018/8/21
 * @desc 用于注入Activity，将每个Activity的component添加到map
 * 此module用来统一管理app component 的子activity component
 */
@Module
public abstract class ListModule {

    /**
     * {@link ContributesAndroidInjector} 相当于创建了了一个用于注入MainActivity的AppComponent的子Component,
     * modules：此component所依赖的modules。
     * 提供activity依赖  所生成代码：build/下： ActivityModule_ForecastListActivityInjector
     *
     * @return
     */
    @ContributesAndroidInjector(modules =
            ListFragmentModule.class)
    @ActivityScope
    abstract ListMainActivity provideListMainActivity();
}
