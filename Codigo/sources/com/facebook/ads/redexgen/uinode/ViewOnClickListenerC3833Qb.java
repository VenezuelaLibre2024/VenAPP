package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qb */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3833Qb implements View.OnClickListener {
    public final /* synthetic */ C3482Kw A00;

    public ViewOnClickListenerC3833Qb(C3482Kw c3482Kw) {
        this.A00 = c3482Kw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3377JA c3377ja;
        C4337Yn c4337Yn;
        C3930SA c3930sa;
        boolean A07;
        C3930SA c3930sa2;
        C3930SA c3930sa3;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            c3377ja = this.A00.A03;
            c3377ja.A04(EnumC3376J9.A0d, null);
            c4337Yn = this.A00.A02;
            c4337Yn.A0E().A3B();
            c3930sa = this.A00.A00;
            if (c3930sa != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c3930sa3 = this.A00.A00;
                    c3930sa3.setVolume(1.0f);
                } else {
                    c3930sa2 = this.A00.A00;
                    c3930sa2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
