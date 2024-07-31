package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1088Mk implements View.OnClickListener {
    public final /* synthetic */ C1091Mn A00;

    public ViewOnClickListenerC1088Mk(C1091Mn c1091Mn) {
        this.A00 = c1091Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        InterfaceC1094Mq interfaceC1094Mq;
        InterfaceC1094Mq interfaceC1094Mq2;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A05;
            if (z10) {
                interfaceC1094Mq2 = this.A00.A04;
                interfaceC1094Mq2.A4L();
            } else {
                interfaceC1094Mq = this.A00.A04;
                interfaceC1094Mq.A4M();
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
