package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.N5 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3615N5 implements View.OnClickListener {
    public final /* synthetic */ C23912W A00;
    public final /* synthetic */ C3602Ms A01;
    public final /* synthetic */ C3616N6 A02;

    public ViewOnClickListenerC3615N5(C3616N6 c3616n6, C3602Ms c3602Ms, C23912W c23912w) {
        this.A02 = c3616n6;
        this.A01 = c3602Ms;
        this.A00 = c23912w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3600Mq interfaceC3600Mq;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC3600Mq = this.A02.A02;
            interfaceC3600Mq.ACS(this.A00);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
