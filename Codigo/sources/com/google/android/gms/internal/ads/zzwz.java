package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzwz extends zzxb {
    private final zzyw zzd;
    private final zzgaa zze;
    private final zzel zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzwz(zzcz zzczVar, int[] iArr, int i10, zzyw zzywVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzel zzelVar) {
        super(zzczVar, iArr, 0);
        this.zzd = zzywVar;
        this.zze = zzgaa.zzj(list);
        this.zzf = zzelVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ zzgaa zzf(zzyh[] zzyhVarArr) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 2;
            i11 = 1;
            if (i13 >= 2) {
                break;
            }
            zzyh zzyhVar = zzyhVarArr[i13];
            if (zzyhVar == null || zzyhVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfzx zzfzxVar = new zzfzx();
                zzfzxVar.zzf(new zzwx(0L, 0L));
                arrayList.add(zzfzxVar);
            }
            i13++;
        }
        long[][] jArr = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            zzyh zzyhVar2 = zzyhVarArr[i14];
            if (zzyhVar2 == null) {
                jArr[i14] = new long[0];
            } else {
                jArr[i14] = new long[zzyhVar2.zzb.length];
                int i15 = 0;
                while (true) {
                    int[] iArr = zzyhVar2.zzb;
                    if (i15 >= iArr.length) {
                        break;
                    }
                    long j10 = zzyhVar2.zza.zzb(iArr[i15]).zzi;
                    long[] jArr2 = jArr[i14];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i15] = j10;
                    i15++;
                }
                Arrays.sort(jArr[i14]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i16 = 0; i16 < 2; i16++) {
            long[] jArr4 = jArr[i16];
            jArr3[i16] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzgal zza = zzgbe.zzc(zzgbj.zzc()).zzb(2).zza();
        int i17 = 0;
        while (i17 < i10) {
            int length = jArr[i17].length;
            if (length > i11) {
                double[] dArr = new double[length];
                int i18 = i12;
                while (true) {
                    long[] jArr5 = jArr[i17];
                    double d10 = 0.0d;
                    if (i18 >= jArr5.length) {
                        break;
                    }
                    long j11 = jArr5[i18];
                    if (j11 != -1) {
                        d10 = Math.log(j11);
                    }
                    dArr[i18] = d10;
                    i18++;
                }
                int i19 = length - 1;
                double d11 = dArr[i19] - dArr[i12];
                int i20 = i12;
                while (i20 < i19) {
                    double d12 = dArr[i20];
                    i20++;
                    zza.zzq(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i20]) * 0.5d) - dArr[i12]) / d11), Integer.valueOf(i17));
                    i12 = 0;
                }
            }
            i17++;
            i12 = 0;
            i10 = 2;
            i11 = 1;
        }
        zzgaa zzj = zzgaa.zzj(zza.zzr());
        for (int i21 = 0; i21 < zzj.size(); i21++) {
            int intValue = ((Integer) zzj.get(i21)).intValue();
            int i22 = iArr2[intValue] + 1;
            iArr2[intValue] = i22;
            jArr3[intValue] = jArr[intValue][i22];
            zzg(arrayList, jArr3);
        }
        for (int i23 = 0; i23 < 2; i23++) {
            if (arrayList.get(i23) != null) {
                long j12 = jArr3[i23];
                jArr3[i23] = j12 + j12;
            }
        }
        zzg(arrayList, jArr3);
        zzfzx zzfzxVar2 = new zzfzx();
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            zzfzx zzfzxVar3 = (zzfzx) arrayList.get(i24);
            zzfzxVar2.zzf(zzfzxVar3 == null ? zzgaa.zzl() : zzfzxVar3.zzi());
        }
        return zzfzxVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzfzx zzfzxVar = (zzfzx) list.get(i11);
            if (zzfzxVar != null) {
                zzfzxVar.zzf(new zzwx(j10, jArr[i11]));
            }
        }
    }
}