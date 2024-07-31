package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.N4 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3614N4 implements View.OnClickListener {
    public final /* synthetic */ C3616N6 A00;

    public ViewOnClickListenerC3614N4(C3616N6 c3616n6) {
        this.A00 = c3616n6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3600Mq interfaceC3600Mq;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3600Mq = this.A00.A02;
            interfaceC3600Mq.A8P();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
