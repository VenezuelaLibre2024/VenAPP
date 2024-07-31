package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Rq */
/* loaded from: assets/audience_network.dex */
public class RunnableC3910Rq implements Runnable {
    public final /* synthetic */ C3292Hl A00;

    public RunnableC3910Rq(C3292Hl c3292Hl) {
        this.A00 = c3292Hl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            C3292Hl.A03(this.A00);
            throw null;
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
