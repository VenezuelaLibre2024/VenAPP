package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class IV implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C0983Ic A01;

    public IV(C0983Ic c0983Ic, BC bc2) {
        this.A01 = c0983Ic;
        this.A00 = bc2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0984Id interfaceC0984Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0984Id = this.A01.A01;
            interfaceC0984Id.ADW(this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
