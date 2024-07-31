package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EC implements XV {
    public static byte[] A03;
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 75, 29, 9, 25, 2, 107, 47, 42, 63, 42, 107, 56, 34, 49, 46, 107, 38, 34, 56, 38, 42, 63, 40, 35, 113, 107, 0, 52, 36, 63, 5, 51, 51, 61, 51, 36};
    }

    public EC(long[] jArr, long[] jArr2, long j10) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j10;
    }

    public static EC A00(long j10, long j11, By by, C0980Hz c0980Hz) {
        int A0E;
        long j12 = j11;
        c0980Hz.A0Z(10);
        int numFrames = c0980Hz.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = by.A03;
        long A0F = IF.A0F(numFrames, (sampleRate >= 32000 ? 1152 : 576) * 1000000, sampleRate);
        int A0I = c0980Hz.A0I();
        int numFrames2 = c0980Hz.A0I();
        int A0I2 = c0980Hz.A0I();
        c0980Hz.A0Z(2);
        long j13 = j12 + by.A02;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int scale = 0; scale < A0I; scale++) {
            jArr[scale] = (scale * A0F) / A0I;
            jArr2[scale] = Math.max(j12, j13);
            switch (A0I2) {
                case 1:
                    A0E = c0980Hz.A0E();
                    break;
                case 2:
                    A0E = c0980Hz.A0I();
                    break;
                case 3:
                    A0E = c0980Hz.A0G();
                    break;
                case 4:
                    A0E = c0980Hz.A0H();
                    break;
                default:
                    return null;
            }
            j12 += A0E * numFrames2;
        }
        if (j10 != -1 && j10 != j12) {
            Log.w(A01(27, 10, 87), A01(2, 25, 74) + j10 + A01(0, 2, 106) + j12);
        }
        return new EC(jArr, jArr2, A0F);
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j10) {
        int A0B = IF.A0B(this.A02, j10, true, true);
        C2 c22 = new C2(this.A02[A0B], this.A01[A0B]);
        if (c22.A01 < j10) {
            int tableIndex = this.A02.length;
            if (A0B != tableIndex - 1) {
                int tableIndex2 = A0B + 1;
                long j11 = this.A02[tableIndex2];
                int tableIndex3 = A0B + 1;
                C2 nextSeekPoint = new C2(j11, this.A01[tableIndex3]);
                return new C0(c22, nextSeekPoint);
            }
        }
        return new C0(c22);
    }

    @Override // com.facebook.ads.redexgen.uinode.XV
    public final long A88(long j10) {
        return this.A02[IF.A0B(this.A01, j10, true, true)];
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
