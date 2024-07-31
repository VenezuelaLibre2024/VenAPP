package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes2.dex */
public final class zzuj {
    private static zzuj zza;

    private zzuj() {
    }

    public static synchronized zzuj zza() {
        zzuj zzujVar;
        synchronized (zzuj.class) {
            if (zza == null) {
                zza = new zzuj();
            }
            zzujVar = zza;
        }
        return zzujVar;
    }
}
