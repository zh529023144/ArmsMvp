package com.xinghuo.module_mine.module.main;

import com.jess.xinghuo.di.scope.FragmentScope;

import dagger.Binds;
import dagger.Module;


@Module
public abstract class MineMainModule {

    @FragmentScope
    @Binds
    abstract MineMainContract.View provideMineMainView(MineMainFragment fragment);
}
