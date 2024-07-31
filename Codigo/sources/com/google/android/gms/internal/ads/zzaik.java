package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaik {
    public final zzado zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaik(zzado zzadoVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.zza = zzadoVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = i10;
        this.zze = i11;
    }

    public static zzaik zza(zzado zzadoVar, zzfp zzfpVar) {
        long[] jArr;
        int i10;
        int i11;
        int zzg = zzfpVar.zzg();
        int zzp = (zzg & 1) != 0 ? zzfpVar.zzp() : -1;
        long zzu = (zzg & 2) != 0 ? zzfpVar.zzu() : -1L;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = zzfpVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzfpVar.zzL(4);
        }
        if (zzfpVar.zzb() >= 24) {
            zzfpVar.zzL(21);
            int zzo = zzfpVar.zzo();
            i11 = zzo & 4095;
            i10 = zzo >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new zzaik(zzadoVar, zzp, zzu, jArr, i10, i11);
    }
}
