package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.V0 */
/* loaded from: assets/audience_network.dex */
public class C4105V0 extends AbstractRunnableC3442KG {
    public final /* synthetic */ C2941Bj A00;
    public final /* synthetic */ C3403Jb A01;

    public C4105V0(C2941Bj c2941Bj, C3403Jb c3403Jb) {
        this.A00 = c2941Bj;
        this.A01 = c3403Jb;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3442KG
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, AbstractC3487L1.A00(this.A01));
    }
}
