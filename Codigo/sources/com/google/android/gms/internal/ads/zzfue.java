package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfue extends zzfuc {
    private static zzfue zzc;

    private zzfue(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfue zzj(Context context) {
        zzfue zzfueVar;
        synchronized (zzfue.class) {
            if (zzc == null) {
                zzc = new zzfue(context);
            }
            zzfueVar = zzc;
        }
        return zzfueVar;
    }

    public final zzfub zzh(long j10, boolean z10) {
        zzfub zzb;
        synchronized (zzfue.class) {
            zzb = zzb(null, null, j10, z10);
        }
        return zzb;
    }

    public final zzfub zzi(String str, String str2, long j10, boolean z10) {
        zzfub zzb;
        synchronized (zzfue.class) {
            zzb = zzb(str, str2, j10, z10);
        }
        return zzb;
    }

    public final void zzk() {
        synchronized (zzfue.class) {
            zzf(false);
        }
    }

    public final void zzl() {
        synchronized (zzfue.class) {
            zzf(true);
        }
    }
}
