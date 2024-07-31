package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class u1 extends zzcec {
    public static void a(String str) {
        if (c()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : zzcec.zza.zzd(str)) {
                if (z10) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void b(String str, Throwable th2) {
        if (c()) {
            Log.v("Ads", str, th2);
        }
    }

    public static boolean c() {
        return zzcec.zzm(2) && ((Boolean) zzbid.zza.zze()).booleanValue();
    }
}
