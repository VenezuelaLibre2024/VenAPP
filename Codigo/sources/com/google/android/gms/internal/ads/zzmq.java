package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzmq {
    public final long zza;
    public final zzcx zzb;
    public final int zzc;
    public final zzur zzd;
    public final long zze;
    public final zzcx zzf;
    public final int zzg;
    public final zzur zzh;
    public final long zzi;
    public final long zzj;

    public zzmq(long j10, zzcx zzcxVar, int i10, zzur zzurVar, long j11, zzcx zzcxVar2, int i11, zzur zzurVar2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzcxVar;
        this.zzc = i10;
        this.zzd = zzurVar;
        this.zze = j11;
        this.zzf = zzcxVar2;
        this.zzg = i11;
        this.zzh = zzurVar2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmq.class == obj.getClass()) {
            zzmq zzmqVar = (zzmq) obj;
            if (this.zza == zzmqVar.zza && this.zzc == zzmqVar.zzc && this.zze == zzmqVar.zze && this.zzg == zzmqVar.zzg && this.zzi == zzmqVar.zzi && this.zzj == zzmqVar.zzj && zzfwy.zza(this.zzb, zzmqVar.zzb) && zzfwy.zza(this.zzd, zzmqVar.zzd) && zzfwy.zza(this.zzf, zzmqVar.zzf) && zzfwy.zza(this.zzh, zzmqVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
