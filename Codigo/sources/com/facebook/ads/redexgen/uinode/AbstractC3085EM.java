package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.EM */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3085EM implements InterfaceC4293Y5, InterfaceC2846AA {
    public static byte[] A09;
    public static String[] A0A = {"9qnQyWyVOy7Yt1e5kI69WFnVp2gMy1V", "BpqCVyh3b", "BBu5XuJM3kgxNsyZ7X9f0tLDZOMhAb0I", "70xG0YQvSL9bnkI9uxU7IiqBWrnzW1xT", "FprTHacbfyfVlL7HNnWkMu7r", "uMfJClZk5qH56MPpWubSpXt", "rGQzHUHjzvUiqILZEsrKwpyReixzpim3", "VNUv5nSJy2Heuf3XsCr3Vyrq4xzGHGIU"};
    public int A00;
    public int A01;
    public long A02;
    public C2847AB A03;
    public InterfaceC3136FB A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public static String A0w(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            String[] strArr = A0A;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "sONUtG9kcKy8d61ZBFdh1qYmD6uC6oh7";
            strArr2[6] = "okSWHoPOYn7Fcc6ZCgaoehlpub0ImFoA";
            copyOfRange[i13] = (byte) (i14 ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A0x() {
        A09 = new byte[]{52, 54, 57, 22, 52, 38, 34, 62, 37, 50, 4, 50, 36, 36, 62, 56, 57};
    }

    public abstract void A15();

    public abstract void A16(long j10, boolean z10) throws C28139c;

    static {
        A0x();
    }

    public AbstractC3085EM(int i10) {
        this.A08 = i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<?> */
    public static boolean A0y(InterfaceC2934Bc<?> interfaceC2934Bc, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (interfaceC2934Bc == null) {
            return false;
        }
        throw new NullPointerException(A0w(0, 17, 120));
    }

    public final int A0z() {
        return this.A00;
    }

    public final int A10(long j10) {
        return this.A04.AGO(j10 - this.A02);
    }

    public final int A11(C28259p c28259p, C4279Xr c4279Xr, boolean z10) {
        int AEK = this.A04.AEK(c28259p, c4279Xr, z10);
        if (AEK == -4) {
            if (c4279Xr.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            c4279Xr.A00 += this.A02;
        } else if (AEK == -5) {
            Format format = c28259p.A00;
            if (format.A0G != Long.MAX_VALUE) {
                c28259p.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return AEK;
    }

    public final C2847AB A12() {
        return this.A03;
    }

    public void A13() throws C28139c {
    }

    public void A14() throws C28139c {
    }

    public void A17(boolean z10) throws C28139c {
    }

    public void A18(Format[] formatArr, long j10) throws C28139c {
    }

    public final boolean A19() {
        return this.A05 ? this.A06 : this.A04.A9C();
    }

    public final Format[] A1A() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final void A58() {
        AbstractC3281Ha.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A15();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final void A5V(C2847AB c2847ab, Format[] formatArr, InterfaceC3136FB interfaceC3136FB, long j10, boolean z10, long j11) throws C28139c {
        AbstractC3281Ha.A04(this.A01 == 0);
        this.A03 = c2847ab;
        this.A01 = 1;
        A17(z10);
        AFD(formatArr, interfaceC3136FB, j11);
        A16(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final InterfaceC2846AA A6I() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public InterfaceC3297Hq A7N() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final int A81() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final InterfaceC3136FB A84() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5, com.facebook.ads.redexgen.uinode.InterfaceC2846AA
    public final int A8C() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2843A7
    public void A8V(int i10, Object obj) throws C28139c {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final boolean A8a() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final boolean A8y() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final void AAP() throws IOException {
        this.A04.AAM();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final void AFD(Format[] formatArr, InterfaceC3136FB interfaceC3136FB, long j10) throws C28139c {
        AbstractC3281Ha.A04(!this.A06);
        this.A04 = interfaceC3136FB;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j10;
        A18(formatArr, j10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final void AFN(long j10) throws C28139c {
        this.A06 = false;
        this.A05 = false;
        A16(j10, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final void AFy() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final void AG2(int i10) {
        this.A00 = i10;
    }

    public int AGg() throws C28139c {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final void start() throws C28139c {
        AbstractC3281Ha.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final void stop() throws C28139c {
        AbstractC3281Ha.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
