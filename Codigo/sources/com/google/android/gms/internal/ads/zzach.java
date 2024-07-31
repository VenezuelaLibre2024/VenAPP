package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzach {
    public static void zza(long j10, zzfp zzfpVar, zzaea[] zzaeaVarArr) {
        int i10;
        while (true) {
            if (zzfpVar.zzb() <= 1) {
                return;
            }
            int zzc = zzc(zzfpVar);
            int zzc2 = zzc(zzfpVar);
            int zzd = zzfpVar.zzd() + zzc2;
            if (zzc2 == -1 || zzc2 > zzfpVar.zzb()) {
                zzff.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzd = zzfpVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzm = zzfpVar.zzm();
                int zzq = zzfpVar.zzq();
                if (zzq == 49) {
                    i10 = zzfpVar.zzg();
                    zzq = 49;
                } else {
                    i10 = 0;
                }
                int zzm2 = zzfpVar.zzm();
                if (zzq == 47) {
                    zzfpVar.zzL(1);
                    zzq = 47;
                }
                boolean z10 = zzm == 181 && (zzq == 49 || zzq == 47) && zzm2 == 3;
                if (zzq == 49) {
                    z10 &= i10 == 1195456820;
                }
                if (z10) {
                    zzb(j10, zzfpVar, zzaeaVarArr);
                }
            }
            zzfpVar.zzK(zzd);
        }
    }

    public static void zzb(long j10, zzfp zzfpVar, zzaea[] zzaeaVarArr) {
        int zzm = zzfpVar.zzm();
        if ((zzm & 64) != 0) {
            int i10 = zzm & 31;
            zzfpVar.zzL(1);
            int zzd = zzfpVar.zzd();
            for (zzaea zzaeaVar : zzaeaVarArr) {
                int i11 = i10 * 3;
                zzfpVar.zzK(zzd);
                zzaeaVar.zzr(zzfpVar, i11);
                zzek.zzf(j10 != -9223372036854775807L);
                zzaeaVar.zzt(j10, 1, i11, 0, null);
            }
        }
    }

    private static int zzc(zzfp zzfpVar) {
        int i10 = 0;
        while (zzfpVar.zzb() != 0) {
            int zzm = zzfpVar.zzm();
            i10 += zzm;
            if (zzm != 255) {
                return i10;
            }
        }
        return -1;
    }
}
