package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1089Ml implements View.OnClickListener {
    public final /* synthetic */ C1091Mn A00;

    public ViewOnClickListenerC1089Ml(C1091Mn c1091Mn) {
        this.A00 = c1091Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1094Mq interfaceC1094Mq;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1094Mq = this.A00.A04;
            interfaceC1094Mq.A9N();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
