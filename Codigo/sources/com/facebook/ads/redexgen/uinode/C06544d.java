package com.facebook.ads.redexgen.uinode;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.4d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06544d extends Observable<AbstractC06554e> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC06554e) this.mObservers.get(size)).A00();
        }
    }
}
