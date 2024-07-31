package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3771Pb implements View.OnClickListener {
    public final /* synthetic */ C3979Sx A00;

    public ViewOnClickListenerC3771Pb(C3979Sx c3979Sx) {
        this.A00 = c3979Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        AbstractC22790h abstractC22790h;
        Handler handler;
        Runnable runnable;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0K;
            if (!z10) {
                this.A00.A0L = true;
                C3979Sx c3979Sx = this.A00;
                abstractC22790h = c3979Sx.A0T;
                c3979Sx.A0h(((C3164Ff) abstractC22790h).A0G().toString());
                if (((AbstractC3760PQ) this.A00).A05.A0H() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0j;
                    handler.postDelayed(runnable, ((AbstractC3760PQ) this.A00).A05.A0H());
                }
            }
            C3979Sx c3979Sx2 = this.A00;
            z11 = c3979Sx2.A0K;
            c3979Sx2.A0k(z11 ? false : true);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
