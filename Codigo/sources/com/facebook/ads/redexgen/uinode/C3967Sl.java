package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Sl */
/* loaded from: assets/audience_network.dex */
public class C3967Sl extends AbstractRunnableC3455KT {
    public final /* synthetic */ C28099Y A00;

    public C3967Sl(C28099Y c28099y) {
        this.A00 = c28099y;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        AbstractC3693OL abstractC3693OL;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC3693OL abstractC3693OL2;
        abstractC3693OL = this.A00.A00;
        if (abstractC3693OL != null) {
            abstractC3693OL2 = this.A00.A00;
            abstractC3693OL2.A0y();
        }
        AbstractC3559MB abstractC3559MB = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC3559MB.setToolbarActionMode(closeButtonStyle);
        this.A00.A07.A04();
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
