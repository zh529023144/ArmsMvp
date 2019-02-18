package com.xinghuo.commonlib.app.rx;

import android.util.Log;

import com.jess.xinghuo.utils.ArmsUtils;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;

import io.reactivex.functions.Consumer;

/**
 * @author greensun
 * @date 2018/11/1
 * @desc
 */
public class ErrorHandler implements Consumer<Throwable> {

    private static final String TAG = "ErrorHandler";

    @Override
    public void accept(Throwable err) throws Exception {
        String msg;
//        if (err instanceof SocketTimeoutException) {
//            msg = ArmsUtils.getString(App.getContext(), R.string.err_page_timeout);
//        } else if (err instanceof ConnectException) {
//            msg = ArmsUtils.getString(App.getContext(), R.string.no_network);
//        } else if (err instanceof SocketException) {
//            msg = ArmsUtils.getString(App.getContext(), R.string.error_data);
//        } else {
//            msg = ArmsUtils.getString(App.getContext(), R.string.no_data);
//        }
//        Log.e(TAG, "accept: msg:" + err.toString());
//        ToastUtil.showToast(App.getContext(), msg);
    }
}
