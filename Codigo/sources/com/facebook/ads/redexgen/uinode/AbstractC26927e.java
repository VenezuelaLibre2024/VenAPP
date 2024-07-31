package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7e */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC26927e {
    public static final AtomicReference<C4336Ym> A00 = new AtomicReference<>();

    public static C4336Ym A00() {
        return A00.get();
    }

    public static void A01(C4336Ym c4336Ym) {
        if (c4336Ym == null) {
            return;
        }
        AbstractC26917d.A00(A00, null, c4336Ym);
    }
}
