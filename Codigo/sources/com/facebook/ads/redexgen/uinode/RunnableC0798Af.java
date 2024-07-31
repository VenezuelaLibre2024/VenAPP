package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0798Af implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C0801Ai A03;

    public RunnableC0798Af(C0801Ai c0801Ai, int i10, long j10, long j11) {
        this.A03 = c0801Ai;
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0802Aj interfaceC0802Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0802Aj = this.A03.A01;
            interfaceC0802Aj.AAt(this.A00, this.A01, this.A02);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
