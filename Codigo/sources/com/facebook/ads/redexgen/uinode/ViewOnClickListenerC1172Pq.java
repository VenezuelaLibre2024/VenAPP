package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1172Pq implements View.OnClickListener {
    public final /* synthetic */ C1173Pr A00;

    public ViewOnClickListenerC1172Pq(C1173Pr c1173Pr) {
        this.A00 = c1173Pr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7C c7c;
        if (KL.A02(this)) {
            return;
        }
        try {
            c7c = this.A00.A05;
            c7c.performClick();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
