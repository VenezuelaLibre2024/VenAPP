package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class SG extends KT {
    public final /* synthetic */ SF A00;

    public SG(SF sf2) {
        this.A00 = sf2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        SA sa2;
        AbstractC1167Pl abstractC1167Pl;
        AbstractC1143On abstractC1143On;
        AbstractC1176Pu abstractC1176Pu;
        sa2 = this.A00.A04;
        C07608r<AbstractC07618s, C07598q> eventBus = sa2.getEventBus();
        abstractC1167Pl = this.A00.A06;
        abstractC1143On = this.A00.A07;
        abstractC1176Pu = this.A00.A05;
        eventBus.A04(abstractC1167Pl, abstractC1143On, abstractC1176Pu);
    }
}
