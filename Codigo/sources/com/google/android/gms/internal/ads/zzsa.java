package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzsa {
    public static final boolean zza;

    static {
        boolean z10 = false;
        if ("Amazon".equals(zzfy.zzc)) {
            String str = zzfy.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            }
        }
        zza = z10;
    }
}
