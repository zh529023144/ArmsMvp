package com.xinghuo.commonlib.app.base;

import android.app.Dialog;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.jess.xinghuo.base.ArmsBaseFragment;
import com.jess.xinghuo.mvp.IPresenter;

/**
 * @author greensun
 * @date 2018/9/3
 * @desc
 */
public abstract class BaseFragment<P extends IPresenter> extends ArmsBaseFragment<P> {

    public boolean onBackPressedSupport() {
        return false;
    }
}
