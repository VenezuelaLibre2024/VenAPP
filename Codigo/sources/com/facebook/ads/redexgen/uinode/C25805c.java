package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5c */
/* loaded from: assets/audience_network.dex */
public final class C25805c {
    public static InterfaceC22640S A00(Context context, InterfaceC26957h interfaceC26957h) {
        return A01(context, interfaceC26957h, null);
    }

    public static InterfaceC22640S A01(Context context, InterfaceC26957h interfaceC26957h, String str) {
        C4336Ym sdkContext = A09(context);
        InterfaceC22680W A77 = interfaceC26957h.A77(sdkContext);
        if (A77 != null) {
            return str != null ? A77.AAJ(str) : A77.AAI();
        }
        return new C4508bb();
    }

    public static C4337Yn A02(Activity activity) {
        return new C4337Yn(activity, (InterfaceC26957h) A0A(), A00(activity, A0A()));
    }

    public static C4337Yn A03(Context context) {
        return new C4337Yn(context, A0A(), new C4508bb());
    }

    public static C4337Yn A04(Context context) {
        if (C3348Ih.A0r(context)) {
            return new C4337Yn(context, A0A(), A00(context, A0A()));
        }
        return A03(context);
    }

    public static C4337Yn A05(Context context, String str) {
        return new C4337Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C4337Yn A06(Context context, String str) {
        return new C4337Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C4337Yn A07(Context context, String str) {
        return new C4337Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C3089EQ A08(Context context) {
        return new C3089EQ(context, A0A(), A0A().A77(A09(context)));
    }

    public static C4336Ym A09(Context context) {
        return new C4336Ym(context, A0A());
    }

    public static synchronized C4309YL A0A() {
        C4309YL A02;
        synchronized (C25805c.class) {
            A02 = C4309YL.A02();
        }
        return A02;
    }
}
