package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Zk */
/* loaded from: assets/audience_network.dex */
public class C4395Zk implements InterfaceC25555D {
    public final /* synthetic */ C3100Eb A00;

    public C4395Zk(C3100Eb c3100Eb) {
        this.A00 = c3100Eb;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC25555D
    public final void AE9(AbstractC254856 abstractC254856, C25254j c25254j, C25254j c25254j2) {
        this.A00.A1j(abstractC254856, c25254j, c25254j2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC25555D
    public final void AEB(AbstractC254856 abstractC254856, C25254j c25254j, C25254j c25254j2) {
        this.A00.A0r.A0Y(abstractC254856);
        this.A00.A1k(abstractC254856, c25254j, c25254j2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC25555D
    public final void AED(AbstractC254856 abstractC254856, C25254j c25254j, C25254j c25254j2) {
        abstractC254856.A0X(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC254856, abstractC254856, c25254j, c25254j2)) {
                this.A00.A1M();
            }
        } else {
            if (!this.A00.A05.A0G(abstractC254856, c25254j, c25254j2)) {
                return;
            }
            this.A00.A1M();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC25555D
    public final void AGo(AbstractC254856 abstractC254856) {
        this.A00.A06.A1D(abstractC254856.A0H, this.A00.A0r);
    }
}
