package com.facebook.ads.redexgen.uinode;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kp */
/* loaded from: assets/audience_network.dex */
public final class C3475Kp {
    public static final C3475Kp A04 = new C3475Kp(new C4091Um(), new C4090Ul());
    public final InterfaceC3474Ko A02;
    public final InterfaceC3526Le A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C3475Kp(InterfaceC3526Le interfaceC3526Le, InterfaceC3474Ko interfaceC3474Ko) {
        this.A03 = interfaceC3526Le;
        this.A02 = interfaceC3474Ko;
    }

    public static C3475Kp A00() {
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
        synchronized (C3475Kp.class) {
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
