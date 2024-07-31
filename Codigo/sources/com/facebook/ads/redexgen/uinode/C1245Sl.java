package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Sl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1245Sl extends KT {
    public final /* synthetic */ C9Y A00;

    public C1245Sl(C9Y c9y) {
        this.A00 = c9y;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        OL ol2;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        OL ol3;
        ol2 = this.A00.A00;
        if (ol2 != null) {
            ol3 = this.A00.A00;
            ol3.A0y();
        }
        MB mb2 = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        mb2.setToolbarActionMode(closeButtonStyle);
        this.A00.A07.A04();
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
