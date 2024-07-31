package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlj {
    public final zzur zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlj(zzur zzurVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        zzek.zzd(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        zzek.zzd(z14);
        this.zza = zzurVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlj.class == obj.getClass()) {
            zzlj zzljVar = (zzlj) obj;
            if (this.zzb == zzljVar.zzb && this.zzc == zzljVar.zzc && this.zzd == zzljVar.zzd && this.zze == zzljVar.zze && this.zzg == zzljVar.zzg && this.zzh == zzljVar.zzh && this.zzi == zzljVar.zzi && zzfy.zzF(this.zza, zzljVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        long j10 = this.zze;
        long j11 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzlj zza(long j10) {
        return j10 == this.zzc ? this : new zzlj(this.zza, this.zzb, j10, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzlj zzb(long j10) {
        return j10 == this.zzb ? this : new zzlj(this.zza, j10, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
