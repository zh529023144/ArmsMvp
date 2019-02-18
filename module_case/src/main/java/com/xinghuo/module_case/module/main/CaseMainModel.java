package com.xinghuo.module_case.module.main;

import javax.inject.Inject;

import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.commonlib.app.base.mvp.BaseModel;


@FragmentScope
public class CaseMainModel extends BaseModel implements ICaseMainModel {

    @Inject
    public CaseMainModel() {

    }
}
