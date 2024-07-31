package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.N0 */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3610N0 implements View.OnClickListener {
    public final /* synthetic */ C3602Ms A00;
    public final /* synthetic */ C4049U5 A01;

    public ViewOnClickListenerC3610N0(C4049U5 c4049u5, C3602Ms c3602Ms) {
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
            this.A01.A0B.A9O();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
