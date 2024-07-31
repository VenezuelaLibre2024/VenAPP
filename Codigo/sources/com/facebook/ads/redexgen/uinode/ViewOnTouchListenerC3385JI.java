package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.JI */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC3385JI implements View.OnTouchListener {
    public final /* synthetic */ C4119VE A00;
    public final /* synthetic */ boolean A01;

    public ViewOnTouchListenerC3385JI(C4119VE c4119ve, boolean z10) {
        this.A00 = c4119ve;
        this.A01 = z10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        return true;
    }
}
