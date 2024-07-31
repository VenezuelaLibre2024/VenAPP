package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;

/* loaded from: classes2.dex */
public final class zzfie {
    public static void zza(Context context, boolean z10) {
        String str;
        if (z10) {
            str = "This request is sent from a test device.";
        } else {
            x.b();
            str = "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzcdv.zzy(context) + "\")) to get test ads on this device.";
        }
        zzcec.zzi(str);
    }

    public static void zzb(int i10, Throwable th2, String str) {
        zzcec.zzi("Ad failed to load : " + i10);
        u1.b(str, th2);
        if (i10 == 3) {
            return;
        }
        t.q().zzv(th2, str);
    }
}
