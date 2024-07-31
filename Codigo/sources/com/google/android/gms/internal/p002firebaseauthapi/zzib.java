package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzib {
    private static long zza(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & KeyboardMap.kValueMask;
    }

    private static long zza(byte[] bArr, int i10, int i11) {
        return (zza(bArr, i10) >> i11) & 67108863;
    }

    private static void zza(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long zza = zza(bArr, 0, 0) & 67108863;
        int i10 = 3;
        long zza2 = zza(bArr, 3, 2) & 67108611;
        long zza3 = zza(bArr, 6, 4) & 67092735;
        long zza4 = zza(bArr, 9, 6) & 66076671;
        long zza5 = zza(bArr, 12, 8) & 1048575;
        long j10 = zza2 * 5;
        long j11 = zza3 * 5;
        long j12 = zza4 * 5;
        long j13 = zza5 * 5;
        int i11 = 17;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i12 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i12 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i12);
            System.arraycopy(bArr2, i12, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i11, (byte) 0);
            }
            long zza6 = j18 + zza(bArr3, 0, 0);
            long zza7 = j14 + zza(bArr3, i10, 2);
            long zza8 = j15 + zza(bArr3, 6, 4);
            long zza9 = j16 + zza(bArr3, 9, 6);
            long zza10 = j17 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
            long j19 = (zza6 * zza) + (zza7 * j13) + (zza8 * j12) + (zza9 * j11) + (zza10 * j10);
            long j20 = (zza6 * zza2) + (zza7 * zza) + (zza8 * j13) + (zza9 * j12) + (zza10 * j11);
            long j21 = (zza6 * zza3) + (zza7 * zza2) + (zza8 * zza) + (zza9 * j13) + (zza10 * j12);
            long j22 = (zza6 * zza4) + (zza7 * zza3) + (zza8 * zza2) + (zza9 * zza) + (zza10 * j13);
            long j23 = j20 + (j19 >> 26);
            long j24 = j21 + (j23 >> 26);
            long j25 = j22 + (j24 >> 26);
            long j26 = (zza6 * zza5) + (zza7 * zza4) + (zza8 * zza3) + (zza9 * zza2) + (zza10 * zza) + (j25 >> 26);
            long j27 = (j19 & 67108863) + ((j26 >> 26) * 5);
            j14 = (j23 & 67108863) + (j27 >> 26);
            i12 += 16;
            j15 = j24 & 67108863;
            j16 = j25 & 67108863;
            j17 = j26 & 67108863;
            i11 = 17;
            i10 = 3;
            j18 = j27 & 67108863;
        }
        long j28 = j15 + (j14 >> 26);
        long j29 = j28 & 67108863;
        long j30 = j16 + (j28 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j17 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j18 + ((j32 >> 26) * 5);
        long j35 = j34 & 67108863;
        long j36 = (j14 & 67108863) + (j34 >> 26);
        long j37 = j35 + 5;
        long j38 = j37 & 67108863;
        long j39 = (j37 >> 26) + j36;
        long j40 = j29 + (j39 >> 26);
        long j41 = j31 + (j40 >> 26);
        long j42 = (j33 + (j41 >> 26)) - 67108864;
        long j43 = j42 >> 63;
        long j44 = ~j43;
        long j45 = (j36 & j43) | (j39 & 67108863 & j44);
        long j46 = (j29 & j43) | (j40 & 67108863 & j44);
        long j47 = (j31 & j43) | (j41 & 67108863 & j44);
        long j48 = ((j45 << 26) | (j35 & j43) | (j38 & j44)) & KeyboardMap.kValueMask;
        long j49 = ((j45 >> 6) | (j46 << 20)) & KeyboardMap.kValueMask;
        long j50 = ((j46 >> 12) | (j47 << 14)) & KeyboardMap.kValueMask;
        long j51 = ((((j42 & j44) | (j33 & j43)) << 8) | (j47 >> 18)) & KeyboardMap.kValueMask;
        long zza11 = j48 + zza(bArr, 16);
        long j52 = zza11 & KeyboardMap.kValueMask;
        long zza12 = j49 + zza(bArr, 20) + (zza11 >> 32);
        long j53 = zza12 & KeyboardMap.kValueMask;
        long zza13 = j50 + zza(bArr, 24) + (zza12 >> 32);
        long j54 = zza13 & KeyboardMap.kValueMask;
        long zza14 = (j51 + zza(bArr, 28) + (zza13 >> 32)) & KeyboardMap.kValueMask;
        byte[] bArr4 = new byte[16];
        zza(bArr4, j52, 0);
        zza(bArr4, j53, 4);
        zza(bArr4, j54, 8);
        zza(bArr4, zza14, 12);
        return bArr4;
    }
}
