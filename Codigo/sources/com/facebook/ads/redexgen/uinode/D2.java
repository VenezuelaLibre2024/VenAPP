package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class D2 {
    public static String[] A0I = {"F0jWKjQTCy62z5RMZ8LXaJxAHVXVw03", "jefijzmMiLSAGWVfBYlCHQnNu7WiK65", "5NKy3uod9nHosUme2DvPYxtYVEy", "OBCuuRHFU9olC8zTnYpCIYDmocSOdWsL", "GchpYIdYbHeAJ5Ou", "h9yGOulo4c92iX", "0WO8HWLEfGPVrZyS", "YTVxkuYMC8IrkJuZM8HCcFhUbHlAsN8p"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public byte[] A0B;
    public final C4 A0E;
    public final I0 A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0975Hu> A0D = new SparseArray<>();
    public final SparseArray<C0974Ht> A0C = new SparseArray<>();
    public D1 A06 = new D1();
    public D1 A07 = new D1();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A06(byte[] bArr, int i10, int i11) {
        if (this.A08) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.A0B;
            int length = bArr2.length;
            int i13 = this.A00;
            if (length < i13 + i12) {
                int i14 = (i13 + i12) * 2;
                String[] strArr = A0I;
                if (strArr[0].length() == strArr[1].length()) {
                    String[] strArr2 = A0I;
                    strArr2[0] = "I85ez55UKF4vR6ktlfwpENhqyCssmG4";
                    strArr2[1] = "5okjmZY1XRxLGurOWaApunPnJUdAZAM";
                    this.A0B = Arrays.copyOf(bArr2, i14);
                }
                throw new RuntimeException();
            }
            System.arraycopy(bArr, i10, this.A0B, this.A00, i12);
            int i15 = this.A00 + i12;
            this.A00 = i15;
            this.A0F.A08(this.A0B, 0, i15);
            if (this.A0F.A0B(8)) {
                this.A0F.A06();
                int A05 = this.A0F.A05(2);
                this.A0F.A07(5);
                if (this.A0F.A09()) {
                    this.A0F.A04();
                    if (this.A0F.A09()) {
                        int A04 = this.A0F.A04();
                        if (!this.A0H) {
                            this.A08 = false;
                            this.A07.A03(A04);
                            return;
                        }
                        if (this.A0F.A09()) {
                            int A042 = this.A0F.A04();
                            if (this.A0C.indexOfKey(A042) < 0) {
                                this.A08 = false;
                                return;
                            }
                            C0974Ht c0974Ht = this.A0C.get(A042);
                            C0975Hu c0975Hu = this.A0D.get(c0974Ht.A01);
                            if (c0975Hu.A09) {
                                if (this.A0F.A0B(2)) {
                                    I0 i02 = this.A0F;
                                    if (A0I[2].length() != 18) {
                                        A0I[2] = "BDS58Myee4yHYxTG8mu";
                                        i02.A07(2);
                                    }
                                    throw new RuntimeException();
                                }
                                return;
                            }
                            if (this.A0F.A0B(c0975Hu.A01)) {
                                boolean z10 = false;
                                boolean z11 = false;
                                boolean z12 = false;
                                int A052 = this.A0F.A05(c0975Hu.A01);
                                if (c0975Hu.A08) {
                                    if (A0I[5].length() != 7) {
                                        String[] strArr3 = A0I;
                                        strArr3[6] = "E8pM94a91AlwBow9";
                                        strArr3[4] = "HP5p1w370WRNIPZM";
                                    } else {
                                        A0I[5] = "F8tLSSZzAzz";
                                    }
                                } else {
                                    if (!this.A0F.A0B(1)) {
                                        return;
                                    }
                                    z10 = this.A0F.A0A();
                                    if (z10) {
                                        if (!this.A0F.A0B(1)) {
                                            return;
                                        }
                                        z12 = this.A0F.A0A();
                                        z11 = true;
                                    }
                                }
                                boolean z13 = this.A01 == 5;
                                int i16 = 0;
                                if (z13) {
                                    if (!this.A0F.A09()) {
                                        return;
                                    } else {
                                        i16 = this.A0F.A04();
                                    }
                                }
                                int i17 = 0;
                                int i18 = 0;
                                int i19 = 0;
                                int i20 = 0;
                                if (c0975Hu.A04 == 0) {
                                    if (!this.A0F.A0B(c0975Hu.A03)) {
                                        return;
                                    }
                                    i17 = this.A0F.A05(c0975Hu.A03);
                                    if (c0974Ht.A02 && !z10) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        } else {
                                            i18 = this.A0F.A03();
                                        }
                                    }
                                } else if (c0975Hu.A04 == 1 && !c0975Hu.A07) {
                                    if (!this.A0F.A09()) {
                                        return;
                                    }
                                    i19 = this.A0F.A03();
                                    if (c0974Ht.A02 && !z10) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        } else {
                                            i20 = this.A0F.A03();
                                        }
                                    }
                                }
                                this.A07.A04(c0975Hu, A05, A04, A052, A042, z10, z11, z12, z13, i16, i17, i18, i19, i20);
                                this.A08 = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public D2(C4 c42, boolean z10, boolean z11) {
        this.A0E = c42;
        this.A0G = z10;
        this.A0H = z11;
        byte[] bArr = new byte[RecognitionOptions.ITF];
        this.A0B = bArr;
        this.A0F = new I0(bArr, 0, 0);
        A01();
    }

    private void A00(int i10) {
        boolean z10 = this.A0A;
        this.A0E.AFS(this.A05, z10 ? 1 : 0, (int) (this.A02 - this.A04), i10, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(long r7, int r9) {
        /*
            r6 = this;
            int r1 = r6.A01
            r0 = 9
            r3 = 0
            r4 = 1
            if (r1 == r0) goto L16
            boolean r0 = r6.A0H
            if (r0 == 0) goto L4d
            com.facebook.ads.redexgen.X.D1 r1 = r6.A07
            com.facebook.ads.redexgen.X.D1 r0 = r6.A06
            boolean r0 = com.facebook.ads.redexgen.uinode.D1.A01(r1, r0)
            if (r0 == 0) goto L4d
        L16:
            boolean r5 = r6.A09
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.D2.A0I
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L30
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L30:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.D2.A0I
            java.lang.String r1 = "rg9RD6QhDdRr"
            r0 = 2
            r2[r0] = r1
            if (r5 == 0) goto L41
            long r0 = r6.A02
            long r7 = r7 - r0
            int r0 = (int) r7
            int r9 = r9 + r0
            r6.A00(r9)
        L41:
            long r0 = r6.A02
            r6.A04 = r0
            long r0 = r6.A03
            r6.A05 = r0
            r6.A0A = r3
            r6.A09 = r4
        L4d:
            boolean r2 = r6.A0A
            int r1 = r6.A01
            r0 = 5
            if (r1 == r0) goto L62
            boolean r0 = r6.A0G
            if (r0 == 0) goto L63
            if (r1 != r4) goto L63
            com.facebook.ads.redexgen.X.D1 r0 = r6.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L63
        L62:
            r3 = 1
        L63:
            r2 = r2 | r3
            r6.A0A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.D2.A02(long, int):void");
    }

    public final void A03(long j10, int i10, long j11) {
        this.A01 = i10;
        this.A03 = j11;
        this.A02 = j10;
        if (!this.A0G || i10 != 1) {
            if (!this.A0H) {
                return;
            }
            if (i10 != 5 && i10 != 1 && i10 != 2) {
                return;
            }
        }
        D1 d12 = this.A06;
        D1 newSliceHeader = this.A07;
        this.A06 = newSliceHeader;
        this.A07 = d12;
        d12.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A04(C0974Ht c0974Ht) {
        this.A0C.append(c0974Ht.A00, c0974Ht);
    }

    public final void A05(C0975Hu c0975Hu) {
        this.A0D.append(c0975Hu.A05, c0975Hu);
    }

    public final boolean A07() {
        return this.A0H;
    }
}
