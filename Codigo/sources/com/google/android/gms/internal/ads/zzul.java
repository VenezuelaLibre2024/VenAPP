package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzul extends zzcx {
    private final zzbp zzc;

    public zzul(zzbp zzbpVar) {
        this.zzc = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zza(Object obj) {
        return obj == zzuk.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final zzcu zzd(int i10, zzcu zzcuVar, boolean z10) {
        zzcuVar.zzl(z10 ? 0 : null, z10 ? zzuk.zzd : null, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final zzcw zze(int i10, zzcw zzcwVar, long j10) {
        zzcwVar.zza(zzcw.zza, this.zzc, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzcwVar.zzm = true;
        return zzcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final Object zzf(int i10) {
        return zzuk.zzd;
    }
}
