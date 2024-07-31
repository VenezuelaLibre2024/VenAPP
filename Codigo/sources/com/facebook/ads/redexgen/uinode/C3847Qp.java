package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Qp */
/* loaded from: assets/audience_network.dex */
public class C3847Qp implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C3439KC A02;

    public C3847Qp(C3439KC c3439kc, int i10, int i11) {
        this.A02 = c3439kc;
        this.A01 = i10;
        this.A00 = i11;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        EnumC3840Qi enumC3840Qi;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        C3439KC c3439kc = this.A02;
        int i11 = this.A01;
        i10 = c3439kc.A04;
        if (i11 == i10) {
            enumC3840Qi = EnumC3840Qi.A03;
        } else {
            enumC3840Qi = EnumC3840Qi.A05;
        }
        c3439kc.A01 = enumC3840Qi;
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
