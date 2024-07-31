package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Af */
/* loaded from: assets/audience_network.dex */
public class RunnableC2877Af implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C2880Ai A03;

    public RunnableC2877Af(C2880Ai c2880Ai, int i10, long j10, long j11) {
        this.A03 = c2880Ai;
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2881Aj interfaceC2881Aj;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC2881Aj = this.A03.A01;
            interfaceC2881Aj.AAt(this.A00, this.A01, this.A02);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
