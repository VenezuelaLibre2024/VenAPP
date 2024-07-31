package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ti */
/* loaded from: assets/audience_network.dex */
public class C4026Ti implements InterfaceC3653Nh {
    public final WeakReference<C2918BK> A00;

    public C4026Ti(C2918BK c2918bk) {
        this.A00 = new WeakReference<>(c2918bk);
    }

    public /* synthetic */ C4026Ti(C2918BK c2918bk, C2923BP c2923bp) {
        this(c2918bk);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3653Nh
    public final void ABh(boolean z10) {
        C2918BK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z10;
            cardLayout.A04();
        }
    }
}
