package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.PZ */
/* loaded from: assets/audience_network.dex */
public class RunnableC3769PZ implements Runnable {
    public final /* synthetic */ C3979Sx A00;

    public RunnableC3769PZ(C3979Sx c3979Sx) {
        this.A00 = c3979Sx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0K;
            if (!z10) {
                return;
            }
            this.A00.A0Q();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
