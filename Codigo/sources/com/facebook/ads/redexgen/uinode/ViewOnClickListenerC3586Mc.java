package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mc */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3586Mc implements View.OnClickListener {
    public final /* synthetic */ C4054UA A00;

    public ViewOnClickListenerC3586Mc(C4054UA c4054ua) {
        this.A00 = c4054ua;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3588Me interfaceC3588Me;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3588Me = this.A00.A07;
            interfaceC3588Me.ABX();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
