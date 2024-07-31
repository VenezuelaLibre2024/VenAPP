package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tu */
/* loaded from: assets/audience_network.dex */
public class C4038Tu extends AbstractRunnableC3455KT {
    public final WeakReference<C3872RE> A00;

    public C4038Tu(C3872RE c3872re) {
        this.A00 = new WeakReference<>(c3872re);
    }

    public C4038Tu(WeakReference<C3872RE> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C3872RE viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
