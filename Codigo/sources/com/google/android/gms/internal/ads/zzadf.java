package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzadf implements zzadu {
    private final zzadh zza;
    private final long zzb;

    public zzadf(zzadh zzadhVar, long j10) {
        this.zza = zzadhVar;
        this.zzb = j10;
    }

    private final zzadv zzb(long j10, long j11) {
        return new zzadv((j10 * 1000000) / this.zza.zze, this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        zzek.zzb(this.zza.zzk);
        zzadh zzadhVar = this.zza;
        zzadg zzadgVar = zzadhVar.zzk;
        long[] jArr = zzadgVar.zza;
        long[] jArr2 = zzadgVar.zzb;
        int zzc = zzfy.zzc(jArr, zzadhVar.zzb(j10), true, false);
        zzadv zzb = zzb(zzc == -1 ? 0L : jArr[zzc], zzc != -1 ? jArr2[zzc] : 0L);
        if (zzb.zzb == j10 || zzc == jArr.length - 1) {
            return new zzads(zzb, zzb);
        }
        int i10 = zzc + 1;
        return new zzads(zzb, zzb(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
