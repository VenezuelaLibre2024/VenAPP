package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mt */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3603Mt implements View.OnClickListener {
    public final /* synthetic */ C4050U6 A00;

    public ViewOnClickListenerC3603Mt(C4050U6 c4050u6) {
        this.A00 = c4050u6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A4M();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
