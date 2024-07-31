package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzvz implements zzyr {
    public long zza;
    public long zzb;
    public zzyq zzc;
    public zzvz zzd;

    public zzvz(long j10, int i10) {
        zze(j10, 65536);
    }

    public final int zza(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzvz zzb() {
        this.zzc = null;
        zzvz zzvzVar = this.zzd;
        this.zzd = null;
        return zzvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final zzyq zzc() {
        zzyq zzyqVar = this.zzc;
        zzyqVar.getClass();
        return zzyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final zzyr zzd() {
        zzvz zzvzVar = this.zzd;
        if (zzvzVar == null || zzvzVar.zzc == null) {
            return null;
        }
        return zzvzVar;
    }

    public final void zze(long j10, int i10) {
        zzek.zzf(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }
}
