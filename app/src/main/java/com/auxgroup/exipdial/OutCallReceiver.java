package com.auxgroup.exipdial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/**
 * 1.创建一个收音机，继承广播接收者
 */
public class OutCallReceiver extends BroadcastReceiver {
    //接收到消息对应的方法
    public OutCallReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String number = getResultData();
        System.out.println("哈哈，有电话打出去了");
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        String ipNumber = sp.getString("ipNumber", "");
        setResultData(ipNumber+number);

    }
}
