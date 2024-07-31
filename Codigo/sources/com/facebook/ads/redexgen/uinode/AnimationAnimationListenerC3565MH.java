package com.facebook.ads.redexgen.uinode;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.MH */
/* loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC3565MH implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC2940Bi A00;

    public AnimationAnimationListenerC3565MH(ViewOnClickListenerC2940Bi viewOnClickListenerC2940Bi) {
        this.A00 = viewOnClickListenerC2940Bi;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((C4072UT) this.A00).A07.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
