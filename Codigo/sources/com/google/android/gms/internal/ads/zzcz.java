package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzcz {
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzam[] zzg;
    private int zzh;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);

    @Deprecated
    public static final zzn zza = zzcy.zza;

    public zzcz(String str, zzam... zzamVarArr) {
        this.zzc = str;
        this.zzg = zzamVarArr;
        int zzb = zzcb.zzb(zzamVarArr[0].zzm);
        this.zzd = zzb == -1 ? zzcb.zzb(zzamVarArr[0].zzl) : zzb;
        zzd(zzamVarArr[0].zzd);
        int i10 = zzamVarArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zze(String str, String str2, String str3, int i10) {
        zzff.zzd("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcz.class == obj.getClass()) {
            zzcz zzczVar = (zzcz) obj;
            if (this.zzc.equals(zzczVar.zzc) && Arrays.equals(this.zzg, zzczVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = ((this.zzc.hashCode() + 527) * 31) + Arrays.hashCode(this.zzg);
        this.zzh = hashCode;
        return hashCode;
    }

    public final int zza(zzam zzamVar) {
        for (int i10 = 0; i10 <= 0; i10++) {
            if (zzamVar == this.zzg[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final zzam zzb(int i10) {
        return this.zzg[i10];
    }

    public final zzcz zzc(String str) {
        return new zzcz(str, this.zzg);
    }
}
