package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzacj implements zzadu {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacj(long j10, long j11, int i10, int i11, boolean z10) {
        long zzc;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j10 == -1) {
            this.zzd = -1L;
            zzc = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            zzc = zzc(j10, j11, i10);
        }
        this.zzf = zzc;
    }

    private static long zzc(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j10) {
        return zzc(j10, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        long j11 = this.zzd;
        if (j11 == -1) {
            zzadv zzadvVar = new zzadv(0L, this.zzb);
            return new zzads(zzadvVar, zzadvVar);
        }
        long j12 = this.zzc;
        long j13 = (((this.zze * j10) / 8000000) / j12) * j12;
        if (j11 != -1) {
            j13 = Math.min(j13, j11 - j12);
        }
        long max = this.zzb + Math.max(j13, 0L);
        long zzb = zzb(max);
        zzadv zzadvVar2 = new zzadv(zzb, max);
        if (this.zzd != -1 && zzb < j10) {
            long j14 = max + this.zzc;
            if (j14 < this.zza) {
                return new zzads(zzadvVar2, new zzadv(zzb(j14), j14));
            }
        }
        return new zzads(zzadvVar2, zzadvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
