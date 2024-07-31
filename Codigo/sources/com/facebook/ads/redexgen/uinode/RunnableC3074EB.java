package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.EB */
/* loaded from: assets/audience_network.dex */
public class RunnableC3074EB implements Runnable {
    public final /* synthetic */ RunnableC3076ED A00;
    public final /* synthetic */ Throwable A01;

    public RunnableC3074EB(RunnableC3076ED runnableC3076ED, Throwable th2) {
        this.A00 = runnableC3076ED;
        this.A01 = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A0G;
        boolean A0F;
        boolean A0F2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            RunnableC3076ED runnableC3076ED = this.A00;
            Throwable th2 = this.A01;
            A0G = runnableC3076ED.A0G(1, th2 != null ? 4 : 2, th2);
            if (A0G) {
                return;
            }
            A0F = this.A00.A0F(6, 3);
            if (A0F) {
                return;
            }
            A0F2 = this.A00.A0F(7, 0);
            if (!A0F2) {
                throw new IllegalStateException();
            }
        } catch (Throwable th3) {
            AbstractC3447KL.A00(th3, this);
        }
    }
}
