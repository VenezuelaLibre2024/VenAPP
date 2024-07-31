package com.facebook.ads.redexgen.uinode;

import android.R;

/* renamed from: com.facebook.ads.redexgen.X.UO */
/* loaded from: assets/audience_network.dex */
public class C4068UO extends AbstractRunnableC3455KT {
    public final /* synthetic */ AnimationAnimationListenerC3572MO A00;

    public C4068UO(AnimationAnimationListenerC3572MO animationAnimationListenerC3572MO) {
        this.A00 = animationAnimationListenerC3572MO;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        this.A00.A00.finish(3);
        this.A00.A00.A0J().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
