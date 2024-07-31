package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ah */
/* loaded from: assets/audience_network.dex */
public class RunnableC2879Ah implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2880Ai A01;

    public RunnableC2879Ah(C2880Ai c2880Ai, int i10) {
        this.A01 = c2880Ai;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2881Aj interfaceC2881Aj;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC2881Aj = this.A01.A01;
            interfaceC2881Aj.AAs(this.A00);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
