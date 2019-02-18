package com.xinghuo.commonlib.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.xinghuo.commonlib.bean.Test;

/**
 * @author greensun
 *
 * @date 2019/1/8
 *
 * @desc
 */
public interface TestService extends IProvider {

    Test getData(String tag);
}
