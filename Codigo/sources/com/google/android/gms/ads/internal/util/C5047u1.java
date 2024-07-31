package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzcec;

/* renamed from: com.google.android.gms.ads.internal.util.u1 */
/* loaded from: classes.dex */
public final class C5047u1 extends zzcec {
    /* renamed from: a */
    public static void m12726a(String str) {
        if (m12728c()) {
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

    /* renamed from: b */
    public static void m12727b(String str, Throwable th2) {
        if (m12728c()) {
            Log.v("Ads", str, th2);
        }
    }

    /* renamed from: c */
    public static boolean m12728c() {
        return zzcec.zzm(2) && ((Boolean) zzbid.zza.zze()).booleanValue();
    }
}
