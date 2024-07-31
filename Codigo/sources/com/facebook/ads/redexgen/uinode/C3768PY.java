package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.PY */
/* loaded from: assets/audience_network.dex */
public class C3768PY extends AnimatorListenerAdapter {
    public static String[] A02 = {"665X2CVNVi5qi0mjwkQllZ1Z3hi7SqJ", "IxMbBgN5orcIqYb5gE7I2VSAtMRKiR19", "DUuEpa5mCFfr8tNdbIs12A8n692GEBy4", "BCx81yYWcJIFbJYbIPtGYr5Yts79gdA8", "TuoPSsX0Ttr7GVLKV65Uo8NHw92QaFBx", "DISqui5OzmKtzneiZfMM3I4nAphI7c5A", "RGs1eSEzkCCuxrcdmM0vBsAuPUV1dHLM", "i2aTxnVrgF4AF1SiY0ePTGr2MrnzxiND"};
    public final /* synthetic */ C3979Sx A00;
    public final /* synthetic */ boolean A01;

    public C3768PY(C3979Sx c3979Sx, boolean z10) {
        this.A00 = c3979Sx;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3722Oo c3722Oo;
        C4045U1 c4045u1;
        C4045U1 c4045u12;
        super.onAnimationEnd(animator);
        c3722Oo = this.A00.A0H;
        c3722Oo.setTranslationY(0.0f);
        this.A00.A0W();
        if (this.A01) {
            return;
        }
        c4045u1 = this.A00.A0G;
        if (c4045u1 == null) {
            return;
        }
        c4045u12 = this.A00.A0G;
        String[] strArr = A02;
        if (strArr[2].charAt(0) != strArr[5].charAt(0)) {
            throw new RuntimeException();
        }
        A02[7] = "YuVJDdeMntZwiATJvQeG4uMSFeQioDy3";
        c4045u12.destroy();
    }
}
