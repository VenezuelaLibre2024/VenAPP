package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
final class zzaid implements zzaii {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaid(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzfy.zzq(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzaid zzb(long j10, zzagv zzagvVar, long j11) {
        int length = zzagvVar.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += zzagvVar.zzb + zzagvVar.zzd[i12];
            j12 += zzagvVar.zzc + zzagvVar.zze[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzaid(jArr, jArr2, j11);
    }

    private static Pair zze(long j10, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int zzc = zzfy.zzc(jArr, j10, true, true);
        long j11 = jArr[zzc];
        long j12 = jArr2[zzc];
        int i10 = zzc + 1;
        if (i10 == jArr.length) {
            valueOf = Long.valueOf(j11);
            valueOf2 = Long.valueOf(j12);
        } else {
            long j13 = jArr[i10];
            long j14 = jArr2[i10];
            double d10 = j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11);
            valueOf = Long.valueOf(j10);
            valueOf2 = Long.valueOf(((long) (d10 * (j14 - j12))) + j12);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzc() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd(long j10) {
        return zzfy.zzq(((Long) zze(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        Pair zze = zze(zzfy.zzt(Math.max(0L, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzadv zzadvVar = new zzadv(zzfy.zzq(((Long) zze.first).longValue()), ((Long) zze.second).longValue());
        return new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
