package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qx */
/* loaded from: assets/audience_network.dex */
public class RunnableC3855Qx implements Runnable {
    public final /* synthetic */ C3858R0 A00;

    public RunnableC3855Qx(C3858R0 c3858r0) {
        this.A00 = c3858r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            handler = this.A00.A04;
            handler.removeCallbacks(this);
            handler2 = this.A00.A04;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
