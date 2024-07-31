package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.ZC */
/* loaded from: assets/audience_network.dex */
public class C4362ZC extends AbstractRunnableC3442KG {
    public final /* synthetic */ C4361ZB A00;

    public C4362ZC(C4361ZB c4361zb) {
        this.A00 = c4361zb;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3442KG
    public final void A01() {
        C25905m c25905m;
        C25905m c25905m2;
        c25905m = this.A00.A01.A00;
        if (c25905m.A00() != null) {
            c25905m2 = this.A00.A01.A00;
            c25905m2.A00().onAdsLoaded();
        }
    }
}
