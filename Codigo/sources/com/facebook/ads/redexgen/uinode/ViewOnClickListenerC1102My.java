package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.My */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1102My implements View.OnClickListener {
    public final /* synthetic */ C1096Ms A00;
    public final /* synthetic */ U5 A01;

    public ViewOnClickListenerC1102My(U5 u52, C1096Ms c1096Ms) {
        this.A01 = u52;
        this.A00 = c1096Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ACI(C2U.A03);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
