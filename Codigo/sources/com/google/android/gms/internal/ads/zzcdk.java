package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdk {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzcdk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcdk(zzcdj zzcdjVar) {
    }

    public final void zza() {
        long a10 = t.b().a();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) a0.c().zza(zzbgc.zzfX)).longValue() <= a10) {
                    this.zzc = 1;
                }
            }
        }
        long a11 = t.b().a();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = a11;
            }
        }
    }
}
