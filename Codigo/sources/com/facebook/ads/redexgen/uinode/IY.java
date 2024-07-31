package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class IY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0983Ic A02;

    public IY(C0983Ic c0983Ic, int i10, long j10) {
        this.A02 = c0983Ic;
        this.A00 = i10;
        this.A01 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0984Id interfaceC0984Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0984Id = this.A02.A01;
            interfaceC0984Id.ABN(this.A00, this.A01);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
