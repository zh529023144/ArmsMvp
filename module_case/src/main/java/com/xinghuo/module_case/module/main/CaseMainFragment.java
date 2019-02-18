package com.xinghuo.module_case.module.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xinghuo.commonlib.app.Constants.ARouterConfig;
import com.xinghuo.commonlib.app.base.BaseFragment;
import com.xinghuo.module_case.R;

@Route(path = ARouterConfig.CASE_MAIN_FRAGMENT)
public class CaseMainFragment extends BaseFragment<CaseMainPresenter> implements CaseMainContract.View {

    public static CaseMainFragment newInstance() {
        CaseMainFragment fragment = new CaseMainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_case_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {

    }

}
