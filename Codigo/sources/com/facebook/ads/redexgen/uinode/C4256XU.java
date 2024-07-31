package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XU */
/* loaded from: assets/audience_network.dex */
public final class C4256XU implements InterfaceC2950Bs {
    public static byte[] A0E;
    public static String[] A0F = {"FKupPKXcsIkycQ3l5ptAH5wluEqc6YoI", "RW", "ogqWAOna8QODFLIqijT7vOYnhApvYyU7", "UAOUtvFDqNmRNLgZ1GU6DrNnbPesxUgh", "z4WGtVpeHmr0jWMfeyoB2cmDzFByDj9w", "gdGWUcFUabEj8aTRXEAi5amp", "tmhvTid", "WDNv6R6VbALBmvSk6DCmHF7NFi0i9puO"};
    public static final InterfaceC2953Bv A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC2952Bu A04;
    public InterfaceC2962C4 A05;
    public InterfaceC4257XV A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C2954Bw A0A;
    public final C2955Bx A0B;
    public final C2956By A0C;
    public final C3306Hz A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-94, -57, -65, -56, -110, -92, -96, -79, -94, -89, -92, -93, 95, -77, -82, -82, 95, -84, -96, -83, -72, 95, -95, -72, -77, -92, -78, 109, -115, 121, -119, Byte.MIN_VALUE, -100, -83, -78, -85};
    }

    static {
        A05();
        A0G = new C4258XW();
        A0J = AbstractC3322IF.A08(A04(32, 4, 37));
        A0H = AbstractC3322IF.A08(A04(0, 4, 58));
        A0I = AbstractC3322IF.A08(A04(28, 4, 24));
    }

    public C4256XU() {
        this(0);
    }

    public C4256XU(int i10) {
        this(i10, -9223372036854775807L);
    }

    public C4256XU(int i10, long j10) {
        this.A08 = i10;
        this.A09 = j10;
        this.A0D = new C3306Hz(10);
        this.A0C = new C2956By();
        this.A0A = new C2954Bw();
        this.A02 = -9223372036854775807L;
        this.A0B = new C2955Bx();
    }

    private int A00(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            interfaceC2951Bt.AFM();
            if (!interfaceC2951Bt.ADw(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int A08 = this.A0D.A08();
            int sampleHeaderData = this.A01;
            if (A06(A08, sampleHeaderData)) {
                int sampleHeaderData2 = C2956By.A00(A08);
                if (sampleHeaderData2 != -1) {
                    C2956By.A04(A08, this.A0C);
                    if (this.A02 == -9223372036854775807L) {
                        InterfaceC4257XV interfaceC4257XV = this.A06;
                        long A7i = interfaceC2951Bt.A7i();
                        if (A0F[0].charAt(7) == '2') {
                            throw new RuntimeException();
                        }
                        A0F[5] = "uwsYCHPiCgNXlhDD9rc7dT19";
                        this.A02 = interfaceC4257XV.A88(A7i);
                        if (this.A09 != -9223372036854775807L) {
                            this.A02 += this.A09 - this.A06.A88(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0C.A02;
                    this.A00 = sampleHeaderData3;
                }
            }
            interfaceC2951Bt.AGP(1);
            this.A01 = 0;
            return 0;
        }
        int AFQ = this.A05.AFQ(interfaceC2951Bt, this.A00, true);
        if (AFQ == -1) {
            return -1;
        }
        int bytesAppended = this.A00 - AFQ;
        this.A00 = bytesAppended;
        if (bytesAppended > 0) {
            return 0;
        }
        this.A05.AFS(this.A02 + ((this.A03 * 1000000) / this.A0C.A03), 1, this.A0C.A02, 0, null);
        this.A03 += this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3 == r0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.facebook.ads.redexgen.uinode.C3306Hz r4, int r5) {
        /*
            int r1 = r4.A07()
            int r0 = r5 + 4
            if (r1 < r0) goto L3e
            r4.A0Y(r5)
            int r3 = r4.A08()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4256XU.A0F
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L38
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4256XU.A0F
            java.lang.String r1 = "RZ9mFeyNnV0sPgPCsPCuasZg37Uzdp17"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "fK9CAyTZYj28knSP6u8xHPIK1qnXYcxa"
            r0 = 3
            r2[r0] = r1
            int r0 = com.facebook.ads.redexgen.uinode.C4256XU.A0J
            if (r3 == r0) goto L37
            int r0 = com.facebook.ads.redexgen.uinode.C4256XU.A0H
            if (r3 != r0) goto L3e
        L37:
            return r3
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            int r1 = r4.A07()
            r0 = 40
            if (r1 < r0) goto L54
            r0 = 36
            r4.A0Y(r0)
            int r1 = r4.A08()
            int r0 = com.facebook.ads.redexgen.uinode.C4256XU.A0I
            if (r1 != r0) goto L54
            return r0
        L54:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4256XU.A01(com.facebook.ads.redexgen.X.Hz, int):int");
    }

    private C3077EE A02(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        interfaceC2951Bt.ADv(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        C2956By.A04(this.A0D.A08(), this.A0C);
        return new C3077EE(interfaceC2951Bt.A7I(), interfaceC2951Bt.A7i(), this.A0C);
    }

    private InterfaceC4257XV A03(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        C3306Hz c3306Hz = new C3306Hz(this.A0C.A02);
        interfaceC2951Bt.ADv(c3306Hz.A00, 0, this.A0C.A02);
        int i10 = 21;
        if ((this.A0C.A05 & 1) != 0) {
            int i11 = this.A0C.A01;
            if (A0F[5].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "1a7oiXE";
            strArr[1] = "rh";
            if (i11 != 1) {
                i10 = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i10 = 13;
        }
        int xingBase = A01(c3306Hz, i10);
        if (xingBase == A0J || xingBase == A0H) {
            C3067E4 A01 = C3067E4.A01(interfaceC2951Bt.A7I(), interfaceC2951Bt.A7i(), this.A0C, c3306Hz);
            if (A01 != null && !this.A0A.A03()) {
                interfaceC2951Bt.AFM();
                interfaceC2951Bt.A3W(i10 + 141);
                C3306Hz frame = this.A0D;
                interfaceC2951Bt.ADv(frame.A00, 0, 3);
                C3306Hz frame2 = this.A0D;
                frame2.A0Y(0);
                C2954Bw c2954Bw = this.A0A;
                C3306Hz frame3 = this.A0D;
                c2954Bw.A04(frame3.A0G());
            }
            interfaceC2951Bt.AGP(this.A0C.A02);
            if (A01 != null && !A01.A9I() && xingBase == A0H) {
                return A02(interfaceC2951Bt);
            }
            return A01;
        }
        if (xingBase == A0I) {
            C3075EC A00 = C3075EC.A00(interfaceC2951Bt.A7I(), interfaceC2951Bt.A7i(), this.A0C, c3306Hz);
            interfaceC2951Bt.AGP(this.A0C.A02);
            return A00;
        }
        interfaceC2951Bt.AFM();
        return null;
    }

    public static boolean A06(int i10, long j10) {
        return ((long) ((-128000) & i10)) == ((-128000) & j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x009d, code lost:
    
        if (r15 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:
    
        r14.AGP(r6 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a3, code lost:
    
        r13.A01 = r7;
        r2 = com.facebook.ads.redexgen.uinode.C4256XU.A0F;
        r1 = r2[2];
        r2 = r2[7];
        r1 = r1.charAt(28);
        r0 = r2.charAt(28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b7, code lost:
    
        if (r1 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b9, code lost:
    
        com.facebook.ads.redexgen.uinode.C4256XU.A0F[0] = "JRrUIGwZBJczcB1fqhgNVGoVSbza2n0c";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c1, code lost:
    
        r14.AFM();
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07(com.facebook.ads.redexgen.uinode.InterfaceC2951Bt r14, boolean r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4256XU.A07(com.facebook.ads.redexgen.X.Bt, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void A8o(InterfaceC2952Bu interfaceC2952Bu) {
        this.A04 = interfaceC2952Bu;
        this.A05 = interfaceC2952Bu.AGi(0, 1);
        this.A04.A5Y();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final int AEH(InterfaceC2951Bt interfaceC2951Bt, C2957Bz c2957Bz) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC2951Bt, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            InterfaceC4257XV A03 = A03(interfaceC2951Bt);
            this.A06 = A03;
            if (A03 == null || (!A03.A9I() && (this.A08 & 1) != 0)) {
                this.A06 = A02(interfaceC2951Bt);
            }
            this.A04.AFi(this.A06);
            this.A05.A5n(Format.A05(null, this.A0C.A06, null, -1, RecognitionOptions.AZTEC, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC2951Bt);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void AFh(long j10, long j11) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final boolean AGR(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        return A07(interfaceC2951Bt, true);
    }
}
