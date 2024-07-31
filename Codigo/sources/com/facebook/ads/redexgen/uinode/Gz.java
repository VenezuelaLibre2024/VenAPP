package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class Gz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ W1 A03;

    public Gz(W1 w12, int i10, long j10, long j11) {
        this.A03 = w12;
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0944Go interfaceC0944Go;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0944Go = this.A03.A07;
            interfaceC0944Go.AAw(this.A00, this.A02, this.A01);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
