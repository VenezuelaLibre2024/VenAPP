package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.BE */
/* loaded from: assets/audience_network.dex */
public class C2912BE extends Thread {
    public final /* synthetic */ AbstractC4277Xp A00;

    public C2912BE(AbstractC4277Xp abstractC4277Xp) {
        this.A00 = abstractC4277Xp;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
