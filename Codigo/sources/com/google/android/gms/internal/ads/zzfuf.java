package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfuf extends zzfuc {
    private static zzfuf zzc;

    private zzfuf(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfuf zzi(Context context) {
        zzfuf zzfufVar;
        synchronized (zzfuf.class) {
            if (zzc == null) {
                zzc = new zzfuf(context);
            }
            zzfufVar = zzc;
        }
        return zzfufVar;
    }

    public final zzfub zzh(long j10, boolean z10) {
        synchronized (zzfuf.class) {
            if (zzo()) {
                return zzb(null, null, j10, z10);
            }
            return new zzfub();
        }
    }

    public final void zzj() {
        synchronized (zzfuf.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z10) {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z10));
    }

    public final void zzn(boolean z10) {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z10));
        if (z10) {
            return;
        }
        zzj();
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
