package com.facebook.ads.redexgen.uinode;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1243Sj extends KT {
    public final /* synthetic */ InterfaceC1161Pf A00;
    public final /* synthetic */ C1162Pg A01;

    public C1243Sj(C1162Pg c1162Pg, InterfaceC1161Pf interfaceC1161Pf) {
        this.A01 = c1162Pg;
        this.A00 = interfaceC1161Pf;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1244Sk(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
