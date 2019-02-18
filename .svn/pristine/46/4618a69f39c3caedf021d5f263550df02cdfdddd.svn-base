package com.xinghuo.module_list.module.main;

import com.jess.xinghuo.mvp.IView;
import com.xinghuo.module_list.model.response.FeedResponse;

public interface ListMainContract {
    interface View extends IView {

       void onSucceed(FeedResponse response);
       void onError(Throwable throwable);
    }

    interface Presenter {

        void getFeedData();
    }
}
