package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.an */
/* loaded from: assets/audience_network.dex */
public class C4458an extends AbstractRunnableC3455KT {
    public final /* synthetic */ AbstractC4457am A00;
    public final /* synthetic */ C3403Jb A01;

    public C4458an(AbstractC4457am abstractC4457am, C3403Jb c3403Jb) {
        this.A00 = abstractC4457am;
        this.A01 = c3403Jb;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        this.A00.A0B.A0E().A4t(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
