package com.xinghuo.module_map.di;


import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.module_map.module.main.MapMainFragment;
import com.xinghuo.module_map.module.main.MapMainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MapFragmentModule {

    @ContributesAndroidInjector(modules = MapMainModule.class)
    @FragmentScope
    abstract MapMainFragment provideMapFragment();
}
