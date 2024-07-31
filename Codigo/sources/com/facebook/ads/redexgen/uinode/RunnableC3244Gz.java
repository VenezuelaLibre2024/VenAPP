package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Gz */
/* loaded from: assets/audience_network.dex */
public class RunnableC3244Gz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C4168W1 A03;

    public RunnableC3244Gz(C4168W1 c4168w1, int i10, long j10, long j11) {
        this.A03 = c4168w1;
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3233Go interfaceC3233Go;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3233Go = this.A03.A07;
            interfaceC3233Go.AAw(this.A00, this.A02, this.A01);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
