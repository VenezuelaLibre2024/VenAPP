package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ew */
/* loaded from: assets/audience_network.dex */
public class RunnableC3121Ew implements Runnable {
    public final /* synthetic */ C3126F1 A00;
    public final /* synthetic */ C3127F2 A01;
    public final /* synthetic */ C3128F3 A02;
    public final /* synthetic */ InterfaceC3129F4 A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public RunnableC3121Ew(C3126F1 c3126f1, InterfaceC3129F4 interfaceC3129F4, C3127F2 c3127f2, C3128F3 c3128f3, IOException iOException, boolean z10) {
        this.A00 = c3126f1;
        this.A03 = interfaceC3129F4;
        this.A01 = c3127f2;
        this.A02 = c3128f3;
        this.A04 = iOException;
        this.A05 = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A03.AC3(this.A00.A00, this.A00.A01, this.A01, this.A02, this.A04, this.A05);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
