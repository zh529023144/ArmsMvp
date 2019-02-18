package com.xinghuo.module_list.module.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.xinghuo.http.imageloader.glide.GlideArms;
import com.xinghuo.commonlib.app.Constants.ARouterConfig;
import com.xinghuo.commonlib.app.base.BaseFragment;
import com.xinghuo.module_list.R;
import com.xinghuo.module_list.R2;
import com.xinghuo.module_list.model.response.FeedResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

@Route(path = ARouterConfig.LIST_MAIN_FRAGMENT)
public class ListMainFragment extends BaseFragment<ListMainPresenter> implements ListMainContract.View {


    @BindView(R2.id.recycle)
    RecyclerView recycle;
    private BaseQuickAdapter<FeedResponse.FeedListBean, BaseViewHolder> baseQuickAdapter;

    public static ListMainFragment newInstance() {
        ListMainFragment fragment = new ListMainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_list_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        recycle.setLayoutManager(new LinearLayoutManager(getActivity()));
        baseQuickAdapter = new BaseQuickAdapter<FeedResponse.FeedListBean, BaseViewHolder>(R.layout.list_main_item, null) {
            @Override
            protected void convert(BaseViewHolder helper, FeedResponse.FeedListBean item) {

                helper.setText(R.id.tv_title, item.getSite().getDescription());
                GlideArms
                        .with(mContext)
                        .load(item.getSite().getIcon())
//                        .placeholder(R.mipmap.icon_camera_yes)
//                        .error(R.mipmap.icon_camera_error)
                        .into((ImageView) helper.getView(R.id.iv_pic));
            }
        };

        recycle.setAdapter(baseQuickAdapter);
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {

        mPresenter.getFeedData();
    }

    @Override
    public void onSucceed(FeedResponse response) {

        baseQuickAdapter.setNewData(response.getFeedList());
    }

    @Override
    public void onError(Throwable throwable) {

    }




}
