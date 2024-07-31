package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N4 implements View.OnClickListener {
    public final /* synthetic */ N6 A00;

    public N4(N6 n62) {
        this.A00 = n62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1094Mq interfaceC1094Mq;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1094Mq = this.A00.A02;
            interfaceC1094Mq.A8P();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
