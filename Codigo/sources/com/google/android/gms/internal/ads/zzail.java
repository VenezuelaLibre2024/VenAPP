package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzail implements zzaii {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzail(long j10, int i10, long j11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = j12;
        this.zze = j12 != -1 ? j10 + j12 : -1L;
    }

    public static zzail zzb(long j10, zzaik zzaikVar, long j11) {
        long j12 = zzaikVar.zzb;
        if (j12 == -1) {
            j12 = -1;
        }
        long zzr = zzfy.zzr((j12 * r7.zzg) - 1, zzaikVar.zza.zzd);
        long j13 = zzaikVar.zzc;
        if (j13 == -1 || zzaikVar.zzf == null) {
            return new zzail(j11, zzaikVar.zza.zzc, zzr, -1L, null);
        }
        if (j10 != -1) {
            long j14 = j11 + j13;
            if (j10 != j14) {
                zzff.zzf("XingSeeker", "XING data size mismatch: " + j10 + ", " + j14);
            }
        }
        return new zzail(j11, zzaikVar.zza.zzc, zzr, zzaikVar.zzc, zzaikVar.zzf);
    }

    private final long zze(int i10) {
        return (this.zzc * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd(long j10) {
        if (!zzh()) {
            return 0L;
        }
        long j11 = j10 - this.zza;
        if (j11 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzf;
        zzek.zzb(jArr);
        double d10 = (j11 * 256.0d) / this.zzd;
        int zzc = zzfy.zzc(jArr, (long) d10, true, true);
        long zze = zze(zzc);
        long j12 = jArr[zzc];
        int i10 = zzc + 1;
        long zze2 = zze(i10);
        return zze + Math.round((j12 == (zzc == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (zze2 - zze));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        if (!zzh()) {
            zzadv zzadvVar = new zzadv(0L, this.zza + this.zzb);
            return new zzads(zzadvVar, zzadvVar);
        }
        long max = Math.max(0L, Math.min(j10, this.zzc));
        double d10 = (max * 100.0d) / this.zzc;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.zzf;
                zzek.zzb(jArr);
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        long j11 = this.zzd;
        zzadv zzadvVar2 = new zzadv(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * j11), j11 - 1)));
        return new zzads(zzadvVar2, zzadvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return this.zzf != null;
    }
}
