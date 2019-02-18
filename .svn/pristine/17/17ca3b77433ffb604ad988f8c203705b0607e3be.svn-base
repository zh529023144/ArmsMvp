package com.xinghuo.module_case.di;


import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.module_case.module.main.CaseMainFragment;
import com.xinghuo.module_case.module.main.CaseMainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class CaseFragmentModule {

    @ContributesAndroidInjector(modules = CaseMainModule.class)
    @FragmentScope
    abstract CaseMainFragment provideCaseFragment();
}
