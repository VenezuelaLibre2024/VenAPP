package com.facebook.ads.redexgen.uinode;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Sk */
/* loaded from: assets/audience_network.dex */
public class C3966Sk extends AnimationAnimationListenerC3535Ln {
    public final /* synthetic */ C3965Sj A00;

    public C3966Sk(C3965Sj c3965Sj) {
        this.A00 = c3965Sj;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnimationAnimationListenerC3535Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC3536Lo.A0H(this.A00.A01);
        this.A00.A00.ABu();
    }
}
