package com.xinghuo.commonlib.interceptors;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;



/**
 * @author greensun
 *
 * @date 2019/1/8
 *
 * @desc
 */
@Interceptor(priority = 8)
public class TestInterceptor implements IInterceptor {
    private Context context;

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if ("list".equals(postcard.getGroup())) {
            /*new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, "是list模块，被拦截了", Toast.LENGTH_SHORT).show();
                }
            });*/
//            callback.onInterrupt(new Exception("是list模块，被拦截了"));
//            return;
        }
        callback.onContinue(postcard);
    }

    @Override
    public void init(Context context) {
        // 拦截器被创建
        this.context = context;
    }
}
