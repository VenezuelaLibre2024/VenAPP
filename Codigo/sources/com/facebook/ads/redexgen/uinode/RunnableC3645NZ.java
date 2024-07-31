package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.NZ */
/* loaded from: assets/audience_network.dex */
public class RunnableC3645NZ implements Runnable {
    public final /* synthetic */ C3646Na A00;
    public final /* synthetic */ InterfaceC3647Nb A01;

    public RunnableC3645NZ(C3646Na c3646Na, InterfaceC3647Nb interfaceC3647Nb) {
        this.A00 = c3646Na;
        this.A01 = interfaceC3647Nb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A01.AAn();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
