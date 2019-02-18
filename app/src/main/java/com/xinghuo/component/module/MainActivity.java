package com.xinghuo.component.module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;

import android.support.v4.view.ViewPager;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.xinghuo.base.AdapterViewPager;
import com.xinghuo.commonlib.app.Constants.ARouterConfig;
import com.jess.xinghuo.base.ArmsBaseActivity;
import com.xinghuo.commonlib.app.base.BaseFragment;
import com.xinghuo.component.R;
import com.xinghuo.module_case.module.main.CaseMainFragment;
import com.xinghuo.module_channel.module.main.ChannelMainFragment;
import com.xinghuo.module_list.module.main.ListMainFragment;
import com.xinghuo.module_map.module.main.MapMainFragment;
import com.xinghuo.module_mine.module.main.MineMainFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends ArmsBaseActivity implements HasSupportFragmentInjector {
    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    /*@BindView(R.id.bn_list)
    Button bnList;
    @BindView(R.id.bn_channel)
    Button bnChannel;
    @BindView(R.id.bn_map)
    Button bnMap;
    @BindView(R.id.bn_case)
    Button bnCase;
    @BindView(R.id.bn_mine)
    Button bnMine;*/

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    private List<BaseFragment> fragmentList = new ArrayList<>();


    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {

        ListMainFragment listFragment = (ListMainFragment) ARouter.getInstance()
                .build(ARouterConfig.LIST_MAIN_FRAGMENT)
                .navigation();
        ChannelMainFragment channelFragment = (ChannelMainFragment) ARouter.getInstance()
                .build(ARouterConfig.CHANNEL_MAIN_FRAGMENT)
                .navigation();
        CaseMainFragment caseFragment = (CaseMainFragment) ARouter.getInstance()
                .build(ARouterConfig.CASE_MAIN_FRAGMENT)
                .navigation();
        MapMainFragment mapFragment = (MapMainFragment) ARouter.getInstance()
                .build(ARouterConfig.MAP_MAIN_FRAGMENT)
                .navigation();
        MineMainFragment mineFragment = (MineMainFragment) ARouter.getInstance()
                .build(ARouterConfig.MINE_MAIN_FRAGMENT)
                .navigation();
        fragmentList.add(listFragment);
        fragmentList.add(channelFragment);
        fragmentList.add(mapFragment);
        fragmentList.add(caseFragment);
        fragmentList.add(mineFragment);
        String[] titles = getResources().getStringArray(R.array.tabs);
        AdapterViewPager adapter = new AdapterViewPager(getSupportFragmentManager(), fragmentList, titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    /*@OnClick({R.id.bn_list, R.id.bn_channel, R.id.bn_map, R.id.bn_case, R.id.bn_mine})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bn_list:
                ARouter.getInstance()
                        .build(ARouterConfig.LIST_MAIN_ACTIVITY)
                        .withObject("data", new Test("xxx", 1))
                        .navigation(this, new NavigationCallback() {
                            @Override
                            public void onFound(Postcard postcard) {

                            }

                            @Override
                            public void onLost(Postcard postcard) {

                            }

                            @Override
                            public void onArrival(Postcard postcard) {

                            }

                            @Override
                            public void onInterrupt(Postcard postcard) {
                                runOnUiThread(() -> {
                                    Toast.makeText(MainActivity.this, postcard.getTag().toString(), Toast.LENGTH_SHORT).show();
                                });
                            }
                        });
                break;
            case R.id.bn_channel:
                ARouter.getInstance().build(ARouterConfig.CHANNEL_MAIN_ACTIVITY).navigation();
                break;
            case R.id.bn_map:
                ARouter.getInstance().build(ARouterConfig.MAP_MAIN_ACTIVITY).navigation();
                break;
            case R.id.bn_case:
                ARouter.getInstance().build(ARouterConfig.CASE_MAIN_ACTIVITY).navigation();
                break;
            case R.id.bn_mine:
                ARouter.getInstance().build(ARouterConfig.MINE_MAIN_ACTIVITY).navigation();
                break;
        }
    }*/

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }

    @Override
    public boolean useFragment() {
        return true;
    }
}
