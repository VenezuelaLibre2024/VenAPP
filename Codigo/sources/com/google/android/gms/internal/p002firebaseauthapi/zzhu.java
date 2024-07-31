package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: classes2.dex */
final class zzhu {
    private static final int[] zza = zza(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private static int zza(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            zza(iArr, 0, 4, 8, 12);
            zza(iArr, 1, 5, 9, 13);
            zza(iArr, 2, 6, 10, 14);
            zza(iArr, 3, 7, 11, 15);
            zza(iArr, 0, 5, 10, 15);
            zza(iArr, 1, 6, 11, 12);
            zza(iArr, 2, 7, 8, 13);
            zza(iArr, 3, 4, 9, 14);
        }
    }

    private static void zza(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int zza2 = zza(i14 ^ iArr[i13], 16);
        iArr[i13] = zza2;
        int i15 = iArr[i12] + zza2;
        iArr[i12] = i15;
        int zza3 = zza(iArr[i11] ^ i15, 12);
        iArr[i11] = zza3;
        int i16 = iArr[i10] + zza3;
        iArr[i10] = i16;
        int zza4 = zza(iArr[i13] ^ i16, 8);
        iArr[i13] = zza4;
        int i17 = iArr[i12] + zza4;
        iArr[i12] = i17;
        iArr[i11] = zza(iArr[i11] ^ i17, 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zza;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] zza(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
