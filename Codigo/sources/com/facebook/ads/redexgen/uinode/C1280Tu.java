package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tu */
/* loaded from: assets/audience_network.dex */
public class C1280Tu extends KT {
    public final WeakReference<RE> A00;

    public C1280Tu(RE re2) {
        this.A00 = new WeakReference<>(re2);
    }

    public C1280Tu(WeakReference<RE> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        RE viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
