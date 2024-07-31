package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class ZC extends KG {
    public final /* synthetic */ ZB A00;

    public ZC(ZB zb2) {
        this.A00 = zb2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KG
    public final void A01() {
        C06885m c06885m;
        C06885m c06885m2;
        c06885m = this.A00.A01.A00;
        if (c06885m.A00() != null) {
            c06885m2 = this.A00.A01.A00;
            c06885m2.A00().onAdsLoaded();
        }
    }
}
