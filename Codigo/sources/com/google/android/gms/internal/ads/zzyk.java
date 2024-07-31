package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzyk {
    private final String[] zza;
    private final int[] zzb;
    private final zzws[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzws zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyk(String[] strArr, int[] iArr, zzws[] zzwsVarArr, int[] iArr2, int[][][] iArr3, zzws zzwsVar) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zzwsVarArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zzwsVar;
    }

    public final int zza(int i10, int i11, boolean z10) {
        int i12 = this.zzc[i10].zzb(i11).zzb;
        int[] iArr = new int[1];
        int i13 = 0;
        int i14 = 0;
        for (char c10 = 0; c10 <= 0; c10 = 1) {
            if ((this.zze[i10][i11][0] & 7) == 4) {
                iArr[i14] = 0;
                i14++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        int i15 = 16;
        boolean z11 = false;
        int i16 = 0;
        while (i13 < copyOf.length) {
            String str2 = this.zzc[i10].zzb(i11).zzb(copyOf[i13]).zzm;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z11 |= !zzfy.zzF(str, str2);
            }
            i15 = Math.min(i15, this.zze[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z11 ? Math.min(i15, this.zzd[i10]) : i15;
    }

    public final int zzb(int i10, int i11, int i12) {
        return this.zze[i10][i11][i12];
    }

    public final int zzc(int i10) {
        return this.zzb[i10];
    }

    public final zzws zzd(int i10) {
        return this.zzc[i10];
    }

    public final zzws zze() {
        return this.zzf;
    }
}
