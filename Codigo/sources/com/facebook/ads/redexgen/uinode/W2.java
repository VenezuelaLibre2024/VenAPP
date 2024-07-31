package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W2 implements InterfaceC0942Gm {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public C0941Gl[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C0941Gl[] A07;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{100, 104, 40, 19, 24, 5, 13, 24, 30, 9, 24, 25, 93, 28, 17, 17, 18, 30, 28, 9, 20, 18, 19, 71, 93};
    }

    public W2(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public W2(boolean z10, int i10, int i11) {
        AbstractC0955Ha.A03(i10 > 0);
        AbstractC0955Ha.A03(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new C0941Gl[i11 + 100];
        if (i11 > 0) {
            this.A06 = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.A03[i12] = new C0941Gl(this.A06, i12 * i10);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C0941Gl[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i10) {
        boolean targetBufferSizeReduced = i10 < this.A02;
        this.A02 = i10;
        if (targetBufferSizeReduced) {
            AGj();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0942Gm
    public final synchronized C0941Gl A3X() {
        C0941Gl c0941Gl;
        this.A00++;
        int i10 = this.A01;
        if (i10 > 0) {
            C0941Gl[] c0941GlArr = this.A03;
            int i11 = i10 - 1;
            this.A01 = i11;
            c0941Gl = c0941GlArr[i11];
            c0941GlArr[i11] = null;
        } else {
            c0941Gl = new C0941Gl(new byte[this.A04], 0);
        }
        return c0941Gl;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0942Gm
    public final int A7D() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0942Gm
    public final synchronized void AEW(C0941Gl c0941Gl) {
        C0941Gl[] c0941GlArr = this.A07;
        c0941GlArr[0] = c0941Gl;
        AEX(c0941GlArr);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0942Gm
    public final synchronized void AEX(C0941Gl[] c0941GlArr) {
        int i10 = this.A01;
        int length = c0941GlArr.length + i10;
        C0941Gl[] c0941GlArr2 = this.A03;
        if (length >= c0941GlArr2.length) {
            this.A03 = (C0941Gl[]) Arrays.copyOf(c0941GlArr2, Math.max(c0941GlArr2.length * 2, i10 + c0941GlArr.length));
        }
        for (C0941Gl c0941Gl : c0941GlArr) {
            if (c0941Gl.A01 == this.A06 || c0941Gl.A01.length == this.A04) {
                C0941Gl[] c0941GlArr3 = this.A03;
                int i11 = this.A01;
                this.A01 = i11 + 1;
                c0941GlArr3[i11] = c0941Gl;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 110) + System.identityHashCode(c0941Gl.A01) + A00(0, 2, 91) + System.identityHashCode(this.A06) + A00(0, 2, 91) + c0941Gl.A01.length + A00(0, 2, 91) + this.A04);
            }
        }
        this.A00 -= c0941GlArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0942Gm
    public final synchronized void AGj() {
        int A04 = IF.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int highIndex = Math.max(0, A04 - targetAllocationCount);
        int targetAvailableCount = this.A01;
        if (highIndex >= targetAvailableCount) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int i10 = targetAvailableCount - 1;
            while (lowIndex <= i10) {
                C0941Gl highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0941Gl lowAllocation = this.A03[i10];
                    if (lowAllocation.A01 != this.A06) {
                        i10--;
                    } else {
                        C0941Gl[] c0941GlArr = this.A03;
                        c0941GlArr[lowIndex] = lowAllocation;
                        int targetAllocationCount2 = i10 - 1;
                        c0941GlArr[i10] = highAllocation;
                        i10 = targetAllocationCount2;
                        lowIndex++;
                    }
                }
            }
            highIndex = Math.max(highIndex, lowIndex);
            int targetAllocationCount3 = this.A01;
            if (highIndex >= targetAllocationCount3) {
                return;
            }
        }
        Arrays.fill(this.A03, highIndex, this.A01, (Object) null);
        this.A01 = highIndex;
    }
}
