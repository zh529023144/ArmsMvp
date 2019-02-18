package com.xinghuo.module_map.module.main;

import com.jess.xinghuo.di.scope.FragmentScope;

import dagger.Binds;
import dagger.Module;


@Module
public abstract class MapMainModule {

    @FragmentScope
    @Binds
    abstract MapMainContract.View provideMapMainView(MapMainFragment fragment);
}
