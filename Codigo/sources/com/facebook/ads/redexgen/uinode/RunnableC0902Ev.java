package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ev */
/* loaded from: assets/audience_network.dex */
public class RunnableC0902Ev implements Runnable {
    public final /* synthetic */ F1 A00;
    public final /* synthetic */ F2 A01;
    public final /* synthetic */ F3 A02;
    public final /* synthetic */ F4 A03;

    public RunnableC0902Ev(F1 f12, F4 f42, F2 f22, F3 f32) {
        this.A00 = f12;
        this.A03 = f42;
        this.A01 = f22;
        this.A02 = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A03.ABy(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}