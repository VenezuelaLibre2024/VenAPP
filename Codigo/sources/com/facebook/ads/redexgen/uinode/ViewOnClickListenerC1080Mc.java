package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1080Mc implements View.OnClickListener {
    public final /* synthetic */ UA A00;

    public ViewOnClickListenerC1080Mc(UA ua2) {
        this.A00 = ua2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1082Me interfaceC1082Me;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1082Me = this.A00.A07;
            interfaceC1082Me.ABX();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
