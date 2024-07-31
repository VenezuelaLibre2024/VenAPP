package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mk */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3594Mk implements View.OnClickListener {
    public final /* synthetic */ C3597Mn A00;

    public ViewOnClickListenerC3594Mk(C3597Mn c3597Mn) {
        this.A00 = c3597Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        InterfaceC3600Mq interfaceC3600Mq;
        InterfaceC3600Mq interfaceC3600Mq2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A05;
            if (z10) {
                interfaceC3600Mq2 = this.A00.A04;
                interfaceC3600Mq2.A4L();
            } else {
                interfaceC3600Mq = this.A00.A04;
                interfaceC3600Mq.A4M();
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
