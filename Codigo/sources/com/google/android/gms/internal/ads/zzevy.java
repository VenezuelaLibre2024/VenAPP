package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzevy implements zzexq {
    private final zzexq zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzevy(zzexq zzexqVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzexqVar;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        com.google.common.util.concurrent.f zzb = this.zza.zzb();
        long j10 = this.zzb;
        if (j10 > 0) {
            zzb = zzgen.zzo(zzb, j10, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgen.zzf(zzb, Throwable.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzevx
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzgen.zzh(null);
            }
        }, zzcep.zzf);
    }
}
