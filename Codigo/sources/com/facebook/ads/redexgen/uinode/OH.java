package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OH implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1271Tl A00;
    public final /* synthetic */ String A01;

    public OH(ViewOnClickListenerC1271Tl viewOnClickListenerC1271Tl, String str) {
        this.A00 = viewOnClickListenerC1271Tl;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
