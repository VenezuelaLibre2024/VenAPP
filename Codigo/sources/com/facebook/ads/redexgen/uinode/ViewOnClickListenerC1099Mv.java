package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mv */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1099Mv implements View.OnClickListener {
    public final /* synthetic */ U6 A00;

    public ViewOnClickListenerC1099Mv(U6 u62) {
        this.A00 = u62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.ACI(C2U.A05);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}