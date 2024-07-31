package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzwo implements zzwh {
    private final zzwh zza;
    private final long zzb;

    public zzwo(zzwh zzwhVar, long j10) {
        this.zza = zzwhVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final int zza(zzlb zzlbVar, zzih zzihVar, int i10) {
        int zza = this.zza.zza(zzlbVar, zzihVar, i10);
        if (zza != -4) {
            return zza;
        }
        zzihVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final int zzb(long j10) {
        return this.zza.zzb(j10 - this.zzb);
    }

    public final zzwh zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zze() {
        return this.zza.zze();
    }
}
