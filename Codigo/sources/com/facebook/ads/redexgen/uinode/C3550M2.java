package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.M2 */
/* loaded from: assets/audience_network.dex */
public final class C3550M2 {
    public static C3550M2 A02;
    public final C4077UY A00;
    public final C3552M4 A01;

    public C3550M2(C4337Yn c4337Yn, Executor executor, C27428S c27428s) {
        this.A01 = new C3552M4(c4337Yn);
        this.A00 = new C4077UY(executor, c27428s, c4337Yn);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C4337Yn c4337Yn, Executor executor, C27428S c27428s) {
        if (!C3348Ih.A1C(c4337Yn)) {
            return;
        }
        C3550M2 c3550m2 = A02;
        if (c3550m2 == null) {
            C3550M2 c3550m22 = new C3550M2(c4337Yn, executor, c27428s);
            A02 = c3550m22;
            c3550m22.A00();
            return;
        }
        c3550m2.A02(c27428s);
    }

    private void A02(C27428S c27428s) {
        this.A00.A07(c27428s);
    }
}
