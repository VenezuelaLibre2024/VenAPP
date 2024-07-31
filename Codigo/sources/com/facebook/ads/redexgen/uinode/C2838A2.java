package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.A2 */
/* loaded from: assets/audience_network.dex */
public class C2838A2 extends AbstractC3788Ps {
    public final /* synthetic */ C3986T4 A00;

    public C2838A2(C3986T4 c3986t4) {
        this.A00 = c3986t4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3789Pt c3789Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC3762PS(this));
    }
}
