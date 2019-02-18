package com.xinghuo.component.app;


import com.jess.xinghuo.di.scope.ActivityScope;
import com.xinghuo.component.module.MainActivity;
import com.xinghuo.module_case.di.CaseFragmentModule;
import com.xinghuo.module_channel.di.ChannelFragmentModule;
import com.xinghuo.module_list.di.ListFragmentModule;
import com.xinghuo.module_map.di.MapFragmentModule;
import com.xinghuo.module_map.module.main.MapMainModule;
import com.xinghuo.module_mine.di.MineFragmentModule;
import com.xinghuo.module_mine.module.main.MineMainModule;


import java.util.List;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author greensun
 * @date 2018/8/21
 * @desc 用于注入Activity，将每个Activity的component添加到map
 * 此module用来统一管理app component 的子activity component
 */
@Module
public abstract class AppModule {

    /**
     * {@link ContributesAndroidInjector} 相当于创建了了一个用于注入MainActivity的AppComponent的子Component,
     * modules：此component所依赖的modules。
     * 提供activity依赖  所生成代码：build/下： ActivityModule_ForecastListActivityInjector
     *
     * @return
     */
    @ContributesAndroidInjector(modules = {
            ListFragmentModule.class,
            ChannelFragmentModule.class,
            MapFragmentModule.class,
            CaseFragmentModule.class,
            MineFragmentModule.class

    })
    @ActivityScope
    abstract MainActivity provideMainActivity();
}
