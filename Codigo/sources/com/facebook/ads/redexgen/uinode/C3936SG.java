package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.SG */
/* loaded from: assets/audience_network.dex */
public class C3936SG extends AbstractRunnableC3455KT {
    public final /* synthetic */ C3935SF A00;

    public C3936SG(C3935SF c3935sf) {
        this.A00 = c3935sf;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C3930SA c3930sa;
        AbstractC3781Pl abstractC3781Pl;
        AbstractC3721On abstractC3721On;
        AbstractC3790Pu abstractC3790Pu;
        c3930sa = this.A00.A04;
        C27668r<AbstractC27678s, C27658q> eventBus = c3930sa.getEventBus();
        abstractC3781Pl = this.A00.A06;
        abstractC3721On = this.A00.A07;
        abstractC3790Pu = this.A00.A05;
        eventBus.A04(abstractC3781Pl, abstractC3721On, abstractC3790Pu);
    }
}
