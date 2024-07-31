package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzaij implements zzaii {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzaij(long[] jArr, long[] jArr2, long j10, long j11) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzaij zzb(long j10, long j11, zzado zzadoVar, zzfp zzfpVar) {
        int zzm;
        zzfpVar.zzL(10);
        int zzg = zzfpVar.zzg();
        if (zzg <= 0) {
            return null;
        }
        int i10 = zzadoVar.zzd;
        long zzs = zzfy.zzs(zzg, (i10 >= 32000 ? 1152 : 576) * 1000000, i10, RoundingMode.FLOOR);
        int zzq = zzfpVar.zzq();
        int zzq2 = zzfpVar.zzq();
        int zzq3 = zzfpVar.zzq();
        zzfpVar.zzL(2);
        long j12 = j11 + zzadoVar.zzc;
        long[] jArr = new long[zzq];
        long[] jArr2 = new long[zzq];
        int i11 = 0;
        long j13 = j11;
        while (i11 < zzq) {
            long j14 = j12;
            long j15 = zzs;
            jArr[i11] = (i11 * zzs) / zzq;
            jArr2[i11] = Math.max(j13, j14);
            if (zzq3 == 1) {
                zzm = zzfpVar.zzm();
            } else if (zzq3 == 2) {
                zzm = zzfpVar.zzq();
            } else if (zzq3 == 3) {
                zzm = zzfpVar.zzo();
            } else {
                if (zzq3 != 4) {
                    return null;
                }
                zzm = zzfpVar.zzp();
            }
            j13 += zzm * zzq2;
            i11++;
            j12 = j14;
            zzq = zzq;
            zzs = j15;
        }
        long j16 = zzs;
        if (j10 != -1 && j10 != j13) {
            zzff.zzf("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new zzaij(jArr, jArr2, j16, j13);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd(long j10) {
        return this.zza[zzfy.zzc(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        long[] jArr = this.zza;
        int zzc = zzfy.zzc(jArr, j10, true, true);
        zzadv zzadvVar = new zzadv(jArr[zzc], this.zzb[zzc]);
        if (zzadvVar.zzb < j10) {
            long[] jArr2 = this.zza;
            if (zzc != jArr2.length - 1) {
                int i10 = zzc + 1;
                return new zzads(zzadvVar, new zzadv(jArr2[i10], this.zzb[i10]));
            }
        }
        return new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
