package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Es */
/* loaded from: assets/audience_network.dex */
public class RunnableC3117Es implements Runnable {
    public final /* synthetic */ C3126F1 A00;
    public final /* synthetic */ InterfaceC3129F4 A01;

    public RunnableC3117Es(C3126F1 c3126f1, InterfaceC3129F4 interfaceC3129F4) {
        this.A00 = c3126f1;
        this.A01 = interfaceC3129F4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A01.ACH(this.A00.A00, this.A00.A01);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
