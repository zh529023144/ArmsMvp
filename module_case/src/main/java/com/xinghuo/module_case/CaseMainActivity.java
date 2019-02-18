package com.xinghuo.module_case;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xinghuo.commonlib.app.Constants.ARouterConfig;
import com.xinghuo.commonlib.app.base.BaseActivity;

@Route(path = ARouterConfig.CASE_MAIN_ACTIVITY)
public class CaseMainActivity extends BaseActivity {

    @Override
    public int bindLayout() {
        return R.layout.activity_case_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {

    }
}
