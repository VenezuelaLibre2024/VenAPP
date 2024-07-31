package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class IW implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0983Ic A02;
    public final /* synthetic */ String A03;

    public IW(C0983Ic c0983Ic, String str, long j10, long j11) {
        this.A02 = c0983Ic;
        this.A03 = str;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0984Id interfaceC0984Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0984Id = this.A02.A01;
            interfaceC0984Id.ADU(this.A03, this.A01, this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
