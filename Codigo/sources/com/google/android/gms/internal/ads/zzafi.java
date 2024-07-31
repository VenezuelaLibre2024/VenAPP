package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzafi implements zzacu {
    private final zzfp zza = new zzfp(4);
    private final zzadw zzb = new zzadw(-1, -1, "image/heif");

    private final boolean zza(zzacv zzacvVar, int i10) {
        this.zza.zzH(4);
        ((zzack) zzacvVar).zzm(this.zza.zzM(), 0, 4, false);
        return this.zza.zzu() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) {
        return this.zzb.zzb(zzacvVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzb.zzc(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        this.zzb.zzd(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        ((zzack) zzacvVar).zzl(4, false);
        return zza(zzacvVar, 1718909296) && zza(zzacvVar, 1751476579);
    }
}
