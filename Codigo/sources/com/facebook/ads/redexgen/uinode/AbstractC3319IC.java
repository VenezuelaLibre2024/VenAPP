package com.facebook.ads.redexgen.uinode;

import android.os.Trace;

/* renamed from: com.facebook.ads.redexgen.X.IC */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3319IC {
    public static void A00() {
        if (AbstractC3322IF.A02 >= 18) {
            A01();
        }
    }

    public static void A01() {
        Trace.endSection();
    }

    public static void A02(String str) {
        if (AbstractC3322IF.A02 >= 18) {
            A03(str);
        }
    }

    public static void A03(String str) {
        Trace.beginSection(str);
    }
}