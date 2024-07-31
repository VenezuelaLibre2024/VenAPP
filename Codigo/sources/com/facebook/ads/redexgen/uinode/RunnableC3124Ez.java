package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ez */
/* loaded from: assets/audience_network.dex */
public class RunnableC3124Ez implements Runnable {
    public final /* synthetic */ C3126F1 A00;
    public final /* synthetic */ C3128F3 A01;
    public final /* synthetic */ InterfaceC3129F4 A02;

    public RunnableC3124Ez(C3126F1 c3126f1, InterfaceC3129F4 interfaceC3129F4, C3128F3 c3128f3) {
        this.A00 = c3126f1;
        this.A02 = interfaceC3129F4;
        this.A01 = c3128f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A02.ABM(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
