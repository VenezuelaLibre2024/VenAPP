package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ew */
/* loaded from: assets/audience_network.dex */
public class RunnableC0903Ew implements Runnable {
    public final /* synthetic */ F1 A00;
    public final /* synthetic */ F2 A01;
    public final /* synthetic */ F3 A02;
    public final /* synthetic */ F4 A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public RunnableC0903Ew(F1 f12, F4 f42, F2 f22, F3 f32, IOException iOException, boolean z10) {
        this.A00 = f12;
        this.A03 = f42;
        this.A01 = f22;
        this.A02 = f32;
        this.A04 = iOException;
        this.A05 = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A03.AC3(this.A00.A00, this.A00.A01, this.A01, this.A02, this.A04, this.A05);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}