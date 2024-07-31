package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pz */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1181Pz implements View.OnTouchListener {
    public final /* synthetic */ Q0 A00;

    public ViewOnTouchListenerC1181Pz(Q0 q02) {
        this.A00 = q02;
    }

    public /* synthetic */ ViewOnTouchListenerC1181Pz(Q0 q02, C9O c9o) {
        this(q02);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        J2 j22;
        AbstractC1502b5 abstractC1502b5;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            Q0.A00(this.A00);
            j22 = this.A00.A06;
            abstractC1502b5 = this.A00.A03;
            j22.A9u(abstractC1502b5.A12(), new C1112Ni().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
