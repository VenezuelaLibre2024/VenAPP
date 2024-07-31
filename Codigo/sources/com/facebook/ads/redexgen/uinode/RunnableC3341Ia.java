package com.facebook.ads.redexgen.uinode;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.Ia */
/* loaded from: assets/audience_network.dex */
public class RunnableC3341Ia implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C3343Ic A01;

    public RunnableC3341Ia(C3343Ic c3343Ic, Surface surface) {
        this.A01 = c3343Ic;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3344Id interfaceC3344Id;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3344Id = this.A01.A01;
            interfaceC3344Id.ACt(this.A00);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
