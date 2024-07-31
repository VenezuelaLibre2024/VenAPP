package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class NZ implements Runnable {
    public final /* synthetic */ C1104Na A00;
    public final /* synthetic */ InterfaceC1105Nb A01;

    public NZ(C1104Na c1104Na, InterfaceC1105Nb interfaceC1105Nb) {
        this.A00 = c1104Na;
        this.A01 = interfaceC1105Nb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.AAn();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
