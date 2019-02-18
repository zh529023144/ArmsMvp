package com.xinghuo.module_mine.module.main;

import javax.inject.Inject;

import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.commonlib.app.base.mvp.BaseModel;


@FragmentScope
public class MineMainModel extends BaseModel implements IMineMainModel {

    @Inject
    public MineMainModel() {

    }
}
