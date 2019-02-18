package com.xinghuo.commonlib.app.rx;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @author greensun
 *
 * @date 2018/9/29
 *
 * @desc 默认线程调度器
 */
public class SchedulerTransformer<T> implements ObservableTransformer<T, T> {

    @Override
    public ObservableSource<T> apply(Observable<T> upstream) {
        return upstream
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
