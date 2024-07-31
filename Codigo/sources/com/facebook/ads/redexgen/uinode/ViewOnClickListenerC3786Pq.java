package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pq */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3786Pq implements View.OnClickListener {
    public final /* synthetic */ C3787Pr A00;

    public ViewOnClickListenerC3786Pq(C3787Pr c3787Pr) {
        this.A00 = c3787Pr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C26707C c26707c;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            c26707c = this.A00.A05;
            c26707c.performClick();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
