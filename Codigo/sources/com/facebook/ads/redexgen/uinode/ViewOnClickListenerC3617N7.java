package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.N7 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3617N7 implements View.OnClickListener {
    public final /* synthetic */ C4048U4 A00;

    public ViewOnClickListenerC3617N7(C4048U4 c4048u4) {
        this.A00 = c4048u4;
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
