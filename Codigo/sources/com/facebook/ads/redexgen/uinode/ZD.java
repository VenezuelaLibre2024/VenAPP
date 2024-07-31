package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class ZD extends KG {
    public final /* synthetic */ ZA A00;
    public final /* synthetic */ C1005Jb A01;

    public ZD(ZA za2, C1005Jb c1005Jb) {
        this.A00 = za2;
        this.A01 = c1005Jb;
    }

    @Override // com.facebook.ads.redexgen.uinode.KG
    public final void A01() {
        C06885m c06885m;
        C06885m c06885m2;
        c06885m = this.A00.A00;
        if (c06885m.A00() != null) {
            c06885m2 = this.A00.A00;
            c06885m2.A00().onAdError(L1.A00(this.A01));
        }
    }
}
