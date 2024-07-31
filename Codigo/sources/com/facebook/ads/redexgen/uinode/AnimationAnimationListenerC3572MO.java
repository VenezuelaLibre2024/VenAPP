package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.MO */
/* loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC3572MO implements Animation.AnimationListener {
    public final /* synthetic */ C25735V A00;
    public final /* synthetic */ AbstractC4065UL A01;
    public final /* synthetic */ AbstractC4065UL A02;

    public AnimationAnimationListenerC3572MO(AbstractC4065UL abstractC4065UL, AbstractC4065UL abstractC4065UL2, C25735V c25735v) {
        this.A01 = abstractC4065UL;
        this.A02 = abstractC4065UL2;
        this.A00 = c25735v;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        AbstractC3536Lo.A0H(this.A02);
        new Handler().postDelayed(new C4068UO(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
