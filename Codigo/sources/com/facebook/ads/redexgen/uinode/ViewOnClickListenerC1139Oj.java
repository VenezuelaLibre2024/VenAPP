package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1139Oj implements View.OnClickListener {
    public final /* synthetic */ TT A00;

    public ViewOnClickListenerC1139Oj(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        AbstractC05560h abstractC05560h;
        AbstractC1502b5 abstractC1502b5;
        Handler handler;
        Runnable runnable;
        AbstractC1502b5 abstractC1502b52;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0O;
            if (!z10) {
                this.A00.A0P = true;
                TT tt = this.A00;
                abstractC05560h = tt.A0c;
                tt.A0d(((C0912Ff) abstractC05560h).A0G().toString());
                abstractC1502b5 = this.A00.A0G;
                if (abstractC1502b5.A0H() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0i;
                    abstractC1502b52 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC1502b52.A0H());
                }
            }
            TT tt2 = this.A00;
            z11 = tt2.A0O;
            tt2.A0g(z11 ? false : true);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
