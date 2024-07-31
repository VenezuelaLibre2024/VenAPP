package com.facebook.ads.redexgen.uinode;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.PX */
/* loaded from: assets/audience_network.dex */
public class C3767PX implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C3979Sx A00;

    public C3767PX(C3979Sx c3979Sx) {
        this.A00 = c3979Sx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C3930SA c3930sa;
        C3930SA c3930sa2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        c3930sa = this.A00.A0Z;
        c3930sa.getLayoutParams().height = num.intValue();
        c3930sa2 = this.A00.A0Z;
        c3930sa2.requestLayout();
    }
}
