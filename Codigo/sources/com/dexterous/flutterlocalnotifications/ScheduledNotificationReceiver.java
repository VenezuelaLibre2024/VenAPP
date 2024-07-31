package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.core.app.t0;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;

@Keep
/* loaded from: classes.dex */
public class ScheduledNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Integer num;
        String stringExtra = intent.getStringExtra(FlutterLocalNotificationsPlugin.NOTIFICATION_DETAILS);
        if (StringUtils.isNullOrEmpty(stringExtra).booleanValue()) {
            Notification notification = (Notification) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("notification", Notification.class) : intent.getParcelableExtra("notification"));
            notification.when = System.currentTimeMillis();
            int intExtra = intent.getIntExtra("notification_id", 0);
            t0.f(context).i(intExtra, notification);
            if (intent.getBooleanExtra("repeat", false)) {
                return;
            } else {
                num = Integer.valueOf(intExtra);
            }
        } else {
            NotificationDetails notificationDetails = (NotificationDetails) FlutterLocalNotificationsPlugin.buildGson().i(stringExtra, new com.google.gson.reflect.a<NotificationDetails>() { // from class: com.dexterous.flutterlocalnotifications.ScheduledNotificationReceiver.1
            }.getType());
            FlutterLocalNotificationsPlugin.showNotification(context, notificationDetails);
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                FlutterLocalNotificationsPlugin.zonedScheduleNextNotification(context, notificationDetails);
                return;
            } else if (notificationDetails.matchDateTimeComponents != null) {
                FlutterLocalNotificationsPlugin.zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
                return;
            } else {
                if (notificationDetails.repeatInterval != null) {
                    FlutterLocalNotificationsPlugin.scheduleNextRepeatingNotification(context, notificationDetails);
                    return;
                }
                num = notificationDetails.f7534id;
            }
        }
        FlutterLocalNotificationsPlugin.removeNotificationFromCache(context, num);
    }
}
