package com.facebook.ads.redexgen.uinode;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Sk */
/* loaded from: assets/audience_network.dex */
public class C1244Sk extends AnimationAnimationListenerC1065Ln {
    public final /* synthetic */ C1243Sj A00;

    public C1244Sk(C1243Sj c1243Sj) {
        this.A00 = c1243Sj;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnimationAnimationListenerC1065Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC1066Lo.A0H(this.A00.A01);
        this.A00.A00.ABu();
    }
}
