package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ForegroundService extends Service {
    private static int orCombineFlags(ArrayList<Integer> arrayList) {
        int intValue = arrayList.get(0).intValue();
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            intValue |= arrayList.get(i10).intValue();
        }
        return intValue;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        ForegroundServiceStartParameter foregroundServiceStartParameter = (ForegroundServiceStartParameter) (i12 >= 33 ? intent.getSerializableExtra(ForegroundServiceStartParameter.EXTRA, ForegroundServiceStartParameter.class) : intent.getSerializableExtra(ForegroundServiceStartParameter.EXTRA));
        Notification createNotification = FlutterLocalNotificationsPlugin.createNotification(this, foregroundServiceStartParameter.notificationData);
        if (foregroundServiceStartParameter.foregroundServiceTypes == null || i12 < 29) {
            startForeground(foregroundServiceStartParameter.notificationData.f7534id.intValue(), createNotification);
        } else {
            startForeground(foregroundServiceStartParameter.notificationData.f7534id.intValue(), createNotification, orCombineFlags(foregroundServiceStartParameter.foregroundServiceTypes));
        }
        return foregroundServiceStartParameter.startMode;
    }
}
