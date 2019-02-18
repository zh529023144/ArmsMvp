package com.xinghuo.module_list.module.main;

import com.jess.xinghuo.di.scope.FragmentScope;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ListMainModule {

    @Binds
    @FragmentScope
    abstract ListMainContract.View provideListMainView(ListMainFragment fragment);
}
