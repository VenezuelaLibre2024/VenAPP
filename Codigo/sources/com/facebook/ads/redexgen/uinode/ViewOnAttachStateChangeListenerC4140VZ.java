package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.VZ */
/* loaded from: assets/audience_network.dex */
public final class ViewOnAttachStateChangeListenerC4140VZ extends AbstractC4556cY implements View.OnAttachStateChangeListener {
    public final View A00;

    public ViewOnAttachStateChangeListenerC4140VZ(View view) {
        this.A00 = view;
        view.addOnAttachStateChangeListener(this);
        if (A04()) {
            A00();
        }
    }

    public final void A03() {
        A00();
    }

    public final boolean A04() {
        return AbstractC24493T.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        A00();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        A01();
    }
}
