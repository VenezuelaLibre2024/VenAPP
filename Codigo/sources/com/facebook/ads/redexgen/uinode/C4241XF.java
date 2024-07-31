package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XF */
/* loaded from: assets/audience_network.dex */
public final class C4241XF implements InterfaceC2950Bs {
    public static byte[] A03;
    public static final InterfaceC2953Bv A04;
    public InterfaceC2952Bu A00;
    public AbstractC3004Co A01;
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
        A04 = new C4242XG();
    }

    public static C3306Hz A00(C3306Hz c3306Hz) {
        c3306Hz.A0Y(0);
        return c3306Hz;
    }

    private boolean A03(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        C3000Ck c3000Ck = new C3000Ck();
        if (!c3000Ck.A03(interfaceC2951Bt, true) || (c3000Ck.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c3000Ck.A00, 8);
        C3306Hz c3306Hz = new C3306Hz(length);
        interfaceC2951Bt.ADv(c3306Hz.A00, 0, length);
        if (C4243XH.A04(A00(c3306Hz))) {
            this.A01 = new C4243XH();
        } else if (C4238XC.A06(A00(c3306Hz))) {
            this.A01 = new C4238XC();
        } else {
            if (!C4240XE.A04(A00(c3306Hz))) {
                return false;
            }
            this.A01 = new C4240XE();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void A8o(InterfaceC2952Bu interfaceC2952Bu) {
        this.A00 = interfaceC2952Bu;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final int AEH(InterfaceC2951Bt interfaceC2951Bt, C2957Bz c2957Bz) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(interfaceC2951Bt)) {
                interfaceC2951Bt.AFM();
            } else {
                throw new C28319v(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            InterfaceC2962C4 AGi = this.A00.AGi(0, 1);
            this.A00.A5Y();
            this.A01.A06(this.A00, AGi);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC2951Bt, c2957Bz);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void AFh(long j10, long j11) {
        AbstractC3004Co abstractC3004Co = this.A01;
        if (abstractC3004Co != null) {
            abstractC3004Co.A05(j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final boolean AGR(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        try {
            return A03(interfaceC2951Bt);
        } catch (C28319v unused) {
            return false;
        }
    }
}
