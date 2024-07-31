package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.N2 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3612N2 implements View.OnClickListener {
    public final /* synthetic */ C23912W A00;
    public final /* synthetic */ C3602Ms A01;
    public final /* synthetic */ C4049U5 A02;

    public ViewOnClickListenerC3612N2(C4049U5 c4049u5, C3602Ms c3602Ms, C23912W c23912w) {
        this.A02 = c4049u5;
        this.A01 = c3602Ms;
        this.A00 = c23912w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.ACS(this.A00);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
