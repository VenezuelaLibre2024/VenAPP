package com.facebook.ads.redexgen.uinode;

import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.LC */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3498LC {
    public static final AtomicReference<DisplayMetrics> A00 = new AtomicReference<>();

    public static DisplayMetrics A00() {
        AtomicReference<DisplayMetrics> atomicReference = A00;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        return AbstractC3499LD.A03;
    }
}
