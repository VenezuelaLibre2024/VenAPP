package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzvq implements zzwh {
    final /* synthetic */ zzvt zza;
    private final int zzb;

    public zzvq(zzvt zzvtVar, int i10) {
        this.zza = zzvtVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final int zza(zzlb zzlbVar, zzih zzihVar, int i10) {
        return this.zza.zzg(this.zzb, zzlbVar, zzihVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final int zzb(long j10) {
        return this.zza.zzi(this.zzb, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzd() {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
