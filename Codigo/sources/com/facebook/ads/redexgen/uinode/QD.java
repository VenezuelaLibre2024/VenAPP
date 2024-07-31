package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QD implements View.OnTouchListener {
    public final /* synthetic */ SA A00;

    public QD(SA sa2) {
        this.A00 = sa2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C07608r c07608r;
        c07608r = this.A00.A0B;
        c07608r.A02(new MY(view, motionEvent));
        return false;
    }
}
