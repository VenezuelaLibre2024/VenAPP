package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1224Rq implements Runnable {
    public final /* synthetic */ C0966Hl A00;

    public RunnableC1224Rq(C0966Hl c0966Hl) {
        this.A00 = c0966Hl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            C0966Hl.A03(this.A00);
            throw null;
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
