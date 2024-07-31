package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zzar {
    private static final zzbf zza;

    static {
        zzbf zzaqVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzaqVar = new zzap();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzaqVar = new zzaq();
        }
        zza = zzaqVar;
    }

    public static zzbf zza() {
        return zza;
    }
}
