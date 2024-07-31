package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.My */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3608My implements View.OnClickListener {
    public final /* synthetic */ C3602Ms A00;
    public final /* synthetic */ C4049U5 A01;

    public ViewOnClickListenerC3608My(C4049U5 c4049u5, C3602Ms c3602Ms) {
        this.A01 = c4049u5;
        this.A00 = c3602Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ACI(EnumC23892U.A03);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
