package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mx */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3607Mx implements View.OnClickListener {
    public final /* synthetic */ C4049U5 A00;

    public ViewOnClickListenerC3607Mx(C4049U5 c4049u5) {
        this.A00 = c4049u5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8P();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
