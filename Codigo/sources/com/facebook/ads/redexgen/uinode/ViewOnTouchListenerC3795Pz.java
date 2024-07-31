package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pz */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC3795Pz implements View.OnTouchListener {
    public final /* synthetic */ C3796Q0 A00;

    public ViewOnTouchListenerC3795Pz(C3796Q0 c3796q0) {
        this.A00 = c3796q0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC3369J2 interfaceC3369J2;
        AbstractC4476b5 abstractC4476b5;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C3796Q0.A00(this.A00);
            interfaceC3369J2 = this.A00.A06;
            abstractC4476b5 = this.A00.A03;
            interfaceC3369J2.A9u(abstractC4476b5.A12(), new C3654Ni().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
