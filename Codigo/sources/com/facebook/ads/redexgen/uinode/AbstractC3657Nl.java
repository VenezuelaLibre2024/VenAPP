package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nl */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3657Nl {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC3656Nk viewOnClickListenerC3656Nk = new ViewOnClickListenerC3656Nk(onClickListener);
            view.setOnClickListener(viewOnClickListenerC3656Nk);
            view.setOnTouchListener(new ViewOnTouchListenerC3655Nj(viewOnClickListenerC3656Nk));
        }
    }
}
