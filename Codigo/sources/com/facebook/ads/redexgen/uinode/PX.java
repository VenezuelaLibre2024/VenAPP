package com.facebook.ads.redexgen.uinode;

import android.animation.ValueAnimator;

/* loaded from: assets/audience_network.dex */
public class PX implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1257Sx A00;

    public PX(C1257Sx c1257Sx) {
        this.A00 = c1257Sx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SA sa2;
        SA sa3;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        sa2 = this.A00.A0Z;
        sa2.getLayoutParams().height = num.intValue();
        sa3 = this.A00.A0Z;
        sa3.requestLayout();
    }
}
