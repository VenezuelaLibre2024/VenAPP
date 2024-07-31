package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class XK implements C1 {
    public final /* synthetic */ XJ A00;

    public XK(XJ xj2) {
        this.A00 = xj2;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        return XJ.A08(this.A00).A03(XJ.A05(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long granule) {
        if (granule == 0) {
            return new C0(new C2(0L, XJ.A04(this.A00)));
        }
        long A04 = XJ.A08(this.A00).A04(granule);
        XJ xj2 = this.A00;
        return new C0(new C2(granule, XJ.A06(xj2, XJ.A04(xj2), A04, 30000L)));
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
