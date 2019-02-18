package com.xinghuo.commonlib.utils;

import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;

/**
 * @author greensun
 *
 * @date 2019/1/10
 *
 * @desc
 */
public class ARouterUtil {


    public static <F extends Fragment> F getFragment(Class<F> clz, String path) {
        return (F) ARouter.getInstance()
                .build(path)
                .navigation();
    }
}
