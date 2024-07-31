package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.ZR */
/* loaded from: assets/audience_network.dex */
public class C4377ZR extends AbstractRunnableC3442KG {
    public final /* synthetic */ C4376ZQ A00;

    public C4377ZR(C4376ZQ c4376zq) {
        this.A00 = c4376zq;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3442KG
    public final void A01() {
        C25675P c25675p;
        C25675P c25675p2;
        C25675P c25675p3;
        c25675p = this.A00.A01;
        if (c25675p.A06() != null) {
            c25675p2 = this.A00.A01;
            AdListener A06 = c25675p2.A06();
            c25675p3 = this.A00.A01;
            A06.onLoggingImpression(c25675p3.A07());
        }
    }
}
