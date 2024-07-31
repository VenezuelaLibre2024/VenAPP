package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1115Nl {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC1114Nk viewOnClickListenerC1114Nk = new ViewOnClickListenerC1114Nk(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1114Nk);
            view.setOnTouchListener(new ViewOnTouchListenerC1113Nj(viewOnClickListenerC1114Nk));
        }
    }
}
