package com.xinghuo.module_mine.di;


import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.module_mine.module.main.MineMainFragment;
import com.xinghuo.module_mine.module.main.MineMainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MineFragmentModule {

    @ContributesAndroidInjector(modules = MineMainModule.class)
    @FragmentScope
    abstract MineMainFragment provideMineFragment();
}
