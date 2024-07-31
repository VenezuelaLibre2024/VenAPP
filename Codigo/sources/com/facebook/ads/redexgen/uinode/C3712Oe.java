package com.facebook.ads.redexgen.uinode;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oe */
/* loaded from: assets/audience_network.dex */
public class C3712Oe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C4011TT A00;

    public C3712Oe(C4011TT c4011tt) {
        this.A00 = c4011tt;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        view = this.A00.A0A;
        view.getLayoutParams().height = num.intValue();
        view2 = this.A00.A0A;
        view2.requestLayout();
    }
}
