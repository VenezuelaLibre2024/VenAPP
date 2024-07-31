package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xo */
/* loaded from: assets/audience_network.dex */
public final class C4276Xo implements InterfaceC2959C1 {
    public static byte[] A06;
    public static String[] A07 = {"HjdDham6vZahXcTgWUbgEUyOKT1h9oJK", "zmqCaLmLP1EpiJCwLkXvkq6", "CCbuEfBP0uWpi7Hb1GvcX1U", "o4gQJY", "SL8jfjRVMuAieuHRUGCaPmGht5z7gRIo", "vKspY8ykEL6aMh62Xj5Lb9b4d0l6Zd9e", "qubnoWgXtnI1btvkRUNPdfYA8lWuJej8", "m2UxGDvrz36qppfZRjFAvHiLdTY4MpZ4"};
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[4].charAt(10) != 'A') {
                throw new RuntimeException();
            }
            A07[4] = "JIPli7exaIAIPM4JFFKoxJbhk98Su8Fy";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 64);
            i13++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-102, -67, -79, -11, 6, 3, -14, 5, -6, 0, -1, 4, -26, 4, -50, -115, -127, -48, -57, -57, -44, -58, -43, -44, -98, -44, -56, 27, 17, 34, 13, 27, -27, -60, -72, 12, 1, 5, -3, -19, 11, -43, -83, -46, -33, -40, -43, -77, -40, -50, -49, -30, -110, -42, -49, -40, -47, -34, -46, -89};
    }

    static {
        A02();
    }

    public C4276Xo(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            this.A05 = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j10) {
        return AbstractC3322IF.A0B(this.A04, j10, true, true);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final long A6r() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final C2958C0 A7t(long j10) {
        int A00 = A00(j10);
        C2960C2 c2960c2 = new C2960C2(this.A04[A00], this.A03[A00]);
        if (c2960c2.A01 < j10) {
            int chunkIndex = this.A00;
            if (A00 != chunkIndex - 1) {
                int chunkIndex2 = A00 + 1;
                long j11 = this.A04[chunkIndex2];
                int chunkIndex3 = A00 + 1;
                C2960C2 seekPoint = new C2960C2(j11, this.A03[chunkIndex3]);
                return new C2958C0(c2960c2, seekPoint);
            }
        }
        return new C2958C0(c2960c2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final boolean A9I() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 42) + this.A00 + A01(25, 8, 104) + Arrays.toString(this.A01) + A01(15, 10, 33) + Arrays.toString(this.A03) + A01(33, 9, 88) + Arrays.toString(this.A04) + A01(1, 14, 81) + Arrays.toString(this.A02) + A01(0, 1, 49);
    }
}
