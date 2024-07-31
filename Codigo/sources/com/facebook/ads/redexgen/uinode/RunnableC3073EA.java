package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.EA */
/* loaded from: assets/audience_network.dex */
public class RunnableC3073EA implements Runnable {
    public final /* synthetic */ RunnableC3076ED A00;

    public RunnableC3073EA(RunnableC3076ED runnableC3076ED) {
        this.A00 = runnableC3076ED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
