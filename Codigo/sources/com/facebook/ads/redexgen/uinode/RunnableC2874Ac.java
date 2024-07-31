package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ac */
/* loaded from: assets/audience_network.dex */
public class RunnableC2874Ac implements Runnable {
    public final /* synthetic */ C2880Ai A00;
    public final /* synthetic */ C2910BC A01;

    public RunnableC2874Ac(C2880Ai c2880Ai, C2910BC c2910bc) {
        this.A00 = c2880Ai;
        this.A01 = c2910bc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2881Aj interfaceC2881Aj;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC2881Aj = this.A00.A01;
            interfaceC2881Aj.AAq(this.A01);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
