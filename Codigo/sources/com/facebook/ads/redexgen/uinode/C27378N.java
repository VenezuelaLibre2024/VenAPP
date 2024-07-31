package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.8N */
/* loaded from: assets/audience_network.dex */
public class C27378N extends AbstractC3581MX {
    public final /* synthetic */ C3519LX A00;

    public C27378N(C3519LX c3519lx) {
        this.A00 = c3519lx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3582MY c3582my) {
        C3930SA c3930sa;
        boolean z10;
        Handler handler;
        boolean A0D;
        boolean z11;
        Handler handler2;
        int i10;
        c3930sa = this.A00.A01;
        if (c3930sa == null) {
            return;
        }
        z10 = this.A00.A03;
        if (z10 || c3582my.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(EnumC3840Qi.A05);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        z11 = this.A00.A02;
        if (!z11) {
            return;
        }
        handler2 = this.A00.A05;
        C3529Lh c3529Lh = new C3529Lh(this);
        i10 = this.A00.A00;
        handler2.postDelayed(c3529Lh, i10);
    }
}
