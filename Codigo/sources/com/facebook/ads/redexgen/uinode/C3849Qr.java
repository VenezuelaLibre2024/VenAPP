package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qr */
/* loaded from: assets/audience_network.dex */
public class C3849Qr implements Animator.AnimatorListener {
    public final /* synthetic */ C3437KA A00;

    public C3849Qr(C3437KA c3437ka) {
        this.A00 = c3437ka;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = EnumC3840Qi.A05;
        view = this.A00.A05;
        AbstractC3536Lo.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
