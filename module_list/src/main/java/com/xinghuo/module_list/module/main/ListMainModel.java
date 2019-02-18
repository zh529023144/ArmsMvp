package com.xinghuo.module_list.module.main;

import javax.inject.Inject;

import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.commonlib.app.base.mvp.BaseModel;
import com.xinghuo.module_list.model.response.FeedResponse;
import com.xinghuo.module_list.network.ListApiService;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


@FragmentScope
public class ListMainModel extends BaseModel implements IListMainModel {

    @Inject
    public ListMainModel() {

    }

    @Override
    public Observable<FeedResponse> getFeed() {
        ListApiService apiService = mManager.obtainRetrofitService(ListApiService.class);


        return apiService.getFeed()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                ;
    }
}
