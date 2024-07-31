package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0799Ag implements Runnable {
    public final /* synthetic */ C0801Ai A00;
    public final /* synthetic */ BC A01;

    public RunnableC0799Ag(C0801Ai c0801Ai, BC bc2) {
        this.A00 = c0801Ai;
        this.A01 = bc2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0802Aj interfaceC0802Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            interfaceC0802Aj = this.A00.A01;
            interfaceC0802Aj.AAp(this.A01);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
