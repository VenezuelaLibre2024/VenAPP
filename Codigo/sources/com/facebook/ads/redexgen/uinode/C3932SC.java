package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.SC */
/* loaded from: assets/audience_network.dex */
public class C3932SC extends AbstractRunnableC3455KT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C3930SA A02;

    public C3932SC(C3930SA c3930sa, int i10, int i11) {
        this.A02 = c3930sa;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C27668r c27668r;
        c27668r = this.A02.A0B;
        c27668r.A02(new C3601Mr(this.A00, this.A01));
    }
}
