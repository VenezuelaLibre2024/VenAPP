package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ei */
/* loaded from: assets/audience_network.dex */
public class RunnableC3107Ei implements Runnable {
    public final /* synthetic */ C2971CD A00;

    public RunnableC3107Ei(C2971CD c2971cd) {
        this.A00 = c2971cd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
