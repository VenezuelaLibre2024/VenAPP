package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzaow implements zzadu {
    private final zzaot zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaow(zzaot zzaotVar, int i10, long j10, long j11) {
        this.zza = zzaotVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / zzaotVar.zzd;
        this.zzd = j12;
        this.zze = zzb(j12);
    }

    private final long zzb(long j10) {
        return zzfy.zzs(j10 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j10) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzadv zzadvVar = new zzadv(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb >= j10 || max == this.zzd - 1) {
            return new zzads(zzadvVar, zzadvVar);
        }
        long j11 = max + 1;
        return new zzads(zzadvVar, new zzadv(zzb(j11), this.zzc + (j11 * this.zza.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
