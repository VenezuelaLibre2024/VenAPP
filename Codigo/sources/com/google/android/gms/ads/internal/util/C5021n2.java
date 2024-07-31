package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;

/* renamed from: com.google.android.gms.ads.internal.util.n2 */
/* loaded from: classes.dex */
public class C5021n2 extends C5013l2 {
    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: e */
    public final Intent mo12609e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: f */
    public final void mo12610f(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((Integer) C4784a0.m12365c().zza(zzbgc.zzir)).intValue());
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: g */
    public final boolean mo12611g(Context context, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        return importance == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: h */
    public final int mo12612h(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        C4965t.m12581r();
        if (C5005j2.m12663b0(context, "android.permission.ACCESS_NETWORK_STATE")) {
            isDataEnabled = telephonyManager.isDataEnabled();
            if (isDataEnabled) {
                return 2;
            }
        }
        return 1;
    }
}
