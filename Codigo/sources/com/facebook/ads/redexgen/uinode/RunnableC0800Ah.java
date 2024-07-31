package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0800Ah implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0801Ai A01;

    public RunnableC0800Ah(C0801Ai c0801Ai, int i10) {
        this.A01 = c0801Ai;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0802Aj interfaceC0802Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0802Aj = this.A01.A01;
            interfaceC0802Aj.AAs(this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
