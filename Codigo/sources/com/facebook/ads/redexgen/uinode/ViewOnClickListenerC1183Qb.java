package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1183Qb implements View.OnClickListener {
    public final /* synthetic */ C1048Kw A00;

    public ViewOnClickListenerC1183Qb(C1048Kw c1048Kw) {
        this.A00 = c1048Kw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JA ja2;
        C1399Yn c1399Yn;
        SA sa2;
        boolean A07;
        SA sa3;
        SA sa4;
        if (KL.A02(this)) {
            return;
        }
        try {
            ja2 = this.A00.A03;
            ja2.A04(J9.A0d, null);
            c1399Yn = this.A00.A02;
            c1399Yn.A0E().A3B();
            sa2 = this.A00.A00;
            if (sa2 != null) {
                A07 = this.A00.A07();
                if (A07) {
                    sa4 = this.A00.A00;
                    sa4.setVolume(1.0f);
                } else {
                    sa3 = this.A00.A00;
                    sa3.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
