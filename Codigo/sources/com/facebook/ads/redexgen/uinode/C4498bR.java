package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.bR */
/* loaded from: assets/audience_network.dex */
public class C4498bR extends AbstractRunnableC3455KT {
    public final /* synthetic */ C4497bQ A00;
    public final /* synthetic */ C2898B0 A01;

    public C4498bR(C4497bQ c4497bQ, C2898B0 c2898b0) {
        this.A00 = c4497bQ;
        this.A01 = c2898b0;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C3872RE c3872re;
        C3872RE c3872re2;
        C3872RE c3872re3;
        this.A00.A00.A0A();
        c3872re = this.A00.A00.A0B;
        if (c3872re != null) {
            C2898B0 c2898b0 = this.A01;
            c3872re2 = this.A00.A00.A0B;
            c2898b0.setAdViewabilityChecker(c3872re2);
            c3872re3 = this.A00.A00.A0B;
            c3872re3.A0U();
        }
    }
}
