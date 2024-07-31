package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ej */
/* loaded from: assets/audience_network.dex */
public class RunnableC3108Ej implements Runnable {
    public final /* synthetic */ C2971CD A00;

    public RunnableC3108Ej(C2971CD c2971cd) {
        this.A00 = c2971cd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        InterfaceC4193WQ interfaceC4193WQ;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0G;
            if (!z10) {
                interfaceC4193WQ = this.A00.A08;
                interfaceC4193WQ.ABC(this.A00);
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
