package com.xinghuo.module_list.module.main;

import javax.inject.Inject;

import com.jess.xinghuo.di.scope.FragmentScope;
import com.jess.xinghuo.utils.RxLifecycleUtils;
import com.trello.rxlifecycle2.android.FragmentEvent;
import com.xinghuo.commonlib.app.base.mvp.BasePresenter;
import com.xinghuo.commonlib.app.rx.ErrorHandler;
import com.xinghuo.module_list.model.response.FeedResponse;

import io.reactivex.functions.Consumer;


@FragmentScope
public class ListMainPresenter extends BasePresenter<ListMainModel, ListMainContract.View> implements ListMainContract.Presenter {

    @Inject
    public ListMainPresenter() {

    }

    @Override
    public void getFeedData() {
        if (isAttached()){
            ListMainContract.View view=getView();

            mModel.getFeed()
                    .compose(RxLifecycleUtils.bindUntilEvent(getView(), FragmentEvent.DESTROY_VIEW))
                    .subscribe(new Consumer<FeedResponse>() {
                        @Override
                        public void accept(FeedResponse feedResponse) throws Exception {
                            view.onSucceed(feedResponse);
                        }
                    },new ErrorHandler(){
                        @Override
                        public void accept(Throwable err) throws Exception {
                            super.accept(err);
                            view.onError(err);
                        }
                    });
        }
    }
}
