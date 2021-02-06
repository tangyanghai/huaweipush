package com.push.tyh;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;

/**
 * <p>@author : tangyanghai</p>
 * <p>@time : 2021/2/6</p>
 * <p>@for : </p>
 * <p></p>
 */
public class HWPushService extends HmsMessageService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
    }

    @Override
    public void onDeletedMessages() {
        super.onDeletedMessages();
    }

    @Override
    public void onMessageSent(String s) {
        super.onMessageSent(s);
    }

    @Override
    public void onMessageDelivered(String s, Exception e) {
        super.onMessageDelivered(s, e);
    }

    @Override
    public void onSendError(String s, Exception e) {
        super.onSendError(s, e);
    }

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        LogUtil.log("onNewToken1 token = "+s);
    }

    @Override
    public void onNewToken(String s, Bundle bundle) {
        super.onNewToken(s, bundle);
        LogUtil.log("onNewToken2 token = "+s+"; bundle = "+ bundle.toString());
    }

    @Override
    public void onTokenError(Exception e) {
        super.onTokenError(e);
        LogUtil.log("onTokenError");
    }

    @Override
    public void onTokenError(Exception e, Bundle bundle) {
        super.onTokenError(e, bundle);
        e.printStackTrace();
        LogUtil.log("onTokenError with bundle");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i1) {
        return super.onStartCommand(intent, i, i1);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void doMsgReceived(Intent intent) {
        super.doMsgReceived(intent);
    }
}
