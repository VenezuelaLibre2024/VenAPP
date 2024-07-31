package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgm {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        zzek.zzf(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzf(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zzf(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    zzf(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = zzd[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i20 + 1;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    public static zzgj zzc(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i20;
        zzgn zzgnVar = new zzgn(bArr, i10, i11);
        int i21 = 4;
        zzgnVar.zze(4);
        int zza2 = zzgnVar.zza(3);
        zzgnVar.zzd();
        int zza3 = zzgnVar.zza(2);
        boolean zzf = zzgnVar.zzf();
        int zza4 = zzgnVar.zza(5);
        int i22 = 0;
        for (int i23 = 0; i23 < 32; i23++) {
            if (zzgnVar.zzf()) {
                i22 |= 1 << i23;
            }
        }
        int i24 = 6;
        int[] iArr2 = new int[6];
        for (int i25 = 0; i25 < 6; i25++) {
            iArr2[i25] = zzgnVar.zza(8);
        }
        int zza5 = zzgnVar.zza(8);
        int i26 = 0;
        for (int i27 = 0; i27 < zza2; i27++) {
            if (zzgnVar.zzf()) {
                i26 += 89;
            }
            if (zzgnVar.zzf()) {
                i26 += 8;
            }
        }
        zzgnVar.zze(i26);
        if (zza2 > 0) {
            int i28 = 8 - zza2;
            zzgnVar.zze(i28 + i28);
        }
        int zzc2 = zzgnVar.zzc();
        int zzc3 = zzgnVar.zzc();
        if (zzc3 == 3) {
            zzgnVar.zzd();
            zzc3 = 3;
        }
        int zzc4 = zzgnVar.zzc();
        int zzc5 = zzgnVar.zzc();
        if (zzgnVar.zzf()) {
            int zzc6 = zzgnVar.zzc();
            int zzc7 = zzgnVar.zzc();
            int zzc8 = zzgnVar.zzc();
            int zzc9 = zzgnVar.zzc();
            if (zzc3 == 1) {
                i20 = 2;
            } else if (zzc3 == 2) {
                zzc3 = 2;
                i20 = 2;
            } else {
                i20 = 1;
            }
            zzc4 -= i20 * (zzc6 + zzc7);
            zzc5 -= (zzc3 == 1 ? 2 : 1) * (zzc8 + zzc9);
        }
        int i29 = zzc4;
        int i30 = zzc3;
        int i31 = zzc5;
        int zzc10 = zzgnVar.zzc();
        int zzc11 = zzgnVar.zzc();
        int zzc12 = zzgnVar.zzc();
        int i32 = true != zzgnVar.zzf() ? zza2 : 0;
        while (true) {
            zzgnVar.zzc();
            zzgnVar.zzc();
            zzgnVar.zzc();
            if (i32 > zza2) {
                break;
            }
            i32++;
        }
        zzgnVar.zzc();
        zzgnVar.zzc();
        zzgnVar.zzc();
        if (zzgnVar.zzf() && zzgnVar.zzf()) {
            int i33 = 0;
            while (i33 < i21) {
                int i34 = 0;
                while (i34 < i24) {
                    if (zzgnVar.zzf()) {
                        int min = Math.min(64, 1 << ((i33 + i33) + 4));
                        if (i33 > 1) {
                            zzgnVar.zzb();
                        }
                        for (int i35 = 0; i35 < min; i35++) {
                            zzgnVar.zzb();
                        }
                    } else {
                        zzgnVar.zzc();
                    }
                    i34 += i33 == 3 ? 3 : 1;
                    i24 = 6;
                }
                i33++;
                i21 = 4;
                i24 = 6;
            }
        }
        zzgnVar.zze(2);
        if (zzgnVar.zzf()) {
            zzgnVar.zze(8);
            zzgnVar.zzc();
            zzgnVar.zzc();
            zzgnVar.zzd();
        }
        int zzc13 = zzgnVar.zzc();
        int i36 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i37 = -1;
        int i38 = -1;
        int i39 = -1;
        while (i36 < zzc13) {
            if (i36 == 0 || !zzgnVar.zzf()) {
                i16 = zzc13;
                i17 = i22;
                i18 = i30;
                iArr = iArr2;
                int zzc14 = zzgnVar.zzc();
                int zzc15 = zzgnVar.zzc();
                int[] iArr5 = new int[zzc14];
                int i40 = 0;
                while (i40 < zzc14) {
                    iArr5[i40] = (i40 > 0 ? iArr5[i40 - 1] : 0) - (zzgnVar.zzc() + 1);
                    zzgnVar.zzd();
                    i40++;
                }
                int[] iArr6 = new int[zzc15];
                int i41 = 0;
                while (i41 < zzc15) {
                    iArr6[i41] = (i41 > 0 ? iArr6[i41 - 1] : 0) + zzgnVar.zzc() + 1;
                    zzgnVar.zzd();
                    i41++;
                }
                i39 = zzc15;
                iArr4 = iArr6;
                i38 = zzc14;
                iArr3 = iArr5;
            } else {
                int i42 = i38 + i39;
                boolean zzf2 = zzgnVar.zzf();
                int zzc16 = zzgnVar.zzc() + 1;
                int i43 = 1 - ((zzf2 ? 1 : 0) + (zzf2 ? 1 : 0));
                int i44 = i42 + 1;
                i16 = zzc13;
                boolean[] zArr = new boolean[i44];
                iArr = iArr2;
                for (int i45 = 0; i45 <= i42; i45++) {
                    if (zzgnVar.zzf()) {
                        zArr[i45] = true;
                    } else {
                        zArr[i45] = zzgnVar.zzf();
                    }
                }
                int i46 = i39 - 1;
                int[] iArr7 = new int[i44];
                int[] iArr8 = new int[i44];
                int i47 = 0;
                while (true) {
                    i19 = i43 * zzc16;
                    if (i46 < 0) {
                        break;
                    }
                    int i48 = iArr4[i46] + i19;
                    if (i48 < 0 && zArr[i38 + i46]) {
                        iArr7[i47] = i48;
                        i47++;
                    }
                    i46--;
                }
                if (i19 < 0 && zArr[i42]) {
                    iArr7[i47] = i19;
                    i47++;
                }
                i17 = i22;
                i18 = i30;
                int i49 = i47;
                for (int i50 = 0; i50 < i38; i50++) {
                    int i51 = iArr3[i50] + i19;
                    if (i51 < 0 && zArr[i50]) {
                        iArr7[i49] = i51;
                        i49++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr7, i49);
                int i52 = 0;
                for (int i53 = i38 - 1; i53 >= 0; i53--) {
                    int i54 = iArr3[i53] + i19;
                    if (i54 > 0 && zArr[i53]) {
                        iArr8[i52] = i54;
                        i52++;
                    }
                }
                if (i19 > 0 && zArr[i42]) {
                    iArr8[i52] = i19;
                    i52++;
                }
                int i55 = i52;
                for (int i56 = 0; i56 < i39; i56++) {
                    int i57 = iArr4[i56] + i19;
                    if (i57 > 0 && zArr[i38 + i56]) {
                        iArr8[i55] = i57;
                        i55++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr8, i55);
                i39 = i55;
                iArr3 = copyOf;
                i38 = i49;
            }
            i36++;
            i30 = i18;
            i22 = i17;
            zzc13 = i16;
            iArr2 = iArr;
        }
        int i58 = i22;
        int i59 = i30;
        int[] iArr9 = iArr2;
        if (zzgnVar.zzf()) {
            int zzc17 = zzgnVar.zzc();
            for (int i60 = 0; i60 < zzc17; i60++) {
                zzgnVar.zze(zzc12 + 5);
            }
        }
        zzgnVar.zze(2);
        float f10 = 1.0f;
        if (zzgnVar.zzf()) {
            if (zzgnVar.zzf()) {
                int zza6 = zzgnVar.zza(8);
                if (zza6 == 255) {
                    int zza7 = zzgnVar.zza(16);
                    int zza8 = zzgnVar.zza(16);
                    if (zza7 != 0 && zza8 != 0) {
                        f10 = zza7 / zza8;
                    }
                } else if (zza6 < 17) {
                    f10 = zzb[zza6];
                } else {
                    zzff.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza6);
                }
            }
            if (zzgnVar.zzf()) {
                zzgnVar.zzd();
            }
            if (zzgnVar.zzf()) {
                zzgnVar.zze(3);
                int i61 = true != zzgnVar.zzf() ? 2 : 1;
                if (zzgnVar.zzf()) {
                    int zza9 = zzgnVar.zza(8);
                    int zza10 = zzgnVar.zza(8);
                    zzgnVar.zze(8);
                    int zza11 = zzt.zza(zza9);
                    i15 = zzt.zzb(zza10);
                    i13 = zza11;
                } else {
                    i13 = -1;
                    i15 = -1;
                }
                i37 = i61;
            } else {
                i13 = -1;
                i15 = -1;
            }
            if (zzgnVar.zzf()) {
                zzgnVar.zzc();
                zzgnVar.zzc();
            }
            zzgnVar.zzd();
            if (zzgnVar.zzf()) {
                i31 += i31;
            }
            i14 = i15;
            i12 = i31;
        } else {
            i12 = i31;
            i13 = -1;
            i14 = -1;
        }
        return new zzgj(zza3, zzf, zza4, i58, i59, zzc10, zzc11, iArr9, zza5, zzc2, i29, i12, f10, i13, i37, i14);
    }

    public static zzgk zzd(byte[] bArr, int i10, int i11) {
        zzgn zzgnVar = new zzgn(bArr, 4, i11);
        int zzc2 = zzgnVar.zzc();
        int zzc3 = zzgnVar.zzc();
        zzgnVar.zzd();
        return new zzgk(zzc2, zzc3, zzgnVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgl zze(byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zze(byte[], int, int):com.google.android.gms.internal.ads.zzgl");
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
