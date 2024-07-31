package com.facebook.ads.redexgen.uinode;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1041Kp {
    public static final C1041Kp A04 = new C1041Kp(new C1298Um(), new C1297Ul());
    public final InterfaceC1040Ko A02;
    public final InterfaceC1056Le A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C1041Kp(InterfaceC1056Le interfaceC1056Le, InterfaceC1040Ko interfaceC1040Ko) {
        this.A03 = interfaceC1056Le;
        this.A02 = interfaceC1040Ko;
    }

    public static C1041Kp A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A50();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A7G();
        boolean z10 = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C1041Kp.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A50() - this.A00 >= 1000) {
                z10 = false;
            }
            return z10;
        }
    }
}
