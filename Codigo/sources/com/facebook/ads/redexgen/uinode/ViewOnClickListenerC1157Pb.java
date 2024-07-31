package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1157Pb implements View.OnClickListener {
    public final /* synthetic */ C1257Sx A00;

    public ViewOnClickListenerC1157Pb(C1257Sx c1257Sx) {
        this.A00 = c1257Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        AbstractC05560h abstractC05560h;
        Handler handler;
        Runnable runnable;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0K;
            if (!z10) {
                this.A00.A0L = true;
                C1257Sx c1257Sx = this.A00;
                abstractC05560h = c1257Sx.A0T;
                c1257Sx.A0h(((C0912Ff) abstractC05560h).A0G().toString());
                if (((PQ) this.A00).A05.A0H() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0j;
                    handler.postDelayed(runnable, ((PQ) this.A00).A05.A0H());
                }
            }
            C1257Sx c1257Sx2 = this.A00;
            z11 = c1257Sx2.A0K;
            c1257Sx2.A0k(z11 ? false : true);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
