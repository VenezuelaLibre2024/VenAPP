package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network.dex */
public final class WO implements C4 {
    public static String[] A0F = {"J778k2tN1A71aNteuaiayf8W9Cwuw9", "SddvXAFvjaaaNZPS5hBFE72C4u8NAkzU", "DlS6L0Rs4yOHZbnixJzGuxf7gpgZ1", "jQlCDwUBXdtP", "ybgFHcAQFxf90xR6S9k4k72uXmSANsHZ", "TXMpPdQfareL1guTNfB0PsKfFvbJoTHv", "R2X9ywuliv1XsGmKXBlkokivcnsZ5nAf", "17XTwjN4yTPZEt52JUGlNgZMXTvW6CfX"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public F9 A04;
    public F9 A05;
    public F9 A06;
    public FA A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final F7 A0B;
    public final F8 A0C;
    public final InterfaceC0942Gm A0D;
    public final C0980Hz A0E;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A07(C1377Xr c1377Xr, F7 f72) {
        int i10;
        long j10 = f72.A01;
        this.A0E.A0W(1);
        A06(j10, this.A0E.A00, 1);
        long j11 = j10 + 1;
        byte b10 = this.A0E.A00[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        if (c1377Xr.A02.A04 == null) {
            c1377Xr.A02.A04 = new byte[16];
        }
        A06(j11, c1377Xr.A02.A04, i11);
        long j12 = j11 + i11;
        if (z10) {
            this.A0E.A0W(2);
            A06(j12, this.A0E.A00, 2);
            j12 += 2;
            i10 = this.A0E.A0I();
        } else {
            i10 = 1;
            if (A0F[4].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[7] = "qfwCamou4xH4TsJy70kUYaPJ1paRPrQS";
            strArr[6] = "GMGbKrn5SK4TcHFeKaSIsaM2NwTeIDah";
        }
        int[] iArr = c1377Xr.A02.A06;
        if (iArr == null || iArr.length < i10) {
            iArr = new int[i10];
        }
        int[] iArr2 = c1377Xr.A02.A07;
        if (A0F[1].charAt(27) == 'T') {
            throw new RuntimeException();
        }
        A0F[3] = "l74rmj1cvzMl";
        if (iArr2 == null || iArr2.length < i10) {
            iArr2 = new int[i10];
            if (A0F[3].length() != 12) {
                A0F[5] = "mTjJh6O10GTQKtsNTzpZkGXCEgBidJyY";
            } else {
                String[] strArr2 = A0F;
                strArr2[2] = "gGnYbSzqov18WRGS84osGLTli7oQ4";
                strArr2[0] = "bcZjTvBd8pDqGicoFFRFmeT3NfcxuZ";
            }
        }
        if (z10) {
            int i12 = i10 * 6;
            this.A0E.A0W(i12);
            A06(j12, this.A0E.A00, i12);
            j12 += i12;
            this.A0E.A0Y(0);
            for (int i13 = 0; i13 < i10; i13++) {
                iArr[i13] = this.A0E.A0I();
                iArr2[i13] = this.A0E.A0H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = f72.A00 - ((int) (j12 - f72.A01));
        }
        C3 c32 = f72.A02;
        c1377Xr.A02.A03(i10, iArr, iArr2, c32.A03, c1377Xr.A02.A04, c32.A01, c32.A02, c32.A00);
        int i14 = (int) (j12 - f72.A01);
        f72.A01 += i14;
        f72.A00 -= i14;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void AFS(long j10, int i10, int i11, int i12, C3 c32) {
        if (this.A08) {
            A5n(this.A03);
        }
        if (this.A09) {
            if ((i10 & 1) == 0 || !this.A0C.A0J(j10)) {
                return;
            } else {
                this.A09 = false;
            }
        }
        this.A0C.A0G(j10 + this.A00, i10, (this.A01 - i11) - i12, i11, c32);
    }

    public WO(InterfaceC0942Gm interfaceC0942Gm) {
        this.A0D = interfaceC0942Gm;
        int A7D = interfaceC0942Gm.A7D();
        this.A0A = A7D;
        this.A0C = new F8();
        this.A0B = new F7();
        this.A0E = new C0980Hz(32);
        F9 f92 = new F9(0L, A7D);
        this.A04 = f92;
        this.A05 = f92;
        this.A06 = f92;
    }

    private int A00(int i10) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3X(), new F9(this.A06.A03, this.A0A));
        }
        return Math.min(i10, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j10) {
        if (format == null) {
            return null;
        }
        if (A0F[5].charAt(18) == 'x') {
            throw new RuntimeException();
        }
        A0F[5] = "lOB1PW6jUN1Flr4ublIocLHYYSFUXZqB";
        if (j10 != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j10);
        }
        return format;
    }

    private void A02(int i10) {
        long j10 = this.A01 + i10;
        this.A01 = j10;
        if (j10 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j10) {
        while (j10 >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j10) {
        if (j10 == -1) {
            return;
        }
        while (j10 >= this.A04.A03) {
            this.A0D.AEW(this.A04.A01);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j10, ByteBuffer byteBuffer, int i10) {
        A03(j10);
        while (i10 > 0) {
            int remaining = (int) (this.A05.A03 - j10);
            int min = Math.min(i10, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j10);
            byteBuffer.put(bArr, remaining2, min);
            i10 -= min;
            j10 += min;
            if (j10 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j10, byte[] bArr, int i10) {
        A03(j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (this.A05.A03 - j10));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j10);
            int remaining = i10 - i11;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i11 -= min;
            j10 += min;
            if (j10 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A08(F9 f92) {
        if (!f92.A02) {
            return;
        }
        boolean z10 = this.A06.A02;
        int i10 = (z10 ? 1 : 0) + (((int) (this.A06.A04 - f92.A04)) / this.A0A);
        if (A0F[5].charAt(18) == 'x') {
            throw new RuntimeException();
        }
        A0F[1] = "iejtrz5gn5ypfg4If5spWIciPKrb2ZMM";
        C0941Gl[] c0941GlArr = new C0941Gl[i10];
        for (int i11 = 0; i11 < c0941GlArr.length; i11++) {
            c0941GlArr[i11] = f92.A01;
            f92 = f92.A01();
        }
        this.A0D.AEX(c0941GlArr);
    }

    private final void A09(boolean z10) {
        this.A0C.A0H(z10);
        A08(this.A04);
        F9 f92 = new F9(0L, this.A0A);
        this.A04 = f92;
        this.A05 = f92;
        this.A06 = f92;
        this.A01 = 0L;
        this.A0D.AGj();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j10, boolean z10, boolean z11) {
        return this.A0C.A08(j10, z10, z11);
    }

    public final int A0E(C07829p c07829p, C1377Xr c1377Xr, boolean z10, boolean z11, long j10) {
        int result = this.A0C.A09(c07829p, c1377Xr, z10, z11, this.A02, this.A0B);
        switch (result) {
            case -5:
                this.A02 = c07829p.A00;
                return -5;
            case IntegrityErrorCode.PLAY_STORE_ACCOUNT_NOT_FOUND /* -4 */:
                if (!c1377Xr.A04()) {
                    if (c1377Xr.A00 < j10) {
                        String[] strArr = A0F;
                        String str = strArr[2];
                        String str2 = strArr[0];
                        int length = str.length();
                        int result2 = str2.length();
                        if (length == result2) {
                            throw new RuntimeException();
                        }
                        A0F[3] = "3oC8GcXqxYNt";
                        c1377Xr.A00(Integer.MIN_VALUE);
                    }
                    if (c1377Xr.A0A()) {
                        A07(c1377Xr, this.A0B);
                    }
                    int result3 = this.A0B.A00;
                    c1377Xr.A09(result3);
                    long j11 = this.A0B.A01;
                    ByteBuffer byteBuffer = c1377Xr.A01;
                    int result4 = this.A0B.A00;
                    A05(j11, byteBuffer, result4);
                    return -4;
                }
                return -4;
            case -3:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j10, boolean z10, boolean z11) {
        A04(this.A0C.A0D(j10, z10, z11));
    }

    public final void A0L(FA fa2) {
        this.A07 = fa2;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void A5n(Format format) {
        Format A01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        FA fa2 = this.A07;
        if (fa2 != null && formatChanged) {
            fa2.ADS(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final int AFQ(InterfaceC0838Bt interfaceC0838Bt, int i10, boolean z10) throws IOException, InterruptedException {
        int read = interfaceC0838Bt.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        return read;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void AFR(C0980Hz c0980Hz, int i10) {
        while (i10 > 0) {
            int A00 = A00(i10);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            c0980Hz.A0c(bArr, bytesAppended, A00);
            i10 -= A00;
            A02(A00);
        }
    }
}
