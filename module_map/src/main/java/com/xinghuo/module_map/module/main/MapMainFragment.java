package com.xinghuo.module_map.module.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xinghuo.commonlib.app.Constants.ARouterConfig;
import com.xinghuo.commonlib.app.base.BaseFragment;
import com.xinghuo.module_map.R;

@Route(path = ARouterConfig.MAP_MAIN_FRAGMENT)
public class MapMainFragment extends BaseFragment<MapMainPresenter> implements MapMainContract.View {

    public static MapMainFragment newInstance() {
        MapMainFragment fragment = new MapMainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_map_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {

    }

}
