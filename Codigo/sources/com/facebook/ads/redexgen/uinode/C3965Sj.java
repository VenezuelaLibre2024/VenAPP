package com.facebook.ads.redexgen.uinode;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Sj */
/* loaded from: assets/audience_network.dex */
public class C3965Sj extends AbstractRunnableC3455KT {
    public final /* synthetic */ InterfaceC3775Pf A00;
    public final /* synthetic */ C3776Pg A01;

    public C3965Sj(C3776Pg c3776Pg, InterfaceC3775Pf interfaceC3775Pf) {
        this.A01 = c3776Pg;
        this.A00 = interfaceC3775Pf;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C3966Sk(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
