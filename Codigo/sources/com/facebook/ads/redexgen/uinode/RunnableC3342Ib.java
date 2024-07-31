package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ib */
/* loaded from: assets/audience_network.dex */
public class RunnableC3342Ib implements Runnable {
    public final /* synthetic */ C2910BC A00;
    public final /* synthetic */ C3343Ic A01;

    public RunnableC3342Ib(C3343Ic c3343Ic, C2910BC c2910bc) {
        this.A01 = c3343Ic;
        this.A00 = c2910bc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3344Id interfaceC3344Id;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            interfaceC3344Id = this.A01.A01;
            interfaceC3344Id.ADV(this.A00);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
