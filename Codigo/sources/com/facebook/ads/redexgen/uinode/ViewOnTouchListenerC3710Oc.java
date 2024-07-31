package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oc */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC3710Oc implements View.OnTouchListener {
    public final /* synthetic */ C4011TT A00;

    public ViewOnTouchListenerC3710Oc(C4011TT c4011tt) {
        this.A00 = c4011tt;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                f10 = this.A00.A00;
                if (f10 >= browserFinalY) {
                    return true;
                }
                this.A00.A0g(false);
                return true;
            default:
                return true;
        }
    }
}
