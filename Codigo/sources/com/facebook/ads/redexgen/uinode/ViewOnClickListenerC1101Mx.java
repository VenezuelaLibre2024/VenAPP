package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mx */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1101Mx implements View.OnClickListener {
    public final /* synthetic */ U5 A00;

    public ViewOnClickListenerC1101Mx(U5 u52) {
        this.A00 = u52;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8P();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
