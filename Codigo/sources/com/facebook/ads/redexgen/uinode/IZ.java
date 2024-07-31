package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class IZ implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C0983Ic A04;

    public IZ(C0983Ic c0983Ic, int i10, int i11, int i12, float f10) {
        this.A04 = c0983Ic;
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0984Id interfaceC0984Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0984Id = this.A04.A01;
            interfaceC0984Id.ADf(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
