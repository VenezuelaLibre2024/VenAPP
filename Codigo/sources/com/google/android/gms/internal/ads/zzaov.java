package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
final class zzaov {
    public static Pair zza(zzacv zzacvVar) {
        zzacvVar.zzj();
        zzaou zzd = zzd(1684108385, zzacvVar, new zzfp(8));
        ((zzack) zzacvVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzacvVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaot zzb(zzacv zzacvVar) {
        byte[] bArr;
        zzfp zzfpVar = new zzfp(16);
        zzaou zzd = zzd(1718449184, zzacvVar, zzfpVar);
        zzek.zzf(zzd.zzb >= 16);
        zzack zzackVar = (zzack) zzacvVar;
        zzackVar.zzm(zzfpVar.zzM(), 0, 16, false);
        zzfpVar.zzK(0);
        int zzk = zzfpVar.zzk();
        int zzk2 = zzfpVar.zzk();
        int zzj = zzfpVar.zzj();
        int zzj2 = zzfpVar.zzj();
        int zzk3 = zzfpVar.zzk();
        int zzk4 = zzfpVar.zzk();
        int i10 = ((int) zzd.zzb) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            zzackVar.zzm(bArr2, 0, i10, false);
            bArr = bArr2;
        } else {
            bArr = zzfy.zzf;
        }
        ((zzack) zzacvVar).zzo((int) (zzacvVar.zze() - zzacvVar.zzf()), false);
        return new zzaot(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr);
    }

    public static boolean zzc(zzacv zzacvVar) {
        zzfp zzfpVar = new zzfp(8);
        int i10 = zzaou.zza(zzacvVar, zzfpVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        ((zzack) zzacvVar).zzm(zzfpVar.zzM(), 0, 4, false);
        zzfpVar.zzK(0);
        int zzg = zzfpVar.zzg();
        if (zzg == 1463899717) {
            return true;
        }
        zzff.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
        return false;
    }

    private static zzaou zzd(int i10, zzacv zzacvVar, zzfp zzfpVar) {
        while (true) {
            zzaou zza = zzaou.zza(zzacvVar, zzfpVar);
            int i11 = zza.zza;
            if (i11 == i10) {
                return zza;
            }
            zzff.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i11);
            long j10 = zza.zzb + 8;
            if (j10 > 2147483647L) {
                throw zzcc.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
            }
            ((zzack) zzacvVar).zzo((int) j10, false);
        }
    }
}
