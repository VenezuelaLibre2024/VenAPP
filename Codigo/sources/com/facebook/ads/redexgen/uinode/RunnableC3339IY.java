package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.IY */
/* loaded from: assets/audience_network.dex */
public class RunnableC3339IY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C3343Ic A02;

    public RunnableC3339IY(C3343Ic c3343Ic, int i10, long j10) {
        this.A02 = c3343Ic;
        this.A00 = i10;
        this.A01 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3344Id interfaceC3344Id;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3344Id = this.A02.A01;
            interfaceC3344Id.ABN(this.A00, this.A01);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
