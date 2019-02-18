package com.xinghuo.module_channel.di;


import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.module_channel.module.main.ChannelMainFragment;
import com.xinghuo.module_channel.module.main.ChannelMainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ChannelFragmentModule {

    @ContributesAndroidInjector(modules = ChannelMainModule.class)
    @FragmentScope
    abstract ChannelMainFragment provideChannelMainFragment();
}
