package com.xinghuo.commonlib.app.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;

import com.jess.xinghuo.utils.ArmsUtils;
import com.xinghuo.commonlib.R;
import com.xinghuo.commonlib.app.Constants.AppConst;
import com.xinghuo.commonlib.app.network.CommonApiService;

import me.jessyan.retrofiturlmanager.RetrofitUrlManager;


public class ConnectionChangeReceiver extends BroadcastReceiver {


    public ConnectionChangeReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            assert connectivity != null;
            State wifiState = connectivity.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState();
            State mobileState = connectivity.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState();
            if (State.CONNECTED == wifiState) {
                RetrofitUrlManager.getInstance().putDomain("new_network", CommonApiService.OTHER_BASE_URL);
                ArmsUtils.makeText(context,context.getString(R.string.network_wifi));
                AppConst.b_type = false;
            } else if (State.CONNECTED == mobileState) {
                RetrofitUrlManager.getInstance().putDomain("new_network", CommonApiService.BASE_URL);
                ArmsUtils.makeText(context,context.getString(R.string.network_mob));
                AppConst.b_type = true;
            } else if (wifiState != null && mobileState != null
                    && State.CONNECTED != wifiState
                    && State.CONNECTED != mobileState) {
                ArmsUtils.makeText(context,context.getString(R.string.network_no));
            }
        }

    }


}
