package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzade {
    public static zzby zza(zzacv zzacvVar, boolean z10) {
        zzby zza = new zzadm().zza(zzacvVar, z10 ? null : zzagq.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzadg zzb(zzfp zzfpVar) {
        zzfpVar.zzL(1);
        int zzo = zzfpVar.zzo();
        long zzd = zzfpVar.zzd();
        long j10 = zzo;
        int i10 = zzo / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long zzt = zzfpVar.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = zzt;
            jArr2[i11] = zzfpVar.zzt();
            zzfpVar.zzL(2);
            i11++;
        }
        zzfpVar.zzL((int) ((zzd + j10) - zzfpVar.zzd()));
        return new zzadg(jArr, jArr2);
    }
}
