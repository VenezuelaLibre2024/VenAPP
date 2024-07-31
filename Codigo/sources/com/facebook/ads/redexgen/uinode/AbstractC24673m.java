package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3m */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC24673m {
    public static final C24663l A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C3112En();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C4407Zw();
        } else {
            A00 = new C24663l();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i10) {
        A00.A01(accessibilityEvent, i10);
    }
}
