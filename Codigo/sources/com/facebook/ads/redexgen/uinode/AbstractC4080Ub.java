package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ub */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4080Ub<T> extends AbstractRunnableC3455KT {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ub != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC4080Ub(T reference) {
        this.A00 = new WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ub != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A07() {
        return this.A00.get();
    }
}