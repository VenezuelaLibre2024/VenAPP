package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06785c {
    public static C0S A00(Context context, InterfaceC07287h interfaceC07287h) {
        return A01(context, interfaceC07287h, null);
    }

    public static C0S A01(Context context, InterfaceC07287h interfaceC07287h, String str) {
        C1398Ym sdkContext = A09(context);
        C0W A77 = interfaceC07287h.A77(sdkContext);
        if (A77 != null) {
            return str != null ? A77.AAJ(str) : A77.AAI();
        }
        return new C1534bb();
    }

    public static C1399Yn A02(Activity activity) {
        return new C1399Yn(activity, (InterfaceC07287h) A0A(), A00(activity, A0A()));
    }

    public static C1399Yn A03(Context context) {
        return new C1399Yn(context, A0A(), new C1534bb());
    }

    public static C1399Yn A04(Context context) {
        if (C0988Ih.A0r(context)) {
            return new C1399Yn(context, A0A(), A00(context, A0A()));
        }
        return A03(context);
    }

    public static C1399Yn A05(Context context, String str) {
        return new C1399Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1399Yn A06(Context context, String str) {
        return new C1399Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1399Yn A07(Context context, String str) {
        return new C1399Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static EQ A08(Context context) {
        return new EQ(context, A0A(), A0A().A77(A09(context)));
    }

    public static C1398Ym A09(Context context) {
        return new C1398Ym(context, A0A());
    }

    public static synchronized YL A0A() {
        YL A02;
        synchronized (C06785c.class) {
            A02 = YL.A02();
        }
        return A02;
    }
}
