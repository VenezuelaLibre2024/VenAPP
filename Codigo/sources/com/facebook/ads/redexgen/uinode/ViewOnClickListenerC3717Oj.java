package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oj */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3717Oj implements View.OnClickListener {
    public final /* synthetic */ C4011TT A00;

    public ViewOnClickListenerC3717Oj(C4011TT c4011tt) {
        this.A00 = c4011tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        AbstractC22790h abstractC22790h;
        AbstractC4476b5 abstractC4476b5;
        Handler handler;
        Runnable runnable;
        AbstractC4476b5 abstractC4476b52;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0O;
            if (!z10) {
                this.A00.A0P = true;
                C4011TT c4011tt = this.A00;
                abstractC22790h = c4011tt.A0c;
                c4011tt.A0d(((C3164Ff) abstractC22790h).A0G().toString());
                abstractC4476b5 = this.A00.A0G;
                if (abstractC4476b5.A0H() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0i;
                    abstractC4476b52 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC4476b52.A0H());
                }
            }
            C4011TT c4011tt2 = this.A00;
            z11 = c4011tt2.A0O;
            c4011tt2.A0g(z11 ? false : true);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
