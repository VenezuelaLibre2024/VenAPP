package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1268Ti implements InterfaceC1111Nh {
    public final WeakReference<BK> A00;

    public C1268Ti(BK bk2) {
        this.A00 = new WeakReference<>(bk2);
    }

    public /* synthetic */ C1268Ti(BK bk2, BP bp) {
        this(bk2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1111Nh
    public final void ABh(boolean z10) {
        BK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z10;
            cardLayout.A04();
        }
    }
}
