package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.IX */
/* loaded from: assets/audience_network.dex */
public class RunnableC3338IX implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C3343Ic A01;

    public RunnableC3338IX(C3343Ic c3343Ic, Format format) {
        this.A01 = c3343Ic;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3344Id interfaceC3344Id;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3344Id = this.A01.A01;
            interfaceC3344Id.ADa(this.A00);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
