package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzabz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private zzabz(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = f10;
        this.zzk = str;
    }

    public static zzabz zza(zzfp zzfpVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        float f10;
        try {
            zzfpVar.zzL(4);
            int zzm = (zzfpVar.zzm() & 3) + 1;
            if (zzm == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzm2 = zzfpVar.zzm() & 31;
            for (int i17 = 0; i17 < zzm2; i17++) {
                arrayList.add(zzb(zzfpVar));
            }
            int zzm3 = zzfpVar.zzm();
            for (int i18 = 0; i18 < zzm3; i18++) {
                arrayList.add(zzb(zzfpVar));
            }
            if (zzm2 > 0) {
                zzgl zze = zzgm.zze((byte[]) arrayList.get(0), zzm + 1, ((byte[]) arrayList.get(0)).length);
                int i19 = zze.zze;
                int i20 = zze.zzf;
                int i21 = zze.zzh + 8;
                int i22 = zze.zzi + 8;
                int i23 = zze.zzj;
                int i24 = zze.zzk;
                int i25 = zze.zzl;
                float f11 = zze.zzg;
                str = zzem.zza(zze.zza, zze.zzb, zze.zzc);
                i15 = i24;
                i16 = i25;
                f10 = f11;
                i12 = i21;
                i13 = i22;
                i14 = i23;
                i10 = i19;
                i11 = i20;
            } else {
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                str = null;
                f10 = 1.0f;
            }
            return new zzabz(arrayList, zzm, i10, i11, i12, i13, i14, i15, i16, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzcc.zza("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzfp zzfpVar) {
        int zzq = zzfpVar.zzq();
        int zzd = zzfpVar.zzd();
        zzfpVar.zzL(zzq);
        return zzem.zzc(zzfpVar.zzM(), zzd, zzq);
    }
}
