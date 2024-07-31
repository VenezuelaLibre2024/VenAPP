package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaox implements zzacu {
    private final zzfp zza = new zzfp(4);
    private final zzadw zzb = new zzadw(-1, -1, "image/webp");

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
        this.zza.zzH(4);
        zzack zzackVar = (zzack) zzacvVar;
        zzackVar.zzm(this.zza.zzM(), 0, 4, false);
        if (this.zza.zzu() == 1380533830) {
            zzackVar.zzl(4, false);
            this.zza.zzH(4);
            zzackVar.zzm(this.zza.zzM(), 0, 4, false);
            if (this.zza.zzu() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
