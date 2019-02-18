package com.xinghuo.module_map.module.main;

import javax.inject.Inject;

import com.jess.xinghuo.di.scope.FragmentScope;
import com.xinghuo.commonlib.app.base.mvp.BaseModel;


@FragmentScope
public class MapMainModel extends BaseModel implements IMapMainModel {

    @Inject
    public MapMainModel() {

    }
}
