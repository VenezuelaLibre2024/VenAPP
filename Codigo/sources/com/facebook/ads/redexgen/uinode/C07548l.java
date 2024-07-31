package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07548l {
    public static C07548l A00 = new C07548l();

    public static C07548l A00() {
        return A00;
    }

    public final YI A01(C07277f c07277f, boolean z10) {
        return new YI(c07277f, z10, new C6S());
    }

    public final Map<String, String> A02(C07277f c07277f) {
        try {
            return A01(c07277f, false).A05();
        } catch (Throwable th2) {
            c07277f.A07().A3c(th2);
            return C07468d.A01(c07277f);
        }
    }
}
