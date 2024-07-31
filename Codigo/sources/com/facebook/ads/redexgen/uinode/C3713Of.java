package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Of */
/* loaded from: assets/audience_network.dex */
public class C3713Of extends AnimatorListenerAdapter {
    public final /* synthetic */ C4011TT A00;
    public final /* synthetic */ boolean A01;

    public C3713Of(C4011TT c4011tt, boolean z10) {
        this.A00 = c4011tt;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3722Oo c3722Oo;
        C3451KP c3451kp;
        C3451KP c3451kp2;
        C4045U1 c4045u1;
        C4045U1 c4045u12;
        super.onAnimationEnd(animator);
        c3722Oo = this.A00.A0M;
        c3722Oo.setTranslationY(0.0f);
        this.A00.A0U();
        if (!this.A01) {
            c4045u1 = this.A00.A0J;
            if (c4045u1 != null) {
                c4045u12 = this.A00.A0J;
                c4045u12.destroy();
            }
        }
        c3451kp = this.A00.A0g;
        if (c3451kp == null) {
            return;
        }
        c3451kp2 = this.A00.A0g;
        c3451kp2.setVisibility(this.A01 ? 8 : 0);
    }
}
