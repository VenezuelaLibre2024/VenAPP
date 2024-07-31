package com.facebook.ads.redexgen.uinode;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.4d */
/* loaded from: assets/audience_network.dex */
public class C25194d extends Observable<AbstractC25204e> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC25204e) this.mObservers.get(size)).A00();
        }
    }
}
