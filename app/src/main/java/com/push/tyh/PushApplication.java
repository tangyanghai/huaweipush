package com.push.tyh;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.media.AudioAttributes;
import android.net.Uri;

import static android.media.AudioAttributes.USAGE_MEDIA;

/**
 * <p>@author : tangyanghai</p>
 * <p>@time : 2021/2/6</p>
 * <p>@for : </p>
 * <p></p>
 */
public class PushApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            Uri uri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + getPackageName() + "/" + (R.raw.order_hire_boss));
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel notificationChannel = null;
            notificationChannel = new NotificationChannel(
                    "order_hire_boss",
                    "自定义Channel",
                    importance);
            notificationChannel.setSound(uri, new AudioAttributes.Builder().setUsage(USAGE_MEDIA).build());
            notificationChannel.enableLights(true);
            notificationChannel.setVibrationPattern(new long[]{100, 200, 400, 200});
            notificationChannel.enableVibration(true);
            notificationChannel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
            notificationChannel.setImportance(importance);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
