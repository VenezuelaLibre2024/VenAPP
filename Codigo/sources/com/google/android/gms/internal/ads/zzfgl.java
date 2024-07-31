package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzfgl {
    private final la.f zza;
    private final Object zzb = new Object();
    private volatile int zzd = 1;
    private volatile long zzc = 0;

    public zzfgl(la.f fVar) {
        this.zza = fVar;
    }

    private final void zze() {
        long a10 = this.zza.a();
        synchronized (this.zzb) {
            if (this.zzd == 3) {
                if (this.zzc + ((Long) a0.c().zza(zzbgc.zzfX)).longValue() <= a10) {
                    this.zzd = 1;
                }
            }
        }
    }

    private final void zzf(int i10, int i11) {
        zze();
        Object obj = this.zzb;
        long a10 = this.zza.a();
        synchronized (obj) {
            if (this.zzd != i10) {
                return;
            }
            this.zzd = i11;
            if (this.zzd == 3) {
                this.zzc = a10;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z10) {
        if (z10) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzb) {
            zze();
            z10 = this.zzd == 3;
        }
        return z10;
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zzb) {
            zze();
            z10 = this.zzd == 2;
        }
        return z10;
    }
}
