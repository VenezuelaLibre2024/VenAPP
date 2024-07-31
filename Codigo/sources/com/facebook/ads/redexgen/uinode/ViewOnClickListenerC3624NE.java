package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NE */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3624NE implements View.OnClickListener {
    public final /* synthetic */ C3629NJ A00;

    public ViewOnClickListenerC3624NE(C3629NJ c3629nj) {
        this.A00 = c3629nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3628NI interfaceC3628NI;
        InterfaceC3628NI interfaceC3628NI2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            interfaceC3628NI = this.A00.A05;
            if (interfaceC3628NI == null) {
                return;
            }
            interfaceC3628NI2 = this.A00.A05;
            interfaceC3628NI2.AB6();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
