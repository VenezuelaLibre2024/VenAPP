package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.bR */
/* loaded from: assets/audience_network.dex */
public class C1524bR extends KT {
    public final /* synthetic */ C1523bQ A00;
    public final /* synthetic */ B0 A01;

    public C1524bR(C1523bQ c1523bQ, B0 b02) {
        this.A00 = c1523bQ;
        this.A01 = b02;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        RE re2;
        RE re3;
        RE re4;
        this.A00.A00.A0A();
        re2 = this.A00.A00.A0B;
        if (re2 != null) {
            B0 b02 = this.A01;
            re3 = this.A00.A00.A0B;
            b02.setAdViewabilityChecker(re3);
            re4 = this.A00.A00.A0B;
            re4.A0U();
        }
    }
}
