package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.37 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC242737 {
    public static final View.AccessibilityDelegate A01;
    public static final C242636 A02;
    public final View.AccessibilityDelegate A00 = A02.A00(this);

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            A02 = new C4412a2();
        } else {
            A02 = new C242636();
        }
        A01 = new View.AccessibilityDelegate();
    }

    public final View.AccessibilityDelegate A00() {
        return this.A00;
    }

    public final C24753u A01(View view) {
        return A02.A01(A01, view);
    }

    public final void A02(View view, int i10) {
        A01.sendAccessibilityEvent(view, i10);
    }

    public final void A03(View view, AccessibilityEvent accessibilityEvent) {
        A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final void A04(View view, AccessibilityEvent accessibilityEvent) {
        A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public final boolean A05(View view, AccessibilityEvent accessibilityEvent) {
        return A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean A06(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void A07(View view, AccessibilityEvent accessibilityEvent) {
        A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A08(View view, C24733s c24733s) {
        A01.onInitializeAccessibilityNodeInfo(view, c24733s.A0M());
    }

    public boolean A09(View view, int i10, Bundle bundle) {
        return A02.A02(A01, view, i10, bundle);
    }
}
