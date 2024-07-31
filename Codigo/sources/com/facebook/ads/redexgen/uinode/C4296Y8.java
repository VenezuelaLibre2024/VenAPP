package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Y8 */
/* loaded from: assets/audience_network.dex */
public final class C4296Y8 implements InterfaceC3297Hq {
    public static byte[] A04;
    public static String[] A05 = {"Xobc5aSRFsnlTfq950Hm2L3uP2yqTx5R", "l", "qpzLH3olNTSgnmEJfqgMoILAygrv9Gvu", "rA2kHVtwjUdxF3LXQtoL786BdYvsVYLD", "0rBDFyThd5IBv1Jp4I3rS", "drj1vvUtkoX3RGiyI02l8il3i3aSfPCy", "cZlTLMFk7RrLemAAhuy1ARzIYrj9DMLk", "NSM"};
    public InterfaceC4293Y5 A00;
    public InterfaceC3297Hq A01;
    public final InterfaceC28109Z A02;
    public final C4145Ve A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-84, -44, -53, -45, -56, -49, -53, -60, Byte.MAX_VALUE, -47, -60, -51, -61, -60, -47, -60, -47, Byte.MAX_VALUE, -52, -60, -61, -56, -64, Byte.MAX_VALUE, -62, -53, -50, -62, -54, -46, Byte.MAX_VALUE, -60, -51, -64, -63, -53, -60, -61, -115};
    }

    static {
        A02();
    }

    public C4296Y8(InterfaceC28109Z interfaceC28109Z, InterfaceC3284Hd interfaceC3284Hd) {
        this.A02 = interfaceC28109Z;
        this.A03 = new C4145Ve(interfaceC3284Hd);
    }

    private void A01() {
        this.A03.A02(this.A01.A7k());
        C28339x A7h = this.A01.A7h();
        if (!A7h.equals(this.A03.A7h())) {
            this.A03.AGA(A7h);
            this.A02.ACb(A7h);
        }
    }

    private boolean A03() {
        InterfaceC4293Y5 interfaceC4293Y5 = this.A00;
        if (interfaceC4293Y5 != null && !interfaceC4293Y5.A91()) {
            boolean A9C = this.A00.A9C();
            if (A05[1].length() == 23) {
                throw new RuntimeException();
            }
            A05[1] = "Da4vHoBMew1xMnwVwhw0NxQudcM";
            if (A9C || !this.A00.A8a()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            long A7k = this.A01.A7k();
            if (A05[7].length() == 18) {
                throw new RuntimeException();
            }
            A05[7] = "L098bBK7xK";
            return A7k;
        }
        return this.A03.A7k();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j10) {
        this.A03.A02(j10);
    }

    public final void A08(InterfaceC4293Y5 interfaceC4293Y5) {
        if (interfaceC4293Y5 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(InterfaceC4293Y5 interfaceC4293Y5) throws C28139c {
        InterfaceC3297Hq A7N = interfaceC4293Y5.A7N();
        if (A7N != null) {
            InterfaceC3297Hq interfaceC3297Hq = this.A01;
            if (A05[0].charAt(12) != 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "G6KpX7Ur5Z0x6RCw4xSrHpY3l6NonZ5O";
            strArr[3] = "DkiI2Rz4cuYvxyrSRslfvXTI6PdAzLXl";
            if (A7N != interfaceC3297Hq) {
                if (interfaceC3297Hq == null) {
                    this.A01 = A7N;
                    this.A00 = interfaceC4293Y5;
                    InterfaceC3297Hq rendererMediaClock = this.A03;
                    A7N.AGA(rendererMediaClock.A7h());
                    A01();
                    return;
                }
                throw C28139c.A02(new IllegalStateException(A00(0, 39, 31)));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3297Hq
    public final C28339x A7h() {
        InterfaceC3297Hq interfaceC3297Hq = this.A01;
        if (interfaceC3297Hq != null) {
            return interfaceC3297Hq.A7h();
        }
        return this.A03.A7h();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3297Hq
    public final long A7k() {
        if (A03()) {
            return this.A01.A7k();
        }
        return this.A03.A7k();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3297Hq
    public final C28339x AGA(C28339x c28339x) {
        InterfaceC3297Hq interfaceC3297Hq = this.A01;
        if (interfaceC3297Hq != null) {
            c28339x = interfaceC3297Hq.AGA(c28339x);
        }
        this.A03.AGA(c28339x);
        this.A02.ACb(c28339x);
        return c28339x;
    }
}
