package com.facebook.ads.redexgen.uinode;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0981Ia implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C0983Ic A01;

    public RunnableC0981Ia(C0983Ic c0983Ic, Surface surface) {
        this.A01 = c0983Ic;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0984Id interfaceC0984Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0984Id = this.A01.A01;
            interfaceC0984Id.ACt(this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
