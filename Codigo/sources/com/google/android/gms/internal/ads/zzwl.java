package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zzwl extends zzcx {
    private static final Object zzc = new Object();
    private static final zzbp zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbp zzh;
    private final zzbf zzi;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("SinglePeriodTimeline");
        zzarVar.zzb(Uri.EMPTY);
        zzd = zzarVar.zzc();
    }

    public zzwl(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, zzbp zzbpVar, zzbf zzbfVar) {
        this.zze = j13;
        this.zzf = j14;
        this.zzg = z10;
        zzbpVar.getClass();
        this.zzh = zzbpVar;
        this.zzi = zzbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
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
        zzek.zza(i10, 0, 1);
        zzcuVar.zzl(null, z10 ? zzc : null, 0, this.zze, 0L, zzd.zza, false);
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final zzcw zze(int i10, zzcw zzcwVar, long j10) {
        zzek.zza(i10, 0, 1);
        Object obj = zzcw.zza;
        zzbp zzbpVar = this.zzh;
        long j11 = this.zzf;
        zzcwVar.zza(obj, zzbpVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, j11, 0, 0, 0L);
        return zzcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final Object zzf(int i10) {
        zzek.zza(i10, 0, 1);
        return zzc;
    }
}