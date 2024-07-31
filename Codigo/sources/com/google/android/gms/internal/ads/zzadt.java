package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzadt implements zzadu {
    private final long zza;
    private final zzads zzb;

    public zzadt(long j10, long j11) {
        this.zza = j10;
        zzadv zzadvVar = j11 == 0 ? zzadv.zza : new zzadv(0L, j11);
        this.zzb = new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return false;
    }
}
