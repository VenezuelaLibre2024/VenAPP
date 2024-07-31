package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: com.facebook.ads.redexgen.X.43 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC248443 {
    public static final C248342 A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C4402Zr();
        } else {
            A00 = new C248342();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f10, float f11) {
        A00.A00(edgeEffect, f10, f11);
    }
}
