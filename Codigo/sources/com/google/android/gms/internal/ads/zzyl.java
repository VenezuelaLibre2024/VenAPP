package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzyl extends zzyo {
    private zzyk zza;

    protected abstract Pair zzc(zzyk zzykVar, int[][][] iArr, int[] iArr2, zzur zzurVar, zzcx zzcxVar);

    @Override // com.google.android.gms.internal.ads.zzyo
    public final zzyp zzp(zzmh[] zzmhVarArr, zzws zzwsVar, zzur zzurVar, zzcx zzcxVar) {
        boolean z10;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcz[][] zzczVarArr = new zzcz[3];
        int[][][] iArr3 = new int[3][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzwsVar.zzc;
            zzczVarArr[i10] = new zzcz[i11];
            iArr3[i10] = new int[i11];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzmhVarArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zzwsVar.zzc) {
            zzcz zzb = zzwsVar.zzb(i14);
            int i15 = zzb.zzd;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < i12) {
                zzmh zzmhVar = zzmhVarArr[i17];
                int i19 = 0;
                for (int i20 = 0; i20 <= 0; i20++) {
                    i19 = Math.max(i19, zzmhVar.zzX(zzb.zzb(i20)) & 7);
                }
                boolean z12 = iArr2[i17] == 0;
                if (i19 > i18) {
                    z11 = z12;
                    i16 = i17;
                    i18 = i19;
                } else if (i19 == i18 && i15 == 5 && !z11 && z12) {
                    i16 = i17;
                    i18 = i19;
                    z11 = true;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[1];
            } else {
                zzmh zzmhVar2 = zzmhVarArr[i16];
                int[] iArr5 = new int[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr5[i21] = zzmhVar2.zzX(zzb.zzb(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i16];
            zzczVarArr[i16][i22] = zzb;
            iArr3[i16][i22] = iArr;
            iArr2[i16] = i22 + 1;
            i14++;
            i12 = 2;
        }
        zzws[] zzwsVarArr = new zzws[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i23 = 0;
        while (i23 < i12) {
            int i24 = iArr2[i23];
            zzwsVarArr[i23] = new zzws((zzcz[]) zzfy.zzL(zzczVarArr[i23], i24));
            iArr3[i23] = (int[][]) zzfy.zzL(iArr3[i23], i24);
            strArr[i23] = zzmhVarArr[i23].zzT();
            iArr6[i23] = zzmhVarArr[i23].zzbj();
            i23++;
            i12 = 2;
        }
        int i25 = i12;
        zzyk zzykVar = new zzyk(strArr, iArr6, zzwsVarArr, iArr4, iArr3, new zzws((zzcz[]) zzfy.zzL(zzczVarArr[i25], iArr2[i25])));
        Pair zzc = zzc(zzykVar, iArr3, iArr4, zzurVar, zzcxVar);
        zzym[] zzymVarArr = (zzym[]) zzc.second;
        List[] listArr = new List[zzymVarArr.length];
        for (int i26 = 0; i26 < zzymVarArr.length; i26++) {
            zzym zzymVar = zzymVarArr[i26];
            listArr[i26] = zzymVar != null ? zzgaa.zzm(zzymVar) : zzgaa.zzl();
        }
        zzfzx zzfzxVar = new zzfzx();
        for (int i27 = 0; i27 < 2; i27++) {
            zzws zzd = zzykVar.zzd(i27);
            List list = listArr[i27];
            for (int i28 = 0; i28 < zzd.zzc; i28++) {
                zzcz zzb2 = zzd.zzb(i28);
                boolean z13 = zzykVar.zza(i27, i28, false) != 0;
                int i29 = zzb2.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i30 = 0; i30 <= 0; i30++) {
                    iArr7[i30] = zzykVar.zzb(i27, i28, i30) & 7;
                    int i31 = 0;
                    while (true) {
                        if (i31 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        zzym zzymVar2 = (zzym) list.get(i31);
                        if (zzymVar2.zze().equals(zzb2) && zzymVar2.zzb(i30) != -1) {
                            z10 = true;
                            break;
                        }
                        i31++;
                    }
                    zArr[i30] = z10;
                }
                zzfzxVar.zzf(new zzdj(zzb2, z13, iArr7, zArr));
            }
        }
        zzws zze = zzykVar.zze();
        for (int i32 = 0; i32 < zze.zzc; i32++) {
            zzcz zzb3 = zze.zzb(i32);
            int i33 = zzb3.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfzxVar.zzf(new zzdj(zzb3, false, iArr8, new boolean[1]));
        }
        return new zzyp((zzmi[]) zzc.first, (zzyi[]) zzc.second, new zzdk(zzfzxVar.zzi()), zzykVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    public final void zzq(Object obj) {
        this.zza = (zzyk) obj;
    }
}
