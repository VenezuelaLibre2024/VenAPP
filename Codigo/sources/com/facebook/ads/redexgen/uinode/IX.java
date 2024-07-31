package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public class IX implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C0983Ic A01;

    public IX(C0983Ic c0983Ic, Format format) {
        this.A01 = c0983Ic;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0984Id interfaceC0984Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0984Id = this.A01.A01;
            interfaceC0984Id.ADa(this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
