package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.TR */
/* loaded from: assets/audience_network.dex */
public class C4009TR implements InterfaceC3653Nh {
    public final WeakReference<AbstractC2902B4> A00;

    public C4009TR(AbstractC2902B4 abstractC2902B4) {
        this.A00 = new WeakReference<>(abstractC2902B4);
    }

    public /* synthetic */ C4009TR(AbstractC2902B4 abstractC2902B4, C2915BH c2915bh) {
        this(abstractC2902B4);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3653Nh
    public final void ABh(boolean z10) {
        AbstractC2902B4 cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z10;
            cardLayout.A04();
        }
    }
}
