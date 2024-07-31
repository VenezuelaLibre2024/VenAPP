package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oz */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC3733Oz implements View.OnTouchListener {
    public final /* synthetic */ C2901B3 A00;

    public ViewOnTouchListenerC3733Oz(C2901B3 c2901b3) {
        this.A00 = c2901b3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C3737P3 c3737p3;
        c3737p3 = this.A00.A0E;
        c3737p3.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
