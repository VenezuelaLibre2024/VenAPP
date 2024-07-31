package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.3T */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC24493T {
    public static final C24483S A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C22750d() { // from class: com.facebook.ads.redexgen.X.0U
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C22750d();
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C23111E();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C23451m();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C23962b();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            A00 = new C24383I();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C26506l();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C3130F5();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new C4411a1();
        } else {
            A00 = new C24483S();
        }
    }

    public static int A00(View view) {
        return A00.A03(view);
    }

    public static int A01(View view) {
        return A00.A04(view);
    }

    public static int A02(View view) {
        return A00.A05(view);
    }

    public static int A03(View view) {
        return A00.A06(view);
    }

    public static Display A04(View view) {
        return A00.A07(view);
    }

    public static C24653k A05(View view, C24653k c24653k) {
        return A00.A08(view, c24653k);
    }

    public static C24653k A06(View view, C24653k c24653k) {
        return A00.A09(view, c24653k);
    }

    public static void A07(View view) {
        A00.A0A(view);
    }

    public static void A08(View view) {
        A00.A0B(view);
    }

    public static void A09(View view, int i10) {
        A00.A0C(view, i10);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0D(view, drawable);
    }

    public static void A0B(View view, AbstractC242737 abstractC242737) {
        A00.A0E(view, abstractC242737);
    }

    public static void A0C(View view, InterfaceC24333D interfaceC24333D) {
        A00.A0F(view, interfaceC24333D);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j10) {
        A00.A0H(view, runnable, j10);
    }

    public static boolean A0F(View view) {
        return A00.A0K(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
