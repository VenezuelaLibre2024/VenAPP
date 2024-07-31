package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.QY */
/* loaded from: assets/audience_network.dex */
public class C3830QY extends AnimatorListenerAdapter {
    public final /* synthetic */ C3493L7 A00;

    public C3830QY(C3493L7 c3493l7) {
        this.A00 = c3493l7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
