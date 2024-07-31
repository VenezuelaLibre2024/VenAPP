package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.IW */
/* loaded from: assets/audience_network.dex */
public class RunnableC3337IW implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C3343Ic A02;
    public final /* synthetic */ String A03;

    public RunnableC3337IW(C3343Ic c3343Ic, String str, long j10, long j11) {
        this.A02 = c3343Ic;
        this.A03 = str;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3344Id interfaceC3344Id;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3344Id = this.A02.A01;
            interfaceC3344Id.ADU(this.A03, this.A01, this.A00);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
