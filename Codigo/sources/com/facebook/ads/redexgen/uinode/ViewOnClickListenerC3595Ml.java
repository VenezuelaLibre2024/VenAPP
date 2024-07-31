package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ml */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3595Ml implements View.OnClickListener {
    public final /* synthetic */ C3597Mn A00;

    public ViewOnClickListenerC3595Ml(C3597Mn c3597Mn) {
        this.A00 = c3597Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3600Mq interfaceC3600Mq;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3600Mq = this.A00.A04;
            interfaceC3600Mq.A9N();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
