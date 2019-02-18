package com.xinghuo.module_channel.module.main;

import javax.inject.Inject;

import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.commonlib.app.base.mvp.BaseModel;


@FragmentScope
public class ChannelMainModel extends BaseModel implements IChannelMainModel {

    @Inject
    public ChannelMainModel() {

    }
}
