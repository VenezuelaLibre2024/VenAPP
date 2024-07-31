package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nz */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3671Nz implements View.OnClickListener {
    public final /* synthetic */ C3673O1 A00;

    public ViewOnClickListenerC3671Nz(C3673O1 c3673o1) {
        this.A00 = c3673o1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
