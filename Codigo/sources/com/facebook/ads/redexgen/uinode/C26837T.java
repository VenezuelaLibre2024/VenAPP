package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.7T */
/* loaded from: assets/audience_network.dex */
public class C26837T extends AbstractC3581MX {
    public final /* synthetic */ C3493L7 A00;

    public C26837T(C3493L7 c3493l7) {
        this.A00 = c3493l7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3582MY c3582my) {
        C3930SA c3930sa;
        Handler handler;
        c3930sa = this.A00.A01;
        if (c3930sa == null || c3582my.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C3829QX(this));
    }
}
