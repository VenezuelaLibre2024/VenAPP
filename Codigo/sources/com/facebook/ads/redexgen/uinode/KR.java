package com.facebook.ads.redexgen.uinode;

import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class KR extends LinearLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<KJ> A01 = new AtomicReference<>();

    public static void A00(boolean z10, KJ kj2) {
        A00.set(z10);
        A01.set(kj2);
    }
}
