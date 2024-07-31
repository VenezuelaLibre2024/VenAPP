package com.facebook.ads.redexgen.uinode;

import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.KS */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3454KS extends RelativeLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC3445KJ> A01 = new AtomicReference<>();

    public static void A00(boolean z10, InterfaceC3445KJ interfaceC3445KJ) {
        A00.set(z10);
        A01.set(interfaceC3445KJ);
    }
}
