package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N2 implements View.OnClickListener {
    public final /* synthetic */ C2W A00;
    public final /* synthetic */ C1096Ms A01;
    public final /* synthetic */ U5 A02;

    public N2(U5 u52, C1096Ms c1096Ms, C2W c2w) {
        this.A02 = u52;
        this.A01 = c1096Ms;
        this.A00 = c2w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.ACS(this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
