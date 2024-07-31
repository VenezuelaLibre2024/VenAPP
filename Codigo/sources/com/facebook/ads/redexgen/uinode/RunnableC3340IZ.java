package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.IZ */
/* loaded from: assets/audience_network.dex */
public class RunnableC3340IZ implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C3343Ic A04;

    public RunnableC3340IZ(C3343Ic c3343Ic, int i10, int i11, int i12, float f10) {
        this.A04 = c3343Ic;
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3344Id interfaceC3344Id;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3344Id = this.A04.A01;
            interfaceC3344Id.ADf(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
