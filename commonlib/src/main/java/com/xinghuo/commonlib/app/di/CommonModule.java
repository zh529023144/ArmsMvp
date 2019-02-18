package com.xinghuo.commonlib.app.di;


import android.support.annotation.Nullable;

import com.jess.xinghuo.mvp.IPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {

//    @AppScope
//    @Provides
//    public static BoxStore providerBoxStore(Application context){
//        BoxStore mBoxStore = MyObjectBox.builder().androidContext(context).build();
//        if (BuildConfig.DEBUG){
//            new AndroidObjectBrowser(mBoxStore).start(context);
//        }
//        return mBoxStore;
//    }

    /**
     * 此方法是为了给不需要Presenter的组件提供一个空Presenter
     * @return
     */
    @Provides
    @Nullable
    public static IPresenter providerPresenter(){
        return null;
    }
}
