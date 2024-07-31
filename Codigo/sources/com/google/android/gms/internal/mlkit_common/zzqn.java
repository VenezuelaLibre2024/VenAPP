package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes2.dex */
public final class zzqn {
    private static zzqn zza;

    private zzqn() {
    }

    public static synchronized zzqn zza() {
        zzqn zzqnVar;
        synchronized (zzqn.class) {
            if (zza == null) {
                zza = new zzqn();
            }
            zzqnVar = zza;
        }
        return zzqnVar;
    }

    public static void zzb() {
        zzqm.zza();
    }
}
