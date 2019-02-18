package com.xinghuo.module_list.module.main;


import com.xinghuo.module_list.model.response.FeedResponse;

import io.reactivex.Observable;

interface IListMainModel {

    Observable<FeedResponse> getFeed();
}
