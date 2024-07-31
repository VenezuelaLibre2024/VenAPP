package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8l */
/* loaded from: assets/audience_network.dex */
public final class C27608l {
    public static C27608l A00 = new C27608l();

    public static C27608l A00() {
        return A00;
    }

    public final C4306YI A01(C26937f c26937f, boolean z10) {
        return new C4306YI(c26937f, z10, new C26316S());
    }

    public final Map<String, String> A02(C26937f c26937f) {
        try {
            return A01(c26937f, false).A05();
        } catch (Throwable th2) {
            c26937f.A07().A3c(th2);
            return C27528d.A01(c26937f);
        }
    }
}
