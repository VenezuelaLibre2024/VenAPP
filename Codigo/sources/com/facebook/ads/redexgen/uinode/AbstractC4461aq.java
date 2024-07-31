package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.aq */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4461aq implements InterfaceC26336U {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z10);

    public AbstractC4461aq(boolean z10) {
        this.A00 = z10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void AB2() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void ABB() {
        A01(true);
    }
}
