package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.QD */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC3809QD implements View.OnTouchListener {
    public final /* synthetic */ C3930SA A00;

    public ViewOnTouchListenerC3809QD(C3930SA c3930sa) {
        this.A00 = c3930sa;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C27668r c27668r;
        c27668r = this.A00.A0B;
        c27668r.A02(new C3582MY(view, motionEvent));
        return false;
    }
}
