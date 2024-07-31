package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class PZ implements Runnable {
    public final /* synthetic */ C1257Sx A00;

    public PZ(C1257Sx c1257Sx) {
        this.A00 = c1257Sx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0K;
            if (!z10) {
                return;
            }
            this.A00.A0Q();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
