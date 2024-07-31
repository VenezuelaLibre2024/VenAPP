package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.ZN */
/* loaded from: assets/audience_network.dex */
public class C4373ZN extends AbstractRunnableC3455KT {
    public final /* synthetic */ C4372ZM A00;
    public final /* synthetic */ C2898B0 A01;

    public C4373ZN(C4372ZM c4372zm, C2898B0 c2898b0) {
        this.A00 = c4372zm;
        this.A01 = c2898b0;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1A());
        this.A00.A02.A1c(true, true);
    }
}
