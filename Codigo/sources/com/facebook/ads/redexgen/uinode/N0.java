package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N0 implements View.OnClickListener {
    public final /* synthetic */ C1096Ms A00;
    public final /* synthetic */ U5 A01;

    public N0(U5 u52, C1096Ms c1096Ms) {
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
            this.A01.A0B.A9O();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
