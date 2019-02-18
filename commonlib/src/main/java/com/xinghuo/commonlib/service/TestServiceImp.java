package com.xinghuo.commonlib.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xinghuo.commonlib.bean.Test;

/**
 * @author greensun
 *
 * @date 2019/1/8
 *
 * @desc 模拟地图服务
 */
@Route(path = "/mapService/test")
public class TestServiceImp implements TestService {
    @Override
    public Test getData(String tag) {
        return new Test("xxx", 12);
    }

    @Override
    public void init(Context context) {

    }
}
