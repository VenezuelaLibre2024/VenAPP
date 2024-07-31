package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.QX */
/* loaded from: assets/audience_network.dex */
public class C3829QX extends AnimatorListenerAdapter {
    public final /* synthetic */ C26837T A00;

    public C3829QX(C26837T c26837t) {
        this.A00 = c26837t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C3506LK(this), 2000L);
    }
}
