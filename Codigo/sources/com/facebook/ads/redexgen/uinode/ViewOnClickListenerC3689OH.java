package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.OH */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3689OH implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC4029Tl A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC3689OH(ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl, String str) {
        this.A00 = viewOnClickListenerC4029Tl;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
