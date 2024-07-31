package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XF implements InterfaceC0837Bs {
    public static byte[] A03;
    public static final InterfaceC0840Bv A04;
    public InterfaceC0839Bu A00;
    public AbstractC0856Co A01;
    public boolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{108, -121, -113, -110, -117, -118, 70, -102, -107, 70, -118, -117, -102, -117, -104, -109, -113, -108, -117, 70, -120, -113, -102, -103, -102, -104, -117, -121, -109, 70, -102, -97, -106, -117};
    }

    static {
        A02();
        A04 = new XG();
    }

    public static C0980Hz A00(C0980Hz c0980Hz) {
        c0980Hz.A0Y(0);
        return c0980Hz;
    }

    private boolean A03(InterfaceC0838Bt interfaceC0838Bt) throws IOException, InterruptedException {
        C0852Ck c0852Ck = new C0852Ck();
        if (!c0852Ck.A03(interfaceC0838Bt, true) || (c0852Ck.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c0852Ck.A00, 8);
        C0980Hz c0980Hz = new C0980Hz(length);
        interfaceC0838Bt.ADv(c0980Hz.A00, 0, length);
        if (XH.A04(A00(c0980Hz))) {
            this.A01 = new XH();
        } else if (XC.A06(A00(c0980Hz))) {
            this.A01 = new XC();
        } else {
            if (!XE.A04(A00(c0980Hz))) {
                return false;
            }
            this.A01 = new XE();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0837Bs
    public final void A8o(InterfaceC0839Bu interfaceC0839Bu) {
        this.A00 = interfaceC0839Bu;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0837Bs
    public final int AEH(InterfaceC0838Bt interfaceC0838Bt, C0842Bz c0842Bz) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(interfaceC0838Bt)) {
                interfaceC0838Bt.AFM();
            } else {
                throw new C07889v(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            C4 AGi = this.A00.AGi(0, 1);
            this.A00.A5Y();
            this.A01.A06(this.A00, AGi);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0838Bt, c0842Bz);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0837Bs
    public final void AFh(long j10, long j11) {
        AbstractC0856Co abstractC0856Co = this.A01;
        if (abstractC0856Co != null) {
            abstractC0856Co.A05(j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0837Bs
    public final boolean AGR(InterfaceC0838Bt interfaceC0838Bt) throws IOException, InterruptedException {
        try {
            return A03(interfaceC0838Bt);
        } catch (C07889v unused) {
            return false;
        }
    }
}
